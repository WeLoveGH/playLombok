package com.godtrue.play.lombok.NonFinal;

import lombok.AccessLevel;
import lombok.Value;
import lombok.experimental.NonFinal;
import lombok.experimental.Wither;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2020-01-19
 */
@Value
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
    @Wither(AccessLevel.PACKAGE) @NonFinal private byte age;

}

/*

@Value 这个注解功能很强大 @NonFinal需要配合她一块弄

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.godtrue.play.lombok.NonFinal;

import java.beans.ConstructorProperties;

public final class Person {
    private final String id;
    private final String name;
    private final byte sex;
    private byte age;

    @ConstructorProperties({"id", "name", "sex", "age"})
    public Person(String id, String name, byte sex, byte age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
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

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Person)) {
            return false;
        } else {
            Person other;
            label40: {
                other = (Person)o;
                Object this$id = this.getId();
                Object other$id = other.getId();
                if (this$id == null) {
                    if (other$id == null) {
                        break label40;
                    }
                } else if (this$id.equals(other$id)) {
                    break label40;
                }

                return false;
            }

            label33: {
                Object this$name = this.getName();
                Object other$name = other.getName();
                if (this$name == null) {
                    if (other$name == null) {
                        break label33;
                    }
                } else if (this$name.equals(other$name)) {
                    break label33;
                }

                return false;
            }

            if (this.getSex() != other.getSex()) {
                return false;
            } else {
                return this.getAge() == other.getAge();
            }
        }
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

    Person withAge(byte age) {
        return this.age == age ? this : new Person(this.id, this.name, this.sex, age);
    }
}

 */