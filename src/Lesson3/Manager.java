package Lesson3;
import javax.swing.*;
public class Manager extends Employee{
    //Constructors are NEVER inherited
    // A child class inherits the properties of a parent
    // What are the attributes of the manager?
    private String deptName;
    public Manager(){

    }
    public Manager(int EmployeeID,String Name, int ssn, double salary,String deptName){
        super(EmployeeID,Name,ssn, salary);
        // Added a parameter to make our constructor unique
        this.deptName=deptName;

    }
    public String getDeptName(){
        return deptName;
    }
}
class RoundWindow extends JFrame{
    //Modifying a class from the baseclass
}