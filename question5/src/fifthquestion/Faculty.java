/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifthquestion;

/**
 *
 * @author Pruthvi Raj Padthe
 */
public class Faculty extends Employee{
    private String oHours;
    private int nSub;

    public Faculty(String oHours, int nSub, String office, double salary, String hdate, String name, String address, String pNumber, String email) {
        super(office, salary, hdate, name, address, pNumber, email);
        this.oHours = oHours;
        this.nSub = nSub;
    }

    public String getoHours() {
        return oHours;
    }

    public void setoHours(String oHours) {
        this.oHours = oHours;
    }

    public int getnSub() {
        return nSub;
    }

    public void setnSub(int nSub) {
        this.nSub = nSub;
    }

    @Override
    public String toString() {
        return super.getName()+" - from class Faculty";
    }
    
    
}