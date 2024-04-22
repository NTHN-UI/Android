package QuanLyNhanVien;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEmployee {
    ArrayList<Employee> employees;
    public ListEmployee() {
        employees = new ArrayList<>();
    }
    public void createEmployee() {
        for (int i = 1; i <= 10; i++) {
            Employee emp = new Employee(i, "Employee " + i, 25, "IT", "E00" + i, 1000);
            employees.add(emp);
        }

    }
    public void displayEmployeeList() {
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
    public void addEmployee(Employee emp) {

        employees.add(emp);
        System.out.println("Added new employee: " + emp);
    }

    public void removeEmployee(int id) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                employees.remove(emp);
                System.out.println("Removed employee: " + emp);
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found for removal!");
    }
}
