/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.employeemanagmentsystem;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class EmployeeManagementSystemTest {
    
    public EmployeeManagementSystemTest() {
    }
    
    
    @Test
    public void testAddEmployee() {
        System.out.println("addEmployee");
        Employee employee = null;
        EmployeeManagementSystem instance = new EmployeeManagementSystem();
        instance.addEmployee(employee);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editEmployee method, of class EmployeeManagementSystem.
     */
    @Test
    public void testEditEmployee() {
        System.out.println("editEmployee");
        EmployeeManagementSystem instance = new EmployeeManagementSystem();
        instance.editEmployee();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeEmployee method, of class EmployeeManagementSystem.
     */
    @Test
    public void testRemoveEmployee() {
        System.out.println("removeEmployee");
        EmployeeManagementSystem instance = new EmployeeManagementSystem();
        instance.removeEmployee();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of markAttendance method, of class EmployeeManagementSystem.
     */
    @Test
    public void testMarkAttendance() {
        System.out.println("markAttendance");
        EmployeeManagementSystem instance = new EmployeeManagementSystem();
        instance.markAttendance();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of trackPayroll method, of class EmployeeManagementSystem.
     */
    @Test
    public void testTrackPayroll() {
        System.out.println("trackPayroll");
        EmployeeManagementSystem instance = new EmployeeManagementSystem();
        instance.trackPayroll();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printEmployeeReport method, of class EmployeeManagementSystem.
     */
    @Test
    public void testPrintEmployeeReport() {
        System.out.println("printEmployeeReport");
        EmployeeManagementSystem instance = new EmployeeManagementSystem();
        instance.printEmployeeReport();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmployees method, of class EmployeeManagementSystem.
     */
    @Test
    public void testGetEmployees() {
        System.out.println("getEmployees");
        String id = "";
        EmployeeManagementSystem instance = new EmployeeManagementSystem();
        instance.getEmployees(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of start method, of class EmployeeManagementSystem.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        EmployeeManagementSystem instance = new EmployeeManagementSystem();
        instance.start();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class EmployeeManagementSystem.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        EmployeeManagementSystem.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
