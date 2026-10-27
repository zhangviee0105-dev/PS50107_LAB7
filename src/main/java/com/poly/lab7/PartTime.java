/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab7;

/**
 *
 * @author TUONG VY
 */
public class PartTime extends Employee{
    
    private int workHours;
    private double salaryPerHour;

    public PartTime(String id, String name,
            int workHours, double salaryPerHour) {
        super(id, name);
        this.workHours = workHours;
        this.salaryPerHour = salaryPerHour;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    @Override
    public double getSalary() {
        return workHours * salaryPerHour;
    }

    @Override
    public String toString() {
        return "PartTime{" + "workHours=" + workHours + ", salaryPerHour=" + salaryPerHour + '}';
    }

    
}

    

