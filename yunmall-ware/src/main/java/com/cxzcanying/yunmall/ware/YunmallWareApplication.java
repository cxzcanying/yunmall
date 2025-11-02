package com.cxzcanying.yunmall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cxzcanying.yunmall.ware.dao")
public class YunmallWareApplication {

	public static void main(String[] args) {
		SpringApplication.run(YunmallWareApplication.class, args);
	}

}
