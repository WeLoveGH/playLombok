package com.godtrue.play.lombok.ToString;

import lombok.ToString;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2020-01-19
 */
@ToString
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

package com.godtrue.play.lombok.ToString;

public class Person {
    private String id;
    private String name;
    private byte sex;
    private byte age;

    public Person() {
    }

    public String toString() {
        return "Person(id=" + this.id + ", name=" + this.name + ", sex=" + this.sex + ", age=" + this.age + ")";
    }
}

 */