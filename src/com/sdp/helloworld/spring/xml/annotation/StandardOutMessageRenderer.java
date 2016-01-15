package com.sdp.helloworld.spring.xml.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Basil on 14/01/2016.
 */
@Configuration
public class StandardOutMessageRenderer implements MessageRenderer {

    @Bean(name="renderer")
    public StandardOutMessageRenderer renderer() {
        return this;
    }

    // message
    private MessageProvider messageProvider = null;

    // render method
    @Override
    public void render() {
        if (messageProvider == null)
            throw new RuntimeException(StandardOutMessageRenderer.class.getName() + " message provider not set.");

        System.out.println(messageProvider.getMessage());
    }

    // setter
    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    // getter
    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }

}
