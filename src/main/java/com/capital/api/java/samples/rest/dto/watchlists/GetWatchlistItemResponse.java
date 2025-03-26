package com.capital.api.java.samples.rest.dto.watchlists;

import com.capital.api.java.samples.rest.dto.market.MarketItem;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetWatchlistItemResponse {
    private List<MarketItem> markets;
}
