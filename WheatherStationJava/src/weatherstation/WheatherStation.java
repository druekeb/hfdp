/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation;

/**
 *
 * @author barbara
 */
public  class WheatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        
        CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay std = new StatisticsDisplay(weatherData);
        ForecastDisplay fcd = new ForecastDisplay(weatherData);
        HeatIndexDisplay hid = new HeatIndexDisplay(weatherData);
        weatherData.setMeasurements(new Measurements(89,76,23.4f));
        weatherData.setMeasurements(new Measurements(81,69,25.4f));
        weatherData.setMeasurements(new Measurements(85,66,30.4f));
    }
            
}
