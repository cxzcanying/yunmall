package com.cxzcanying.yunmall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cxzcanying.yunmall.member.dao")
public class YunmallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(YunmallMemberApplication.class, args);
    }

}
