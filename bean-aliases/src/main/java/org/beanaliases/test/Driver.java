package org.beanaliases.test;

import org.beanaliases.beans.Library;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jndi.support.SimpleJndiBeanFactory;

public class Driver {
    public static void main(String[] args) {
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/beanaliases/common/application-Context.xml"));
        Library library = factory.getBean("23A,Gujarat", Library.class);
        Library library1 = factory.getBean("name1", Library.class);
        Library library2 = factory.getBean("name2", Library.class);
        System.out.println(library);
        System.out.println(library1);
        System.out.println(library2);
        System.out.println(library.hashCode() == library1.hashCode());
    }
}
