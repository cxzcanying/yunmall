package com.cxzcanying.yunmall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cxzcanying.yunmall.order.dao")
public class YunmallOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(YunmallOrderApplication.class, args);
	}

}
