/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeemanagmentsystem;

public class LeaveRequest {
    private String employeeId;
    private String reason;

    public LeaveRequest(String employeeId, String reason) {
        this.employeeId = employeeId;
        this.reason = reason;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Leave Request (Employee ID: " + employeeId + ", Reason: " + reason + ")";
    }
}