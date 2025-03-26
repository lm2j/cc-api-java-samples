package com.capital.api.java.samples.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.zalando.logbook.Logbook;
import org.zalando.logbook.spring.LogbookClientHttpRequestInterceptor;

@Configuration
public class Config {
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder, Logbook logbook) {
        return builder
//                       .additionalInterceptors(new LogbookClientHttpRequestInterceptor(logbook))
                       .build();
    }

    @Bean
    String demoURL(@Value("${capital.api.demo.domain.URL}") String url) {
        return url;
    }

    @Bean
    String prodURL(@Value("${capital.api.domain.URL}") String url) {
        return url;
    }
}
