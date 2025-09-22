package com.example.functioncalldemo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class StockService {
    private String stockSiteApiKey;
    private RestClient restClient;
    private int counter;


    public StockService(RestClient restClient, @Value("${stock.details.api.site.key}") String stockSiteApiKey) {
        this.stockSiteApiKey = stockSiteApiKey;
        this.restClient = restClient;
    }

    @SuppressWarnings("null")
    public String getStockDetails(String symbol) {
        return restClient.get().uri("/quote?symbol="+symbol+"&apikey="+stockSiteApiKey).retrieve().body(String.class).replaceAll("\\s", "").trim();
    }
}
