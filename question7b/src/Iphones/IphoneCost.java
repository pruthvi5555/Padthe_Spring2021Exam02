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
public enum IphoneCost {
    Iphone10(600),Iphone11(800),Iphone12(1000);
    
    private double price;

    private IphoneCost(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    
}
