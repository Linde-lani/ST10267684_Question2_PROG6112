package com.mycompany.employeemanagmentsystem;

import java.util.HashMap;

public class Attendance {
    private HashMap<String, Boolean> attendanceRecords;

    public Attendance() {
        attendanceRecords = new HashMap<>();
    }

    public void markAttendance(String employeeId, boolean present) {
        attendanceRecords.put(employeeId, present);
    }

    public boolean isPresent(String employeeId) {
        return attendanceRecords.getOrDefault(employeeId, false);
    }
}

