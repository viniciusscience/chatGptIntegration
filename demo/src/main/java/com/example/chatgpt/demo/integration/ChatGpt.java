package com.example.chatgpt.demo.integration;

import com.example.chatgpt.demo.integration.model.Message;

public interface ChatGpt {
	Message enviarMensagem(String mensagem);
}
