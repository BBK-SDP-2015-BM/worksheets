package com.sdp.helloworld.decoupled.interfaces;

/**
 * Created by Basil on 14/01/2016.
 */
public class HelloWorldDecoupledInterface {

    public static void main(String[] args) {
        MessageRenderer mr = new StandardOutMessageRenderer();
        MessageProvider mp = new HelloWorldMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }

}
