package com.example.functioncalldemo.service;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface ChatAssistant {
    @SystemMessage("You are a stock advisor who provides recommendations based on latest stock price information")
    String chat(String userMessage);
}