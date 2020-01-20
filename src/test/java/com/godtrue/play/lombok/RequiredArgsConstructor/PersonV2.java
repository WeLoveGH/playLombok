package com.godtrue.play.lombok.RequiredArgsConstructor;

import lombok.RequiredArgsConstructor;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2020-01-19
 */
@RequiredArgsConstructor(staticName = "of")
public class PersonV2 {
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

package com.godtrue.play.lombok.RequiredArgsConstructor;

public class PersonV2 {
    private String id;
    private String name;
    private byte sex;
    private byte age;

    private PersonV2() {
    }

    public static PersonV2 of() {
        return new PersonV2();
    }
}

 */