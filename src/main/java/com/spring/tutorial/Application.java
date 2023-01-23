package com.spring.tutorial;

import com.spring.tutorial.model.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.util.Arrays;

/**
 * @author rohit
 **/
public class Application {
    public static void main(String[] args) {

        //BeanFactory context  = new XmlBeanFactory(new ClassPathResource("beans.xml")); //old
        //ApplicationContext context  = new ClassPathXmlApplicationContext("beans.xml"); //best practice
        AbstractApplicationContext context  = new ClassPathXmlApplicationContext("beans.xml");

        Employee emp = (Employee) context.getBean("employee");
        emp.setId(123);
        emp.setName("Rohit");
        System.out.println(emp.toString());

        Employee emp1 = (Employee) context.getBean("employee");
        System.out.println(emp1.toString());

        context.registerShutdownHook();

    }
}
