package com.godtrue.annotation.simple1;

import com.godtrue.annotation.simple1.self.annotation.InitSex;
import com.godtrue.annotation.simple1.self.annotation.ValidateAge;

import java.lang.reflect.Field;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2020-01-19
 */
public class TestInitParam {
    public static void main(String[] args) throws IllegalAccessException{
        /**
         * 实例化一个用户对象
         */
        User user = new User();

        /**
         * 初始化用户性别
         */
        initUserSex(user);

        /**
         * 校验用户年龄且打印校验结果
         */
        printResult(checkUserAge(user));

        /**
         * 重新设置用户年龄
         */
        user.setAge(21);

        /**
         * 校验用户年龄且打印校验结果
         */
        printResult(checkUserAge(user));
    }

    private static final void initUserSex(User user) throws IllegalAccessException{
        /**
         * 获取用户对应的所有属性
         * 遍历找到被 InitSex 注解修饰的属性
         * 使用注解的值设置对应的用户属性
         */
        Field[] fields = User.class.getDeclaredFields();
        for (Field field : fields){
            if(field.isAnnotationPresent(InitSex.class)){
                InitSex init = field.getAnnotation(InitSex.class);
                field.setAccessible(true);
                field.set(user,init.sex().toString());
                System.out.println("init sex " + init.sex().toString());
            }
        }
    }

    private static final boolean checkUserAge(User user) throws IllegalAccessException{
        /**
         * 获取用户对应的所有属性
         * 遍历找到被 ValidateAge 注解修饰的属性
         * 使用注解的值设置对应的用户属性
         */
        Field[] fields = User.class.getDeclaredFields();
        for (Field field : fields){
            if(field.isAnnotationPresent(ValidateAge.class)){
                ValidateAge validateAge = field.getAnnotation(ValidateAge.class);
                field.setAccessible(true);
                Integer age = (Integer) field.get(user);
                if(age == null || age.intValue() < validateAge.min() || age.intValue() > validateAge.max()){
                    System.out.println("the age is illegal");
                    return false;
                }else {
                    System.out.println("the age is right");
                    return true;
                }
            }
        }
        return true;
    }

    private static final void printResult(boolean checkResult){
        System.out.println("the age is" + (checkResult ? " OK " : " ERROR "));
    }
}
