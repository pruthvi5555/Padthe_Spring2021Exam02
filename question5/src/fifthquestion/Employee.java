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
public class Employee extends Person {
    private String office;
    private double salary;
    private String hdate;

    public Employee(String office, double salary, String hdate, String name, String address, String pNumber, String email) {
        super(name, address, pNumber, email);
        this.office = office;
        this.salary = salary;
        this.hdate = hdate;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getHdate() {
        return hdate;
    }

    public void setHdate(String hdate) {
        this.hdate = hdate;
    }

    @Override
    public String toString() {
        return super.getName()+" - from class Employee";
    }
    
    
}