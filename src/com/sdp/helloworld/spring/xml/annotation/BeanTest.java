package com.sdp.helloworld.spring.xml.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Basil on 17/01/2016.
 */
public class BeanTest {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);

        MessageRenderer mr = (MessageRenderer) ctx.getBean("renderer");
        MessageProvider mp = (MessageProvider) ctx.getBean("provider");
        mr.setMessageProvider(mp);
        mr.render();

    }

}
