package uz.boo.telegram_bot;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
	public static void main(String[] args) {
		// Initialize Api Context
		ApiContextInitializer.init();
		// SpringApplication.run(Main.class, args);

		// Instantiate Telegram Bots API
		TelegramBotsApi botsApi = new TelegramBotsApi();

		// Register our bot
		try {
			botsApi.registerBot(new MyAmazingBot());
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}

	}
}
