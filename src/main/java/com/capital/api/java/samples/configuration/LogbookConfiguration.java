package com.capital.api.java.samples.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zalando.logbook.DefaultHttpLogFormatter;
import org.zalando.logbook.DefaultHttpLogWriter;
import org.zalando.logbook.DefaultSink;
import org.zalando.logbook.Logbook;

@Configuration
class LogbookConfiguration {

    @Bean
    public Logbook logbook() {
        return Logbook.builder()
//                                  .condition(new CustomCondition())
//                                  .queryFilter(new CustomQueryFilter())
//                                  .pathFilter(new CustomPathFilter())
//                                  .headerFilter(new CustomHeaderFilter())
//                                  .bodyFilter(new CustomBodyFilter())
//                                  .requestFilter(new CustomRequestFilter())
//                                  .responseFilter(new CustomResponseFilter())
                       .sink(new DefaultSink(
                               new DefaultHttpLogFormatter(),
                               new DefaultHttpLogWriter()
                       ))
                       .build();
    }

//    @Bean
//    public CloseableHttpClient httpClient(Logbook logbook) {
//        return HttpClients.custom()
//                       .addInterceptorFirst(new LogbookHttpRequestInterceptor(logbook))
//                       .addInterceptorFirst(new LogbookHttpResponseInterceptor())
//                       .build();
//    }
//
//    @Bean
//    public CloseableHttpClient httpClient5(Logbook logbook) {
//        return HttpClients.custom()
//                       .addInterceptorFirst(new LogbookHttpRequestInterceptor(logbook))
//                       .addInterceptorFirst(new LogbookHttpResponseInterceptor())
//                       .build();
//    }

//    @Bean
//    public RestTemplate restTemplate(Logbook logbook) {
//        LogbookClientHttpRequestInterceptor interceptor = new LogbookClientHttpRequestInterceptor(logbook);
//        RestTemplate restTemplate = new RestTemplate();
//        restTemplate.getInterceptors().add(interceptor);
//        return restTemplate;
//    }
//
}
