package com.primitive.test;


import com.primitive.beans.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class DriverCode {
    public static void main(String[] args) {
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("com/primitive/common/application-context.xml"));
        Person p = bf.getBean("person", Person.class);
        System.out.println(p);
    }
}
