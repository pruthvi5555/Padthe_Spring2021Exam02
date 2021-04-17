/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iphones;

/**
 *
 * @author S542052
 */
public class IphoneDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for Question 7 : Pruthvi Raj Padthe");
        System.out.println("Iphone 12 cost is : "+IphoneCost.Iphone12.getPrice());
        for (IphoneCost Iphone:IphoneCost.values()){
            System.out.println(Iphone+" is of cost $"+Iphone.getPrice());
        }
    }
    
}
