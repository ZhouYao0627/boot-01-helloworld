package com.atguigu.boot.bean;

import lombok.*;
/**
 @author：ZhouYao
 @create：2021-12-24 10:46
 */


/**
 * 用户
 */

@NoArgsConstructor
//@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode
public class User {
    private String name;
    private Integer age;

    private Pet pet;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
