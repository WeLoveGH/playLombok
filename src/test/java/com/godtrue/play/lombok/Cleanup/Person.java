package com.godtrue.play.lombok.Cleanup;

import lombok.Cleanup;

import java.io.*;

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

    public static void main(String[] args) throws IOException{
        @Cleanup InputStream inputStream = new FileInputStream(args[0]);
        @Cleanup OutputStream outputStream = new FileOutputStream(args[1]);

        byte[] bytes = new byte[10 * 1024];
        while (true){
            int read = inputStream.read(bytes);
            if(read == -1){
                break;
            }
            outputStream.write(bytes,0,read);
        }
    }
}

/*

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.godtrue.play.lombok.Cleanup;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;

public class Person {
    private String id;
    private String name;
    private byte sex;
    private byte age;

    public Person() {
    }

    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);

        try {
            FileOutputStream outputStream = new FileOutputStream(args[1]);

            try {
                byte[] bytes = new byte[10240];

                while(true) {
                    int read = inputStream.read(bytes);
                    if (read == -1) {
                        return;
                    }

                    outputStream.write(bytes, 0, read);
                }
            } finally {
                if (Collections.singletonList(outputStream).get(0) != null) {
                    outputStream.close();
                }

            }
        } finally {
            if (Collections.singletonList(inputStream).get(0) != null) {
                inputStream.close();
            }

        }
    }
}

 */