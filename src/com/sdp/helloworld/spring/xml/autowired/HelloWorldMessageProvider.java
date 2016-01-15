package com.sdp.helloworld.spring.xml.autowired;

import com.sdp.helloworld.decoupled.interfaces.MessageProvider;
import org.springframework.stereotype.Component;

/**
 * Created by Basil on 15/01/2016.
 */
@Component
public class HelloWorldMessageProvider implements MessageProvider {
    public String getMessage() {
        return "Hello SDP with AutoScan!";
    }
}
