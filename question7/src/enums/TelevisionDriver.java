/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author S542052
 */
public class TelevisionDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Television tele = Television.LED;  
	if(tele == Television.QLED) {
	    System.out.println("TELEVISION IS: QLED");
	} else if(tele == Television.OLED) {
	    System.out.println("TELEVISION IS: OLED");
	  } else if(tele == Television.LED) {
              System.out.println("Answer for Question 7 : Pruthvi Raj Padthe");
	      System.out.println("TELEVISION IS: LED");
  	    } else {
		System.out.println("TELEVISION IS: LCD");
	      }
   }
    
}
