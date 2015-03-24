/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barbara
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
    public Duck(){
        
    }

    public void setFlyBehavior(FlyBehavior fB) {
        this.flyBehavior = fB;
    }

    public void setQuackBehavior(QuackBehavior qB) {
        this.quackBehavior = qB;
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }
    
    public abstract void display();
    
    public void performFly(){
        flyBehavior.fly();
    }
    
   public void performQuack(){
       quackBehavior.quack();
   }
   
   public void swim(){
       System.out.println("All ducks float, even decoys");
   }
   
   
}
