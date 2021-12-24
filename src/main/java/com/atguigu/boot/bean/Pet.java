package com.atguigu.boot.bean;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.ToString;

/**
 @author：ZhouYao
 @create：2021-12-24 10:47
 */

/**
 * 宠物
 */
//@ToString
//@Data
//@NoArgsConstructor  //无参构造器
//@AllArgsConstructor  //全参构造器
public class Pet {

    private String name;

    public Pet() {
    }

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }
}

