package com.sdp.helloworld.decoupled.interfaces;

/**
 * Created by Basil on 14/01/2016.
 */
public class HelloWorldMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello SDP!";
    }

}
