package com.cxzcanying.yunmall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cxzcanying.yunmall.coupon.dao")
public class YunmallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(YunmallCouponApplication.class, args);
    }
    

}


