package com.sdp.helloworld.spring.xml.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Basil on 14/01/2016.
 */
@Configuration
public class HelloWorldMessageProvider implements MessageProvider {

    @Bean
    public String getMessage() {
        return "Hello SDP!";
    }

}
