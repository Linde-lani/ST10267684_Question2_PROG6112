/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeemanagmentsystem;

public class Employee extends Person {
    private String position;
    private double salary;
    private int hoursWorked;

    public Employee(String name, String id, String position, double salary) {
        super(name, id);
        this.position = position;
        this.salary = salary;
        this.hoursWorked = 0; // Default hours worked
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void addHoursWorked(int hours) {
        this.hoursWorked += hours;
    }

    public double calculatePayroll() {
        return salary / 240 * hoursWorked; // Example calculation based on a 240-hour work month
    }

    @Override
    public String toString() {
        return "Employee ID: " + getId() + ", Name: " + getName() + ", Position: " + position + ", Salary: $" + salary + ", Hours Worked: " + hoursWorked;
    }
}
