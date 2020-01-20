package com.godtrue.annotation.simple1;

import com.godtrue.annotation.simple1.self.annotation.InitSex;
import com.godtrue.annotation.simple1.self.annotation.ValidateAge;
import lombok.Getter;
import lombok.Setter;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2020-01-19
 */
@Getter
@Setter
public class User {
    private String userName;

    @ValidateAge(min=20,max=35,value=22)
    private int age;

    @InitSex(sex = InitSex.SEX_TYPE.MAN)
    private String sex;

}
