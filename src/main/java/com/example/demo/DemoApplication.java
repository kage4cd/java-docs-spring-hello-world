package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.lang.Exception;
import java.util.logging.*;


@SpringBootApplication
@RestController
public class DemoApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	
	@RequestMapping("/")
	String sayHello() {
		// ロガーを取得（ロギングの対象のパッケージ名やクラス名を引数とする）
		Logger logger = Logger.getLogger("LoggingSample");
		 // Loggerインスタンスの生成 
                Logger sample_logger = Logger.getLogger("Sample log");

                // 現在のディレクトリ情報を取得
                String path =  System.getProperty("user.dir"); path = new File(path, "sample_log.txt").getPath();
                System.out.println(path);

                // Handlerクラスのインスタンス生成のときの例外処理のためのtry-catch構文
                try{ 
                        // Handlerインスタンスを生成
                          Handler sample_handler = new FileHandler(path);
                             // LoggerにHandlerを登録
                         sample_logger.addHandler(sample_handler);
			return "Hello World!";
                }catch(IOException e){}

	                // ログの出力
	                sample_logger.log(Level.INFO, "サンプルログです。"); 
			return "Hello World!";
		}
	}
		
}
