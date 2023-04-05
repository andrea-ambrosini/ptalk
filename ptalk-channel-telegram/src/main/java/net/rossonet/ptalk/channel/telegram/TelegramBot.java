package net.rossonet.ptalk.channel.telegram;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.logging.Logger;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Audio;
import org.telegram.telegrambots.meta.api.objects.Document;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.PhotoSize;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.games.Animation;
import org.telegram.telegrambots.meta.api.objects.stickers.Sticker;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import net.rossonet.ptalk.channel.grpc.ChannelMessageRequest;
import net.rossonet.ptalk.channel.implementation.PTalkChannelRuntime;

@SuppressWarnings("deprecation")
public class TelegramBot extends TelegramLongPollingBot{
	public static final String BOT_USR_ENV = "BOT_USERNAME";
	public static final String BOT_TKN_ENV = "BOT_TOKEN";
	private static final Logger logger = Logger.getLogger(TelegramBot.class.getName());
	private PTalkChannelRuntime pTalkChannelRuntime;
	@SuppressWarnings("unused")
	private TelegramConnector telegramConnector; 

	@Override
	public String getBotUsername() {
		return System.getenv(BOT_USR_ENV);
	}

	@Override
	public String getBotToken() {
		return System.getenv(BOT_TKN_ENV);
	}

	public ExecutorService getExecutor() {
		return exe;
	}

	@Override
	public void onClosing() {
		exe.shutdown();
	}

	/*@Override
	public void onUpdateReceived(Update update) {
		Message message = update.getMessage();
		String text = message.getText();
		Long chatId = message.getChatId();
		sendMessageToPTalk(chatId, text);
	}*/
	
	@Override
	public void onUpdateReceived(Update update) {
		Message message = update.getMessage();
		String reply = "";
		Long chatId = message.getChatId();
		Message currentMessage = update.getMessage();
		if (currentMessage.hasDocument()) {
			Document document = currentMessage.getDocument();
			reply = "Document: " + document.getFileName();
		} else if (currentMessage.hasAudio()){
			Audio audio = currentMessage.getAudio();
			reply = "Audio: " + audio.getFileName();
		} else if (currentMessage.hasSticker()){
			Sticker sticker = currentMessage.getSticker();
			reply = "Sticker: " + sticker.getEmoji();
		} else if (currentMessage.hasPhoto()){
			List<PhotoSize> photo = currentMessage.getPhoto();
			reply = "Photo: " + photo.get(0).toString();
		} else if (currentMessage.hasAnimation()){
			Animation animation = currentMessage.getAnimation();
			reply = "Animation: " + animation.getFileName();
		} else if (currentMessage.hasText()){
			String txt = currentMessage.getText();
			reply = "Message " + txt;
		}
		if(reply.equals("")) reply = "Invalid Message";
		sendMessageToPTalk(chatId, reply);
	}

	private void sendMessageToPTalk(Long chatId, String message) {
		pTalkChannelRuntime.sendMessage(String.valueOf(chatId), message);	
	}

	public void sendMessageToUser(ChannelMessageRequest messageRequest) {
		String chatId = messageRequest.getChannelUniqueName(); 
		String reply = messageRequest.getMessage().getValue().replace("ECHO MESSAGE OF:", "You sent ");
		SendMessage sendMessage = new SendMessage();
		sendMessage.setChatId(chatId);
		sendMessage.setText(reply);		
		try {
			execute(sendMessage);
		} catch (TelegramApiException e) {		
			logger.severe("ERROR WHILE SENDING MESSAGE: " + e.getMessage());
		}	
	}

	public void setPTalkChannelRuntime(PTalkChannelRuntime pTalkChannelRuntime) {
		this.pTalkChannelRuntime = pTalkChannelRuntime;
	}

	public void setTelegramConnector(TelegramConnector telegramConnector) {
		this.telegramConnector = telegramConnector;
	}

}