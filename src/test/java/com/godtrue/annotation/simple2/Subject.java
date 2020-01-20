package com.godtrue.annotation.simple2;

import com.godtrue.annotation.simple2.self.annotation.InitParam;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2020-01-19
 */
public class Subject {
    @InitParam(paramStr = "YES",paramInt = 10000)
    public void log(){
        System.out.println("i am log");
    }
}
