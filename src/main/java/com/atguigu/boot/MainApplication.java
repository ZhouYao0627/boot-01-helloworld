package com.atguigu.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 @author：ZhouYao
 @create：2021-12-23 19:05
 */

/**
 * 主程序类(所有启动的入口)
 * 告诉springboot这是一个springboot应用
 */
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

}
