package com.collectioninjection.test;

import com.collectioninjection.beans.Team;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Driver {
    public static void main(String[] args) {
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/collectioninjection/common/application-context.xml"));
        Team team = factory.getBean("india",Team.class);
        System.out.println(team);
    }
}
