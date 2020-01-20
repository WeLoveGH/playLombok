package com.godtrue.play.lombok.NonNull;

import lombok.NonNull;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2020-01-19
 */
public class Person{
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

    private void printIdAndNameBytes(@NonNull String id,@NonNull String name){
        byte[] idBytes = id.getBytes();
        byte[] nameBytes = name.getBytes();
        System.out.println(idBytes);
        System.out.println(nameBytes);
    }
}

/*

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.godtrue.play.lombok.NonNull;

import lombok.NonNull;

public class Person {
    private String id;
    private String name;
    private byte sex;
    private byte age;

    public Person() {
    }

    private void printIdAndNameBytes(@NonNull String id, @NonNull String name) {
        if (id == null) {
            throw new NullPointerException("id");
        } else if (name == null) {
            throw new NullPointerException("name");
        } else {
            byte[] idBytes = id.getBytes();
            byte[] nameBytes = name.getBytes();
            System.out.println(idBytes);
            System.out.println(nameBytes);
        }
    }
}

 */