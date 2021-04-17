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
public class Loan {
    private double lduration;
    private double lamount;

    public Loan(double lduration, double lamtount) {
        this.lduration = lduration;
        this.lamount = lamount;
    }

    public double getLduration() {
        return lduration;
    }

    public double getLamount() {
        return lamount;
    }

    @Override
    public String toString() {
        return "Loan{" + "lduration=" + lduration + ", lamount=" + lamount + '}';
    }
    
    
    
}
