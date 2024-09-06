package com.mycompany.employeemanagmentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagementSystem {
    private ArrayList<Employee> employees;
    private Attendance attendance;
    private Scanner scanner;

    public EmployeeManagementSystem() {
        employees = new ArrayList<>();
        attendance = new Attendance();
        scanner = new Scanner(System.in);
    }

    public void addEmployee(Employee employee) {
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Employee ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Employee Position: ");
        String position = scanner.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        employees.add(new Employee(name, id, position, salary));
        System.out.println("Employee added successfully!");
    }

    public void editEmployee() {
        System.out.print("Enter Employee ID to edit: ");
        String id = scanner.nextLine();
        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                System.out.print("Enter new Name (leave blank to skip): ");
                String name = scanner.nextLine();
                System.out.print("Enter new Position (leave blank to skip): ");
                String position = scanner.nextLine();
                System.out.print("Enter new Salary (leave blank to skip): ");
                String salaryInput = scanner.nextLine();

                if (!name.isEmpty()) employee.setName(name);
                if (!position.isEmpty()) employee.setPosition(position);
                if (!salaryInput.isEmpty()) employee.setSalary(Double.parseDouble(salaryInput));

                System.out.println("Employee updated successfully!");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public void removeEmployee() {
        System.out.print("Enter Employee ID to remove: ");
        String id = scanner.nextLine();
        employees.removeIf(employee -> employee.getId().equals(id));
        System.out.println("Employee removed successfully.");
    }

    public void markAttendance() {
        System.out.print("Enter Employee ID to mark attendance: ");
        String id = scanner.nextLine();
        System.out.print("Is the employee present? (true/false): ");
        boolean present = scanner.nextBoolean();
        attendance.markAttendance(id, present);
        System.out.println("Attendance marked successfully!");
    }

    public void trackPayroll() {
        System.out.print("Enter Employee ID for payroll calculation: ");
        String id = scanner.nextLine();
        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                double payroll = employee.calculatePayroll();
                System.out.println("Payroll for " + employee.getName() + " is $" + payroll);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public void printEmployeeReport() {
        System.out.println("\nEmployee Report:");
        for (Employee employee : employees) {
            System.out.println(employee);
            System.out.println("Attendance: " + (attendance.isPresent(employee.getId()) ? "Present" : "Absent"));
        }
    }
    public void getEmployees(String id) {
        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                return;
            }
        }
       
    }

    public void start() {
        while (true) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Edit Employee");
            System.out.println("3. Remove Employee");
            System.out.println("4. Mark Attendance");
            System.out.println("5. Calculate Payroll");
            System.out.println("6. Print Employee Report");
            System.out.println("7. Exit");
            System.out.print("Select an option: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (option) {
                case 1:
                    addEmployee(new Employee("Alice", "E001", "Developer", 60000));
                    break;
                case 2:
                    editEmployee();
                    break;
                case 3:
                    removeEmployee();
                    break;
                case 4:
                    markAttendance();
                    break;
                case 5:
                    trackPayroll();
                    break;
                case 6:
                    printEmployeeReport();
                    break;
                case 7:
                    System.out.println("Exiting Employee Management System.");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
    

    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem();
        system.start();
    }
}
