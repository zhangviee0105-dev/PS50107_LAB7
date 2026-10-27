/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.poly.lab7;
import java.util.List;


/**
 *
 * @author TUONG VY
 */
public interface EmpService {
    
    boolean add(Employee e);
    Employee findById(String id);
    List<Employee> getAll();
    double getTotalSalary();
}
    

