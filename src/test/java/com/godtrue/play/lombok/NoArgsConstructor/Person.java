package com.godtrue.play.lombok.NoArgsConstructor;

import lombok.NoArgsConstructor;

/**
 * @description： 在没有声明其他构造函数的情况下，Java编译器也会默认生成一个无参的构造函数，所以，这个注解只有在存在其他构造函数的情况下才是有意义的
 * @author：qianyingjie1
 * @create：2020-01-19
 */
@NoArgsConstructor
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

package com.godtrue.play.lombok.NoArgsConstructor;

public class Person {
    private String id;
    private String name;
    private byte sex;
    private byte age;

    public Person() {
    }
}

 */