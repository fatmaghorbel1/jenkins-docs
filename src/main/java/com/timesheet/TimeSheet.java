package com.timesheet;

public class TimeSheet {
    private String employeeName;
    private int hoursWorked;
    
    public TimeSheet(String employeeName, int hoursWorked) {
        this.employeeName = employeeName;
        this.hoursWorked = hoursWorked;
    }
    
    public String getEmployeeName() {
        return employeeName;
    }
    
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    
    public int getHoursWorked() {
        return hoursWorked;
    }
    
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
    public void displayInfo() {
        System.out.println("Employee: " + employeeName);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Status: " + (hoursWorked >= 40 ? "Full Time" : "Part Time"));
    }
}
