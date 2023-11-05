package com.example.chatgpt.demo.integration.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Choice {
	private Message message;
	private String finish_reason;
	private int index;

}
