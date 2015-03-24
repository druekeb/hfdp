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
public class WeatherData extends Observable{
    private ArrayList<Observer> observers;
           
    private Measurements measurements;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }
    
    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }
    
    public Measurements getMeasurements() {
        return this.measurements;
    }

    public void setMeasurements(Measurements m) {
        this.measurements = m;
        measurementsChanged();
    }

    
}
