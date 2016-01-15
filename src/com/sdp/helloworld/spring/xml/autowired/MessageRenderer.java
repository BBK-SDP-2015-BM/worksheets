package com.sdp.helloworld.spring.xml.autowired;

import org.springframework.stereotype.Component;

/**
 * Created by Basil on 14/01/2016.
 */
@Component
public interface MessageRenderer {

    public void render();
    public void setMessageProvider(MessageProvider provider);
    public MessageProvider getMessageProvider();

}
