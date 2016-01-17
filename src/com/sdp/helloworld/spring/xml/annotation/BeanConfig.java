package com.sdp.helloworld.spring.xml.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Basil on 17/01/2016.
 */
@Configuration
public class BeanConfig {

    @Bean
    public MessageProvider provider() {
        return new HelloWorldMessageProvider();
    }

    @Bean
    public MessageRenderer renderer() {
        return new StandardOutMessageRenderer();
    }

}
