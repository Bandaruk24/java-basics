package MiniProjectEmployeeManagement.Main;

import MiniProjectEmployeeManagement.model.Employee;
import MiniProjectEmployeeManagement.service.EmployeeService;
import java.util.*;

public class EmployeeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeService();

        while(true){
            System.out.println("\n 1.Add 2.View/Display 3.Filter 4.Find 5. Avg Salary 6.Sort 7.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("ID: ");
                    int id = sc.nextInt();
                    System.out.println("Name: ");
                    String name = sc.next();
                    System.out.println("Dept: ");
                    String dept = sc.next();
                    System.out.println("Salary: ");
                    double salary = sc.nextDouble();
                    service.addEmployee(new Employee(id, name, dept, salary));
                }
                case 2 -> service.displayEmployeeDetails();
                case 3 -> {
                    System.out.println("Department");
                    service.filterByDepartment(sc.next());
                }
                case 4 -> {
                    System.out.println("ID: ");
                    service.findById(sc.nextInt()).
                    ifPresentOrElse(System.out::println,
                         ()->System.out.println("EMployee Not Found"));
                }
                case 5 -> System.out.println("Average Salary: "+service.averageSalary());
                case 6 -> {
                    service.sortBySalary();
                    System.out.println("Sorted Successfully");
                }
                default -> {
                    sc.close();
                    return;
                }
            }
        }
    }
}
