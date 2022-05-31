package DefinitionsExamples.DependencyInjection.DIWithAnnotation;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldSpringWithAnnotation {
    public static void main(String[] args) throws Exception {
        BeanFactory factory = new ClassPathXmlApplicationContext("autowiredExamplebeans.xml");
        MessageRenderer mr = (MessageRenderer) factory.getBean("renderer");
        mr.render();
    }
}
