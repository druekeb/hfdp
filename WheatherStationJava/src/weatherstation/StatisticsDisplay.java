/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation;
import java.util.Observer;
import java.util.Observable;
/**
 *
 * @author barbara
 */


public class StatisticsDisplay implements Observer, Display {
        private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
	private Measurements measurements;
        private WeatherData weatherData;
    

	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}

	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
			+ "/" + maxTemp + "/" + minTemp);
	}

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData wd = (WeatherData) o;
            Measurements m  = wd.getMeasurements();
            tempSum += m.temp;
            numReadings++;

            if (m.temp > maxTemp) {
		maxTemp = m.temp;
            }
 
            if (m.temp < minTemp) {
		minTemp = m.temp;
            }

            display();
        }
    }
}
