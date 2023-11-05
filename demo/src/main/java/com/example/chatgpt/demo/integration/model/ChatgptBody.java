package com.example.chatgpt.demo.integration.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChatgptBody {

	private String model;

	private List<Message> messages;

	private Double temperature;
}
