package com.sdp.helloworld.spring.xml.constructor;

import com.sdp.helloworld.decoupled.interfaces.MessageProvider;

/**
 * Created by Basil on 15/01/2016.
 */
public class ConfigurableMessageProvider implements MessageProvider {

    private String message;

    public ConfigurableMessageProvider(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
