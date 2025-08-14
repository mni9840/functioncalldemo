package com.example.functioncalldemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.functioncalldemo.service.ChatAssistant;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ChatController {
    private final ChatAssistant chatAssistant;

    @GetMapping("/chat")
    public String chat(String userMessage) {
        return chatAssistant.chat(userMessage);
    }

}
