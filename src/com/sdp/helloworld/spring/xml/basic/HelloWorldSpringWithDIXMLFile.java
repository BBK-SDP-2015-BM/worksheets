package com.sdp.helloworld.spring.xml.basic;

import com.sdp.helloworld.decoupled.interfaces.MessageRenderer;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Basil on 15/01/2016.
 */
public class HelloWorldSpringWithDIXMLFile {

    public static void main(String[] args) throws Exception {
        BeanFactory factory = getBeanFactory();
        MessageRenderer mr = (MessageRenderer) factory.getBean("renderer");
        mr.render();
    }

    // bean factory spring boilerplate code from xml
    private static BeanFactory getBeanFactory() throws Exception {

        // create bean factory from beans.xml (note use of file: to find beans??)
        BeanFactory factory = new ClassPathXmlApplicationContext("file:/Users/Basil/IdeaProjects/worksheets/src/com/sdp/helloworld/spring/xml/beans.xml");
        return factory;

    }
}
