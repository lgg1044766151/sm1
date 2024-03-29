package com.offcn.sm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.offcn.dao")//增加扫描dao接口
public class SmApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmApplication.class, args);
    }

}
