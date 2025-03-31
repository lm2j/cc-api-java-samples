package com.capital.api.java.samples.callback;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MarketData {
    private String status;
    private String destination;
    private Payload payload;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Payload {
        private String epic;
        private String product;
        private double bid;
        private double bidQty;
        private double ofr;
        private double ofrQty;
        private long timestamp;
    }
}
