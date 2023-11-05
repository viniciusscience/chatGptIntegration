package com.example.chatgpt.demo.integration.model;


import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatGptResponse {

    private String id;
    private String object;
    private long created;
    private String model;
    private Usage usage;
    private List<Choice> choices;
}
