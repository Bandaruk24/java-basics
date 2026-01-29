package MiniProjectEmployeeManagement.model;

public class Employee {
    //Encapsulation - Data is private, accessed via getters.
    private int id;
    private String name;
    private String department;
    private double salary;

    //constructor - Used to initialize object.
    public Employee(int id, String name, String department, double salary){
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }

    //Getters
    public int getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getDepartment(){
        return department;
    }

    public double getSalary(){
        return salary;
    }

    //Displaying employees full details.
    //toString() - Automatically called when printing object.
    @Override
    public String toString(){
        return id + "|" + name + "|" + department + "|" +salary;
    }
}
