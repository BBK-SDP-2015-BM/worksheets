package com.sdp.helloworld.decoupled.basic;

/**
 * Created by Basil on 14/01/2016.
 */
public class HelloWorldDecoupled {

    public static void main(String[] args) {

        StandardOutMessageRenderer messageRenderer = new StandardOutMessageRenderer();
        HelloWorldMessageProvider helloWorldMessageProvider = new HelloWorldMessageProvider();
        messageRenderer.setHelloWorldMessageProvider(helloWorldMessageProvider);
        messageRenderer.render();

    }

}
