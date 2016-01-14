package com.sdp.helloworld.decoupled.factory;

import com.sdp.helloworld.decoupled.interfaces.MessageProvider;
import com.sdp.helloworld.decoupled.interfaces.MessageRenderer;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by Basil on 14/01/2016.
 */
public class MessageSupportFactory {

    // instance variable
    private static MessageSupportFactory instance = null;

    // properties hashmap
    private Properties props = null;

    // renderer and provider variables
    private MessageRenderer renderer = null;
    private MessageProvider provider = null;

    // singleton private constructor
    private MessageSupportFactory() {

        // initialise properties
        props = new Properties();

        // read properties from bean config
        try {

            // load properties from config file
            props.load(new FileInputStream("/Users/Basil/IdeaProjects/worksheets/src/com/sdp/helloworld/decoupled/factory/bean.properties"));

            // get renderer and provider implementation classes
            String rendererClass = props.getProperty("renderer.class");
            String providerClass = props.getProperty("provider.class");

            // get instances of implementation classes
            renderer = (MessageRenderer) Class.forName(rendererClass).newInstance();
            provider = (MessageProvider) Class.forName(providerClass).newInstance();

        // handle exceptions
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // initialise singleton instance
    static {
        instance = new MessageSupportFactory();
    }

    // singleton instance getter
    public static MessageSupportFactory getInstance() {
        return instance;
    }

    // renderer getter
    public MessageRenderer getMessageRenderer() {
        return renderer;
    }

    // provider getter
    public MessageProvider getMessageProvider() {
        return provider;
    }

}
