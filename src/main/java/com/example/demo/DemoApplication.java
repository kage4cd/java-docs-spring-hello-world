package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.logging;


@SpringBootApplication
@RestController
public class DemoApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	// Loggerクラスのインスタンスを生成する
        final Logger logger = Logger.getLogger("SampleLogging");
	
	@RequestMapping("/")
	String sayHello() {
		// ログを出力する
		logger.log(Level.FINEST, "ログ出力テスト：finest");
		logger.log(Level.FINER, "ログ出力テスト：finer");
		logger.log(Level.FINE, "ログ出力テスト：fine");
		logger.log(Level.CONFIG, "ログ出力テスト：config");
		logger.log(Level.INFO, "ログ出力テスト：info");
		logger.log(Level.WARNING, "ログ出力テスト：warning");
		logger.log(Level.SEVERE, "ログ出力テスト：severe");
		return "Hello World!";
	}
}
