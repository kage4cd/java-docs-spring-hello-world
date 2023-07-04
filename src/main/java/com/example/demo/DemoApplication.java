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
		try{
			// // ログレベルを設定（INFOに設定した場合これより低いレベルのメッセージは破棄される）
			// logger.setLevel(Level.INFO);
			
			// // ハンドラーを作成してロガーに追加
			// Handler handler = new FileHandler("/home/sample.log");
			// logger.addHandler(handler);
			
			// // フォーマッターを作成してハンドラーに登録
			// Formatter formatter = new SimpleFormatter();
			// handler.setFormatter(formatter);
			
			
			// それぞれのログレベルのメッセージを出力（指定されたログレベル以上のものだけが出力される）
			// logger.finest("最も詳細な（FINEST）メッセージ");
			// logger.finer("詳細な（FINER）メッセージ");
			// logger.fine("通常（FINE）メッセージ");
			// logger.config("構成（CONFIG）メッセージ");
			// logger.info("情報（INFO）メッセージ");
			// logger.warning("警告（WARNING）メッセージ");
			// logger.severe("重大（SEVERE）メッセージ");
			
			// log()を使用して指定のログレベルメッセージを出力
			logger.log(Level.INFO, "テストです");

			ConsoleHandler cHandler = new ConsoleHandler();
			logger.addHandler(cHandler);
			
			return "Hello World!";
		} catch (Exception e) {
			// 引数に渡された例外クラスのスタックトレースを出力
			logger.log(Level.WARNING, "エラーが発生しました", e);
			return "失敗";
		}
	}
		
}
