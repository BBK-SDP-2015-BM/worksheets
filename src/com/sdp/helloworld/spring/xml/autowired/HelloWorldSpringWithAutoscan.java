package com.sdp.helloworld.spring.xml.autowired;

import com.sdp.helloworld.spring.xml.annotation.MessageRenderer;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Basil on 15/01/2016.
 */
public class HelloWorldSpringWithAutoscan {

    public static void main(String[] args) throws Exception {

        // get the bean factory
        BeanFactory factory = getBeanFactory();
        MessageRenderer mr = (MessageRenderer) factory.getBean("renderer");
        mr.render();
    }

    private static BeanFactory getBeanFactory() throws Exception {

        // create a bean factory by autowiring
        BeanFactory factory = new ClassPathXmlApplicationContext("file:/Users/Basil/IdeaProjects/worksheets/src/com/sdp/helloworld/spring/xml/autowired/beans.xml");
        return factory;
    }

}
