/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab7;

/**
 *
 * @author TUONG VY
 */
public class FullTime extends Employee{

    private double basicSalary;

    public FullTime(String id, String name, double basicSalary) {
        super(id, name);
        this.basicSalary = basicSalary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public double getSalary() {
        return basicSalary;
    }

    @Override
    public String toString() {
        return "FullTime{" + "basicSalary=" + basicSalary + '}';
    }

    
    
}

    

