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
public class FifthDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person person = new Person("shekar","NEWYORK","9999","6758@gmail.com");
        System.out.println(person.toString());
        Student student = new Student(3.8,"vamshi","DALLAS","3456","3456@icloud.com");
        System.out.println(student.toString());
        Employee emp = new Employee("keerthan",5800.00,"14-9-2020","shreyas","TEMPE","907","907@gmail.com");
        System.out.println(emp.toString());
        Faculty faculty = new Faculty("6-2",5,"URF",5200.00,"15-9-2020","Uday","PHENIOX","786","786@yahoo.com");
        System.out.println(faculty.toString());
        Staff st = new Staff("Prem","VIP",9000.00,"12-6-2019","Surya","DEN","986","986@hotmail.com");
        System.out.println(st.toString());
    }
    
}