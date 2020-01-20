package com.godtrue.play.lombok.Builder;

import lombok.Builder;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2020-01-19
 */
@Builder
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

package com.godtrue.play.lombok.Builder;

public class Person {
    private String id;
    private String name;
    private byte sex;
    private byte age;

    Person(String id, String name, byte sex, byte age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public static Person.PersonBuilder builder() {
        return new Person.PersonBuilder();
    }

    public static class PersonBuilder {
        private String id;
        private String name;
        private byte sex;
        private byte age;

        PersonBuilder() {
        }

        public Person.PersonBuilder id(String id) {
            this.id = id;
            return this;
        }

        public Person.PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public Person.PersonBuilder sex(byte sex) {
            this.sex = sex;
            return this;
        }

        public Person.PersonBuilder age(byte age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(this.id, this.name, this.sex, this.age);
        }

        public String toString() {
            return "Person.PersonBuilder(id=" + this.id + ", name=" + this.name + ", sex=" + this.sex + ", age=" + this.age + ")";
        }
    }
}

 */