/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thirdquestion;

/**
 *
 * @author Pruthvi Raj Padthe
 */
public class Circle {
    private double cri;
    private double area;

    public Circle(double cr) {
        this.cri = cri;
    }

    public double getCri() {
        return cri;
    }

    public double getArea() {
        return Math.PI*cri*cri;
    }

    @Override
    public String toString() {
        return "Circle{" + "cri=" + cri + ", area=" + getArea() + '}';
    }
    
    
    
}