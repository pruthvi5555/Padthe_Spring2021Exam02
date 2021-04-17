/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thirdquestion;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Pruthvi Raj Padthe
 */
public class ThridDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Object> obj = new ArrayList<>();
        Loan ln = new Loan(8,130000);
        obj.add(ln);
        Date dt= new Date();
        obj.add(dt);
        String s="Question 3 String";
        obj.add(s);
        Circle cl = new Circle(3.4);
        obj.add(cl);
        for(Object a:obj){
            System.out.println(a.toString());
        }
    }
    
}