package com.spring.tutorial;

import com.spring.tutorial.model.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.util.Arrays;

/**
 * @author rohit
 **/
public class Application {
    public static void main(String[] args) {

        //BeanFactory context  = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        ApplicationContext context  = new ClassPathXmlApplicationContext("beans.xml");

        Employee emp = (Employee) context.getBean("employee");
        System.out.println(emp.toString());
    }
}
