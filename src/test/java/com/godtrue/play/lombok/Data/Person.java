package com.godtrue.play.lombok.Data;

import lombok.Data;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2020-01-19
 */
@Data
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

package com.godtrue.play.lombok.Data;

public class Person {
    private String id;
    private String name;
    private byte sex;
    private byte age;

    public Person() {
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public byte getSex() {
        return this.sex;
    }

    public byte getAge() {
        return this.age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(byte sex) {
        this.sex = sex;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Person)) {
            return false;
        } else {
            Person other = (Person)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label43: {
                    Object this$id = this.getId();
                    Object other$id = other.getId();
                    if (this$id == null) {
                        if (other$id == null) {
                            break label43;
                        }
                    } else if (this$id.equals(other$id)) {
                        break label43;
                    }

                    return false;
                }

                Object this$name = this.getName();
                Object other$name = other.getName();
                if (this$name == null) {
                    if (other$name != null) {
                        return false;
                    }
                } else if (!this$name.equals(other$name)) {
                    return false;
                }

                if (this.getSex() != other.getSex()) {
                    return false;
                } else if (this.getAge() != other.getAge()) {
                    return false;
                } else {
                    return true;
                }
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof Person;
    }

    public int hashCode() {
        int PRIME = true;
        int result = 1;
        Object $id = this.getId();
        int result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        result = result * 59 + this.getSex();
        result = result * 59 + this.getAge();
        return result;
    }

    public String toString() {
        return "Person(id=" + this.getId() + ", name=" + this.getName() + ", sex=" + this.getSex() + ", age=" + this.getAge() + ")";
    }
}


 */