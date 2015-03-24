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
public class CurrentConditionsDisplay implements Display, Observer{
    private Measurements measurements;
    private Subject weatherData;
    
    public CurrentConditionsDisplay(Subject wd){
        this.weatherData = wd;
        wd.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Temperature: " + this.measurements.temp);
        System.out.println("Humidity: " + this.measurements.humidity);
        System.out.println("Pressure: " + this.measurements.pressure);
        
    }

    @Override
    public void update(Measurements m) {
        this.measurements = m;
        display();
    }
    
}
