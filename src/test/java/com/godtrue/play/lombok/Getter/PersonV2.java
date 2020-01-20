package com.godtrue.play.lombok.Getter;

import lombok.Getter;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2020-01-19
 */
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

    @Getter(lazy = true) private final double[] cached = expensive();

    private double[] expensive(){
        double[] result = new double[10 * 10 * 10000];
        for (int i=0;i<result.length;i++){
            result[i] = Math.asin(i);
        }
        return result;
    }
}

/*

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.godtrue.play.lombok.Getter;

import java.util.concurrent.atomic.AtomicReference;

public class PersonV2 {
    private String id;
    private String name;
    private byte sex;
    private byte age;
    private final AtomicReference<Object> cached = new AtomicReference();

    public PersonV2() {
    }

    private double[] expensive() {
        double[] result = new double[1000000];

        for(int i = 0; i < result.length; ++i) {
            result[i] = Math.asin((double)i);
        }

        return result;
    }

    public double[] getCached() {
        Object value = this.cached.get();
        if (value == null) {
            AtomicReference var2 = this.cached;
            synchronized(this.cached) {
                value = this.cached.get();
                if (value == null) {
                    double[] actualValue = this.expensive();
                    value = actualValue == null ? this.cached : actualValue;
                    this.cached.set(value);
                }
            }
        }

        return (double[])((double[])(value == this.cached ? null : value));
    }
}

 */
