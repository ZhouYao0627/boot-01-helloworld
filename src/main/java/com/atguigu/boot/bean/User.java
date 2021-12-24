package com.atguigu.boot.bean;

//import lombok.*;

/**
 @author：ZhouYao
 @create：2021-12-24 10:46
 */

/**
 * 用户
 */

//@NoArgsConstructor
////@AllArgsConstructor
//@Data
//@ToString
//@EqualsAndHashCode
public class User {

    private String name;
    private Integer age;
    private Pet pet;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pet=" + pet +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


}
