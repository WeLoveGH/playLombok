package com.godtrue.play.lombok.Setter;

import lombok.Setter;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2020-01-19
 */
@Setter
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

package com.godtrue.play.lombok.Setter;

public class Person {
    private String id;
    private String name;
    private byte sex;
    private byte age;

    public Person() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(byte sex) {
        this.sex = sex;
    }

    public void setAge(byte age) {
        this.age = age;
    }
}

 */