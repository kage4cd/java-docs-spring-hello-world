package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication
@RestController
public class DemoApplication {
	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);
	

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	
	@RequestMapping("/")
	String sayHello() {
		// ログを出力する
		logger.trace("ログ出力テスト：trace");
		logger.debug("ログ出力テスト：debug");
		logger.info("ログ出力テスト：info");
		logger.warn("ログ出力テスト：warn");
		logger.error("ログ出力テスト：error");
		return "Hello World!";
	}
}
