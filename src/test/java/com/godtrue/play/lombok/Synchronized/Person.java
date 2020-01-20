package com.godtrue.play.lombok.Synchronized;

import lombok.Synchronized;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2020-01-19
 */
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

    private final Object readLock = new Object();

    @Synchronized
    public static void hello(){
        System.out.println("hello");
    }

    @Synchronized
    public int answerToLife(){
        return 42;
    }

    @Synchronized("readLock")
    public void foo(){
        System.out.println("bar");
    }
}

/*

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.godtrue.play.lombok.Synchronized;

public class Person {
    private static final Object $LOCK = new Object[0];
    private final Object $lock = new Object[0];
    private String id;
    private String name;
    private byte sex;
    private byte age;
    private final Object readLock = new Object();

    public Person() {
    }

    public static void hello() {
        Object var0 = $LOCK;
        synchronized($LOCK) {
            System.out.println("hello");
        }
    }

    public int answerToLife() {
        Object var1 = this.$lock;
        synchronized(this.$lock) {
            return 42;
        }
    }

    public void foo() {
        Object var1 = this.readLock;
        synchronized(this.readLock) {
            System.out.println("bar");
        }
    }
}

 */