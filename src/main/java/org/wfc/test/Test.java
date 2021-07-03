package org.wfc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.wfc.beans.DisplayWeather;
import org.wfc.beans.GoogleWeatherForecastor;
import org.wfc.beans.IWeatherForecastor;


public class Test {
    public static void main(String[] args) {
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("org/wfc/common/application-context.xml"));
        IWeatherForecastor forecastor = factory.getBean("google", GoogleWeatherForecastor.class);
        DisplayWeather weather = factory.getBean("display",DisplayWeather.class);
        weather.displayWeather("2020");
    }
}
