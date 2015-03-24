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
public class WeatherData implements Subject{
    private ArrayList<Observer> observers;
           
    private Measurements measurements;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }
    
    public void measurementsChanged(){
        notifyObservers();
    }
    @Override
    
    public void registerObserver(Observer o) {
        observers.add(o);
    }
    
    @Override
    public void removeObserver(Observer o) {
        if (observers.indexOf(o) >= 0){
        observers.remove(o);
        }
    }

    
    @Override
    public void notifyObservers() {
        for (Observer observer : observers){
            observer.update(getMeasurements());
        }
    }
    
    public Measurements getMeasurements() {
        return this.measurements;
    }

    public void setMeasurements(Measurements m) {
        this.measurements = m;
        measurementsChanged();
    }

    
}
