package com.sdp.helloworld.spring.di;

import com.sdp.helloworld.decoupled.interfaces.MessageRenderer;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by Basil on 15/01/2016.
 */
public class HelloWorldSpringWithDI {

    public static void main(String[] args) throws Exception {
        BeanFactory factory = getBeanFactory();
        MessageRenderer mr = (MessageRenderer) factory.getBean("renderer");
        mr.render();
    }

    // bean factory spring boilerplate code with bindings
    private static BeanFactory getBeanFactory() throws Exception {

        // spring bean factories
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        PropertiesBeanDefinitionReader rdr = new PropertiesBeanDefinitionReader(factory);

        // load properties
        Properties props = new Properties();
        props.load(new FileInputStream("/Users/Basil/IdeaProjects/worksheets/src/com/sdp/helloworld/spring/di/bean.properties"));

        // read properties and create factory
        rdr.registerBeanDefinitions(props);
        return factory;
    }

}
