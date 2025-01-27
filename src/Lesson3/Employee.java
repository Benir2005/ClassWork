package Lesson3;

public class Employee {
    // Setting modifiers to protected will help me access attributes
    //Within the same package (Lesson3)
    protected int EmployeeID;
    protected String Name;
    protected int ssn;
    protected double salary;
    // Put in the constructor with arguments
    Employee(){

    }
    //Constructor overloading- There are 2 different constructors of the same class
    Employee(int EmployeeID,String Name, int ssn, double salary){
        this.EmployeeID=EmployeeID;
        this.Name=Name;
        this.ssn=ssn;
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
    }
    public double getSSN(){
        return ssn;
    }
    public String getName(){
        return Name;
    }
    public double getID(){
        return EmployeeID;
    }
    public void setName(String n){
        this.Name=n;
    }
    public void raiseSalary(double increase){
        salary+=increase;
        //this.salary=this.salary+increase;-- Try this in your free time and see what happens
    }
    // We now work on the children

}
