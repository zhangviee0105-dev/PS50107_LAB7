/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab7;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author TUONG VY
 */
public class EmpSerImpl implements EmpService{

    private List<Employee> list = new ArrayList<>();

    @Override
    public boolean add(Employee e) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equalsIgnoreCase(e.getId())) {
                return false;
            }
        }

        list.add(e);
        return true;
    }

    @Override
    public Employee findById(String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equalsIgnoreCase(id)) {
                return list.get(i);
            }
        }

        return null;
    }

    @Override
    public List<Employee> getAll() {
        return list;
    }

    @Override
    public double getTotalSalary() {
        double tong = 0;

        for (int i = 0; i < list.size(); i++) {
            tong = tong + list.get(i).getSalary();
        }

        return tong;
    }
}


