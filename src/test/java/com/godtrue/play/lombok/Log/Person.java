package com.godtrue.play.lombok.Log;

import lombok.extern.java.Log;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2020-01-19
 */
@Log
//@CommonsLog
//@Slf4j
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

    public static void main(String[] args) {
        log.severe("Something wrong here");
    }
}

/*

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.godtrue.play.lombok.Log;

import java.util.logging.Logger;

public class Person {
    private static final Logger log = Logger.getLogger(Person.class.getName());
    private String id;
    private String name;
    private byte sex;
    private byte age;

    public Person() {
    }

    public static void main(String[] args) {
        log.severe("Something wrong here");
    }
}

 */