package com.godtrue.play.lombok.AllArgsConstructor;

import lombok.AllArgsConstructor;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2020-01-19
 */
@AllArgsConstructor
public class Person {
    /**
     * 身份证号
     */
    private String id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private byte sex;

    /**
     * 年龄
     */
    private byte age;

}

/*

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.godtrue.play.lombok.AllArgsConstructor;

import java.beans.ConstructorProperties;

public class Person {
    private String id;
    private String name;
    private byte sex;
    private byte age;

    @ConstructorProperties({"id", "name", "sex", "age"})
    public Person(String id, String name, byte sex, byte age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
}

 */