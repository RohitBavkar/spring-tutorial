package com.spring.tutorial.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author rohit
 **/
public class Employee implements InitializingBean, DisposableBean {

    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", id=" + id + '}';
    }

    public void init() {
        System.out.println("inside init method");
    }
    public void hakai() {
        System.out.println("inside hakai method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("inside afterPropertiesSet method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("inside destroy method");
    }
}
