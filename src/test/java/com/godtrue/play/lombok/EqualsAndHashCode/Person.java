package com.godtrue.play.lombok.EqualsAndHashCode;

import lombok.EqualsAndHashCode;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2020-01-19
 */
@EqualsAndHashCode
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

package com.godtrue.play.lombok.EqualsAndHashCode;

public class Person {
    private String id;
    private String name;
    private byte sex;
    private byte age;

    public Person() {
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
                    Object this$id = this.id;
                    Object other$id = other.id;
                    if (this$id == null) {
                        if (other$id == null) {
                            break label43;
                        }
                    } else if (this$id.equals(other$id)) {
                        break label43;
                    }

                    return false;
                }

                Object this$name = this.name;
                Object other$name = other.name;
                if (this$name == null) {
                    if (other$name != null) {
                        return false;
                    }
                } else if (!this$name.equals(other$name)) {
                    return false;
                }

                if (this.sex != other.sex) {
                    return false;
                } else if (this.age != other.age) {
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
        Object $id = this.id;
        int result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $name = this.name;
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        result = result * 59 + this.sex;
        result = result * 59 + this.age;
        return result;
    }
}

 */