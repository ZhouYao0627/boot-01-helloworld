package com.atguigu.boot.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 @author：ZhouYao
 @create：2021-12-24 13:46
 */

/**
 * 只有在容器中的组件，才会拥有springboot提供的强大功能
 */

@ToString
@Data
//@Component
@ConfigurationProperties(prefix = "mycar")
public class Car {
    private String brand;
    private Integer price;
}
