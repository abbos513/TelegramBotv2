package uz.boo.telegram_bot;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.io.FileInputStream;

import org.springframework.util.ResourceUtils;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.methods.send.SendPhoto;
import org.telegram.telegrambots.api.objects.PhotoSize;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class MyAmazingBot extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {

        // We check if the update has a message and the message has text
        if (update.hasMessage() && update.getMessage().hasText()) {

            long chat_id = update.getMessage().getChatId();

            SendPhoto msg = new SendPhoto()
                    .setChatId(chat_id);

            String messageText = update.getMessage().getText();

            switch (messageText) {
                case "1111":
                    msg.setPhoto("https://waitron.menu/img/landing/carousel/menu-5.png");
                    msg.setCaption("Anhor restarani");
                    try {
                        sendPhoto(msg); // Call method to send the photo with caption
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                    break;
                case "2222":
                    msg.setPhoto("https://i.pinimg.com/550x/23/01/c2/2301c231148107974d9e5c3982ece3ea.jpg");
                    msg.setCaption("Best burger");
                    try {
                        sendPhoto(msg); // Call method to send the photo with caption
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                    break;
                case "3333":
                    msg.setPhoto(
                            "https://static.vecteezy.com/system/resources/previews/000/460/908/non_2x/vector-fast-food-menu.jpg");
                    msg.setCaption("Max Way");
                    try {
                        sendPhoto(msg); // Call method to send the photo with caption
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                    break;
                case "4444":
                    msg.setPhoto(
                            "https://static.vecteezy.com/system/resources/previews/000/482/945/non_2x/vector-fast-food-restaurant-menu-on-chalkboard.jpg");
                    msg.setCaption("Drujba Burger");
                    try {
                        sendPhoto(msg); // Call method to send the photo with caption
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    SendMessage message = new SendMessage() // Create a message object object
                            .setChatId(chat_id)
                            .setText("Bunday ovqatlanish shaxobchasi mavjud emas");
                    try {
                        execute(message); // Sending our message object to user
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
            }

        }
    }

    @Override
    public String getBotUsername() {
        // Return bot username
        // If bot username is @MyAmazingBot, it must return 'MyAmazingBot'
        return "MyAmazingBot";
    }

    @Override
    public String getBotToken() {
        // Return bot token from BotFather
        return "698390926:AAFm-hUFrbH_1sYOXvHCpaIoosOYfamKBmA";
    }
}
