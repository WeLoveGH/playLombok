package com.godtrue.play.lombok.Getter;

import lombok.Getter;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2020-01-19
 */
@Getter
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

package com.godtrue.play.lombok.Getter;

public class Person {
    private String id;
    private String name;
    private byte sex;
    private byte age;

    public Person() {
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public byte getSex() {
        return this.sex;
    }

    public byte getAge() {
        return this.age;
    }
}

 */