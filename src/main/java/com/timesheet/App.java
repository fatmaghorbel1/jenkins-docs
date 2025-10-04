package com.timesheet;

public class App {
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("Timesheet Application Started!");
        System.out.println("=================================");
        
        TimeSheet ts = new TimeSheet("Fatma", 40);
        ts.displayInfo();
    }
}
