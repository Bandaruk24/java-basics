package MiniProjectEmployeeManagement.service;

import java.util.*;
import MiniProjectEmployeeManagement.model.Employee;
import java.util.stream.Collectors; 

public class EmployeeService {
    private List<Employee> employees = new ArrayList<>();

    //Add Employee
    public void addEmployee(Employee emp){
        employees.add(emp);
    }

    //Display all employees
    public void displayEmployeeDetails(){
        employees.forEach(System.out::println);
    }

    //Filter by department (Stream + filter)
    public void filterByDepartment(String dept){
        employees.stream().filter(e->e.getDepartment().
        equalsIgnoreCase(dept)).
        forEach(System.out::println);
    }

    //Find Employee by ID (Optional)
    public Optional<Employee> findById(int id){
        //Lambda Function used
        return employees.stream().filter(e->e.getID() == id).findFirst();
    }

    //Average Salary (Reduce + Map)
    public double averageSalary(){
        return employees.stream()
        .map(Employee::getSalary)
        .reduce(0.0,Double::sum) / employees.size();
    }

    //Sort by Salary (Method Reference)
    public void sortBySalary(){
        employees.sort(Comparator.comparing(Employee::getSalary));
    }
}
