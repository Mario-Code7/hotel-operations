package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    private Double punchInTime = null;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }


    public void timePunchCard(double time) {
        if (time < 0 || time > 24) {
            throw new IllegalArgumentException("Time must be between 0 and 24 hours.");
        }
        if (punchInTime == null) {
            punchInTime = time;
            System.out.println(name + " punched in at" + time);
        } else if (time > punchInTime) {
            throw new IllegalArgumentException("Punch-out cannot be earlier than punch in time.");
        }
        double worked = time - punchInTime;
        hoursWorked += worked;
        System.out.println(name + " punched out at" + time + " .Worked" + worked + " hours.");
        punchInTime = null;
    }



//    public void punchIn(double time){
//        if (punchInTime != null) {
//            System.out.println("Punched in at " + punchInTime + ". Punch out first");
//            return;
//        }
//        punchInTime = time;
//        System.out.println(name + "punched in at " + time);
//    }
//
//    public void punchOut(double time){
//        if (punchInTime == null) {
//            System.out.println("Cannot punch out before punching in first");
//            return;
//        }
//        if (time < punchInTime) {
//            System.out.println("Punch cannot be earlier than punch in time");
//        }
//
//        double worked = time - punchInTime;
//        hoursWorked += worked;
//        System.out.println(name + " punched out at " + time + ". worked" + worked + "hours. ");
//        punchInTime = null;

//    public double REGULAR_HOURS = 40;

//    public double getTotalPay(){
//        double totalPay = this.payRate * this.hoursWorked;
//        return totalPay;
//    }
//
//    public double getRegularHours(){
//        if (hoursWorked < REGULAR_HOURS) {
//            return hoursWorked;
//        } else {
//            return REGULAR_HOURS;
//        }
//    }
//
//    public double getOvertimeHours(){
//        if (hoursWorked > REGULAR_HOURS) {
//            return hoursWorked - REGULAR_HOURS;
//        } else {
//            return 0;
//        }
//    }

    public double getRegularHours() {
        return Math.min(40, hoursWorked);
    }

    public double getOvertimeHours(){
        return Math.max(0, hoursWorked - 40);
    }

    public double getTotalPay(){
        double regularPay = getRegularHours() * payRate;
        double overtimePay = getOvertimeHours() * payRate * 1.5;
        return regularPay + overtimePay;
    }
}
