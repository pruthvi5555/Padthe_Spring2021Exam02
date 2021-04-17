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
public class BaseProgram {
    private String role = "Developer";
    private String UniversityName = "NWMS";
    
    public String getRole(){
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getUniverssityName() {
        return UniversityName;
    }
    public void setUniversityName(String UniversityName) {
        this.UniversityName = UniversityName;
    }
    void baseClassMethod() {
        System.out.println("UnitTesting a Program");
    }
}
