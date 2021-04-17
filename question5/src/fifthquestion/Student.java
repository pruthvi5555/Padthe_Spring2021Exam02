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
public class Student extends Person {
    private double grade;
    private final static String STATUS="Graduate";

    public Student(double grade, String name, String address, String pNumber, String email) {
        super(name, address, pNumber, email);
        this.grade = grade;
    }
    
    @Override
    public String toString() {
        return super.getName()+" - from class Student";
    }
    
    
}