package com.cxzcanying.yunmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cxzcanying.yunmall.product.dao")
public class YunmallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(YunmallProductApplication.class, args);
	}

}
