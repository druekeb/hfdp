/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation;
import java.util.Observable;
import java.util.Observer;
/**
 *
 * @author barbara
 */
public class ForecastDisplay implements Display, Observer{
    
        private float currentPressure = 29.92f;  
	private float lastPressure;
	private Observable weatherData;

	public ForecastDisplay(Observable weatherData) {
		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}

	public void update(Measurements m) {
                
	}

	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData wd = (WeatherData) o;
            Measurements m  = wd.getMeasurements();
            lastPressure = currentPressure;
            currentPressure =  m.pressure;
            display();
         }
        
    }
    
}
