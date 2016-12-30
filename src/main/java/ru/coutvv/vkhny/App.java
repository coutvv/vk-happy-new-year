package ru.coutvv.vkhny;

import java.io.IOException;
import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.util.List;

import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;

import ru.coutvv.vkhny.api.MessageManager;
import ru.coutvv.vkhny.data.entity.Account;
import ru.coutvv.vkhny.util.Congratulation;
import ru.coutvv.vkhny.util.LagUtil;
import ru.coutvv.vkhny.waitforit.Waiter;
import ru.coutvv.vkhny.waitforit.WhatWait;

public class App {

	public static void main(String[] args) throws IOException, ApiException, ClientException, URISyntaxException {
		MessageManager msg = new MessageManager("app.properties");
		
		Congratulation cong = new Congratulation("templates.txt");
		
		new Thread(new Waiter(new WhatWait() {
			
			@Override
			public boolean isItTime() {
				System.out.println(LocalDateTime.now().getMinute() );
				return LocalDateTime.now().getMinute() == 36; //а здесь новый 2017 год!!!)))
			}

			@Override
			public void doIt() {
				try {
					List<Account> friends = msg.getFriends();
					for(Account friend : friends) {
						Long id = friend.getId();
						String name = friend.getFirstName();
						String message = cong.createCongratulation(name);
						System.out.println("sending to " + id + " : " + message);//сюда нужно сендинг поставить
						LagUtil.lag();
					}
				} catch (ApiException | ClientException e) {
					e.printStackTrace();
				}
				
			}
		})).start();
		
	}
	
} 
