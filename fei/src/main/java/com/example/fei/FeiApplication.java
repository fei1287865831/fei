package com.example.fei;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.fei.mapper")
@SpringBootApplication
public class FeiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeiApplication.class, args);
    }

}
