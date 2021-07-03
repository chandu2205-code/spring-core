package com.utilcollectiondi.test;

import com.utilcollectiondi.beans.Team;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class DriverCode {
    public static void main(String[] args) {
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/utilcollectiondi/common/applicationContext.xml"));
        Team team = factory.getBean("team", Team.class);
        System.out.println(team);
    }
}
