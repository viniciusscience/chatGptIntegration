package com.example.chatgpt.demo.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.chatgpt.demo.integration.model.ChatGptResponse;
import com.example.chatgpt.demo.integration.model.ChatgptBody;
import com.example.chatgpt.demo.integration.model.Message;

@Configuration
public class ChatGptIntegration implements ChatGpt {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${chatgpt.apiKey}")
	private String apiKey;

	@Value("${chatgpt.url}")
	private String url;

	@Override
	public Message enviarMensagem(String mensagem) {
		var header = new HttpHeaders();
		header.add("Content-Type", "application/json");
		header.add("Authorization", "Bearer " + this.apiKey);

		var message = Message.builder() //
				.role("user") //
				.content(mensagem) //
				.build(); //

		var body = ChatgptBody.builder() //
				.model("gpt-3.5-turbo") //
				.temperature(0.7) //
				.messages(List.of(message)) //
				.build(); //

		ResponseEntity<ChatGptResponse> response = restTemplate.postForEntity(url, new HttpEntity<>(body, header),
				ChatGptResponse.class);

		return response.getBody().getChoices().get(0).getMessage();
	}

}
