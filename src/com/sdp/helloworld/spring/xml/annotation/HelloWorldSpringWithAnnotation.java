package com.sdp.helloworld.spring.xml.annotation;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Basil on 15/01/2016.
 */
public class HelloWorldSpringWithAnnotation {

    public static void main(String[] args) throws Exception {

        // get the bean factory
        BeanFactory factory = getBeanFactory();
        MessageRenderer mr = (MessageRenderer) factory.getBean("renderer");
        mr.render();
    }

    private static BeanFactory getBeanFactory() throws Exception {
        // create a bean factory from anno.xml
        BeanFactory factory = new ClassPathXmlApplicationContext("file:/Users/Basil/IdeaProjects/worksheets/src/com/sdp/helloworld/spring/xml/annotation/beans.xml");
        return factory;
    }

}
