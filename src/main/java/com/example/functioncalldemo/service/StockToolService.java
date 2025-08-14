package com.example.functioncalldemo.service;

import org.springframework.stereotype.Service;
import dev.langchain4j.agent.tool.P;
import dev.langchain4j.agent.tool.Tool;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StockToolService {
    private final StockService stockService;

    @Tool("Returns stock price and details for a given stock symbol")
    public String getStockDetails(@P("stock symbol") String symbol) {
        return stockService.getStockDetails(symbol);
    }
}
