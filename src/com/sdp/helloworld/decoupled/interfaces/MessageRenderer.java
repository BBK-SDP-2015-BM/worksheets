package com.sdp.helloworld.decoupled.interfaces;

/**
 * Created by Basil on 14/01/2016.
 */
public interface MessageRenderer {

    public void render();
    public void setMessageProvider(MessageProvider provider);
    public MessageProvider getMessageProvider();

}
