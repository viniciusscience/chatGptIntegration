package com.example.chatgpt.demo.integration.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usage {
	private int prompt_tokens;
	private int completion_tokens;
	private int total_tokens;

}
