package com.capital.api.java.samples.callback;

public interface OnMarketDataCallback {
    void onMarketData(MarketData.Payload quote);
}
