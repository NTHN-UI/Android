import QuanLyNhanVien.Employee;
import QuanLyNhanVien.ListEmployee;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ListEmployee ls = new ListEmployee();
        ls.createEmployee();

        System.out.println("List of 10 employees:");
        ls.displayEmployeeList();

        Scanner sc = new Scanner(System.in);
        System.out.println("\nAdd a new employee:");
        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        System.out.print("Enter employee age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter employee department: ");
        String department = sc.nextLine();
        System.out.print("Enter employee code: ");
        String code = sc.nextLine();
        System.out.print("Enter employee salary rate: ");
        double salaryRate = sc.nextDouble();

        Employee newEmp = new Employee(id, name, age, department, code, salaryRate);
        ls.addEmployee(newEmp);
        System.out.println("\nList after addition:");
        ls.displayEmployeeList();
        System.out.print("\nEnter the ID of the employee to remove: ");
        int removeId = sc.nextInt();
        ls.removeEmployee(removeId);

        System.out.println("\nList after remove:");
        ls.displayEmployeeList();

        sc.close();




    }
}