/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starbuzz;

/**
 *
 * @author barbara
 */
public class Starbuzz{  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SizeEnum se = SizeEnum.BIG;
        Beverage dR = new DarkRoast(se);
        dR = new Soy(dR);
        dR = new Mocha(dR);
        System.out.println(dR.getDescription(se));
        System.out.println(dR.cost() + " $");
        
        Beverage eP = new Whip(new Mocha(new Espresso(se)));
        System.out.println(eP.getDescription(se) +"\t"+eP.cost()+" $");
        // TODO code application logic here
    }
    
}
