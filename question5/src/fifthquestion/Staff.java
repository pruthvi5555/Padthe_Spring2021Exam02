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
public class Staff extends Employee{
    private String title;

    public Staff(String title, String office, double salary, String hdate, String name, String address, String pNumber, String email) {
        super(office, salary, hdate, name, address, pNumber, email);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return super.getName()+" - from class Staff";
    }
    
    
}