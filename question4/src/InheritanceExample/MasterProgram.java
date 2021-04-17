/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritanceExample;

/**
 *
 * @author S542052
 */
public class MasterProgram extends BaseProgram {
    String programName = "inheritance example";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MasterProgram mpobj = new MasterProgram();
        
        System.out.println(mpobj.getUniverssityName());
        System.out.println(mpobj.getRole());
        System.out.println(mpobj.programName);
        mpobj.baseClassMethod();
        
        
    }
    
}
