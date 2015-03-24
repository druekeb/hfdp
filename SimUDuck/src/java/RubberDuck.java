/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barbara
 */
public class RubberDuck extends Duck{
    
    public RubberDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
        
    }
    
    public void display(){
        System.out.println("I'm a real rubber duck!");
    }
    
}
