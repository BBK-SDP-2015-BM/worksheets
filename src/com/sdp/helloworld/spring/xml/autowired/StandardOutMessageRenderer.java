package com.sdp.helloworld.spring.xml.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Basil on 15/01/2016.
 */
@Component("renderer") // This is the same as @Component(value="renderer")
public class StandardOutMessageRenderer implements MessageRenderer {

    @Autowired
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
