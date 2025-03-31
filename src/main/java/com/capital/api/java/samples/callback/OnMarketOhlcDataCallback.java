package com.capital.api.java.samples.callback;

public interface OnMarketOhlcDataCallback {

    void onMarketData(OHLCBar quote) throws Exception;
}
