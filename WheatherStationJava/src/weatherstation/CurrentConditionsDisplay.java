/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation;
import java.util.*;
/**
 *
 * @author barbara
 */
public class CurrentConditionsDisplay implements Display, Observer{
    private Measurements measurements;
    private WeatherData weatherData;
    
    public CurrentConditionsDisplay(WeatherData wd){
        this.weatherData = wd;
        wd.addObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Temperature: " + this.measurements.temp);
        System.out.println("Humidity: " + this.measurements.humidity);
        System.out.println("Pressure: " + this.measurements.pressure);
        
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData wd = (WeatherData) o;
            this.measurements = wd.getMeasurements();
        display();

        }
    }
    
}
