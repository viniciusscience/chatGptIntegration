package com.example.chatgpt.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.chatgpt.demo.integration.ChatGptIntegration;
import com.example.chatgpt.demo.integration.model.Message;

@RestController
@RequestMapping("/gpt")
public class ChatgptController {

	@Autowired
	private ChatGptIntegration chatGptIntegration;

	@GetMapping("/{message}")
	ResponseEntity<Message> chamaGpt(@PathVariable String message) {
		var result = chatGptIntegration.enviarMensagem(message);
		return ResponseEntity.ok(result);
	}
}
