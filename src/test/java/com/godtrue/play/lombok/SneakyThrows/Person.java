package com.godtrue.play.lombok.SneakyThrows;

import lombok.SneakyThrows;

import java.io.UnsupportedEncodingException;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2020-01-19
 */
public class Person implements Runnable{
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

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @SneakyThrows
    public void run() {
        throw new Throwable();
    }

    @SneakyThrows(UnsupportedEncodingException.class)
    public String utfToString(byte[]bytes){
        return new String(bytes,"UTF-8");
    }
}

/*

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.godtrue.play.lombok.SneakyThrows;

import java.io.UnsupportedEncodingException;

public class Person implements Runnable {
    private String id;
    private String name;
    private byte sex;
    private byte age;

    public Person() {
    }

    public void run() {
        try {
            throw new Throwable();
        } catch (Throwable var2) {
            throw var2;
        }
    }

    public String utfToString(byte[] bytes) {
        try {
            return new String(bytes, "UTF-8");
        } catch (UnsupportedEncodingException var3) {
            throw var3;
        }
    }
}

 */