package com.itheima.springbootssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.itheima.springbootssm.dao")
public class SpringbootssmApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootssmApplication.class, args);
    }

}
