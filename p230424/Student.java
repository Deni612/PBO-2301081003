
package pbo2301081003.p230424;


public class Student extends Person {
    public Student(){
        super();
        //super("zan", "Bukittinggi");
        super.name = "Zann";
        super.address = "Bukittinggi";
        System.out.println("Inside Student Constructor");
    }
    
    @Override
    public String getName(){
        System.out.println("Student: getName");
        return name;
    }
}
