package com.staticfactorymethod.test;

import com.staticfactorymethod.beans.Team;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class DriverClass {
    public static void main(String[] args) {
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/staticfactorymethod/common/application-Context.xml"));
        Team team = factory.getBean("team", Team.class);
        System.out.println(team);
    }
}
