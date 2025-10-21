package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(int employeeId, String name, String department, double hoursWorked, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getTotalPay () {
        if (hoursWorked <= 40) {
            return payRate * hoursWorked;
        } else {
            return (40 * hoursWorked) + ((hoursWorked - 40) + (payRate * 1.5));
        }
    }

    public double getRegularHours() {
        if (hoursWorked <= 40) {
            return hoursWorked;
        }
        return 40;
    }

    public double getOvertimeHours() {
        if (hoursWorked > 40)
            return hoursWorked - 40;
        return 0;
    }

    public void punchTimeCard(double startTime, double endTime) {
        double employeeHoursWorked = endTime - startTime;
        hoursWorked += employeeHoursWorked;
    }
}
