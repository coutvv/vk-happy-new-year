package ru.coutvv.vkhny.api;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.vk.api.sdk.client.TransportClient;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.httpclient.HttpTransportClient;

import ru.coutvv.vkhny.data.entity.Account;

public class MessageManager {
	
	private String token;
	private int userId;
	
	private UserActor actor;
	private VkApiClient vk;

	public MessageManager(String filename) throws IOException {
		InputStream in = MessageManager.class.getClassLoader().getResourceAsStream(filename); 
		Properties props = new Properties();
		props.load(in);
		
		userId = Integer.parseInt(props.getProperty("userId"));
		token = props.getProperty("token");
		actor = new UserActor(userId, token);
		TransportClient tc = HttpTransportClient.getInstance();
		vk = new VkApiClient(tc, new Gson());
	}
	
	public List<Account> getFriends() throws ApiException, ClientException {
		String script = "return API.friends.get({" +
					"\"fields\" :" + "\"uid, first_name, last_name, nickname, sex, bdate, city, country, timezone, photo, photo_medium, photo_big, domain, has_mobile, rate, contacts, education \"" + 
				"});";
		JsonElement json = vk.execute().code(actor, script).execute();
		Account[] result = new Gson().fromJson(json.getAsJsonObject().get("items"), Account[].class);
		return Arrays.asList(result);
	}
	
	public void sendMessage(Long destId, String msg) throws ApiException, ClientException {
		String script = "return API.messages.send({" +
				"\"peer_id\" :" + destId + "," +
				"\"message\" :" + "\""+ msg +"\"" + "," +
				"\"\" :" + "\"\"" + "," +
			"});";
		JsonElement json = vk.execute().code(actor, script).execute();
		System.out.println(json);
	}
	
}
