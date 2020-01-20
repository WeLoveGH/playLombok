package com.godtrue.annotation.simple2;

import com.godtrue.annotation.simple2.self.annotation.InitParam;

import java.lang.reflect.Method;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2020-01-19
 */
public class Client {
    public static void main(String[] args) throws Exception{
        /**
         * 加载 Subject 类，且获取他的log方法的对象
         */
        Method method = Class.forName("com.godtrue.annotation.simple2.Subject").getDeclaredMethod("log");

        /**
         * 获取方法的注解对象
         */
        InitParam initParam = method.getAnnotation(InitParam.class);

        /**
         * 输出注解对象的信息
         */
        System.out.println(initParam.paramStr());
        System.out.println(initParam.paramInt());
    }
}
