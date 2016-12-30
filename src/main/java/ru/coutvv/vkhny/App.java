package ru.coutvv.vkhny;

import java.io.IOException;
import java.net.URISyntaxException;

import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;

import ru.coutvv.vkhny.api.MessageManager;
import ru.coutvv.vkhny.util.Congratulation;
import ru.coutvv.vkhny.util.LagUtil;

public class App {

	public static void main(String[] args) throws IOException, ApiException, ClientException, URISyntaxException {
		System.out.println("test");
		MessageManager msg = new MessageManager("app.properties");
		
		Congratulation cong = new Congratulation("templates.txt");
		cong.createCongratulation("Roman");
		for(int i = 0; i < 5; i++) {
			msg.sendMessage(1L, cong.createCongratulation("Roman"));
			LagUtil.lag();
		}
		
	}
	
} 
