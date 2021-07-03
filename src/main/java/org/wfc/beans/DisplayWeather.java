package org.wfc.beans;

public class DisplayWeather {
    private IWeatherForecastor forecastor;

    public void displayWeather(String zipCode) {
        System.out.println(forecastor.foreCastWeather(zipCode));
    }

    public void setForecastor(IWeatherForecastor forecastor) {
        this.forecastor = forecastor;
    }
}
