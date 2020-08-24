package com.qiang.mybatisplusauto;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qiang.mybatisplusauto.mapper")
public class MybatisPlusAutoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusAutoApplication.class, args);
    }

}
