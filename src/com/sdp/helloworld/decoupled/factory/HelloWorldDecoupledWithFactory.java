package com.sdp.helloworld.decoupled.factory;

import com.sdp.helloworld.decoupled.interfaces.MessageProvider;
import com.sdp.helloworld.decoupled.interfaces.MessageRenderer;

/**
 * Created by Basil on 14/01/2016.
 */
public class HelloWorldDecoupledWithFactory {

    public static void main(String[] args) {
        MessageRenderer mr = MessageSupportFactory.getInstance().getMessageRenderer();
        MessageProvider mp = MessageSupportFactory.getInstance().getMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }

}
