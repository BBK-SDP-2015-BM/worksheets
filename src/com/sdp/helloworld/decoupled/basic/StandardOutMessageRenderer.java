package com.sdp.helloworld.decoupled.basic;

/**
 * Created by Basil on 14/01/2016.
 */
public class StandardOutMessageRenderer {

    // message
    private HelloWorldMessageProvider helloWorldMessageProvider = null;

    // render method
    public void render() {

        if (helloWorldMessageProvider == null)
            throw new RuntimeException(StandardOutMessageRenderer.class.getName() + " message provider not set.");

        System.out.println(helloWorldMessageProvider.getMessage());
    }

    // setter
    public void setHelloWorldMessageProvider(HelloWorldMessageProvider helloWorldMessageProvider) {
        this.helloWorldMessageProvider = helloWorldMessageProvider;
    }

    // getter
    public HelloWorldMessageProvider getHelloWorldMessageProvider() {
        return helloWorldMessageProvider;
    }
}
