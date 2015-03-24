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


public class StatisticsDisplay implements Observer, Display {
        private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
	private Measurements measurements;
        private Subject weatherData;
    

	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(Measurements m) {
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

	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
			+ "/" + maxTemp + "/" + minTemp);
	}
}
