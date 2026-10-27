/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author TUONG VY
 */
public class QuanLy {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new FullTime("FT01", "Nguyen Van An", 12000000));
        list.add(new PartTime("PT01", "Tran Thi Binh", 80, 50000));
        list.add(new FullTime("FT02", "Le Van Cuong", 15500000));
        list.add(new PartTime("PT02", "Pham Thi Dung", 120, 60000));
        list.add(new PartTime("PT03", "Hoang Van Em", 200, 90000));

        System.out.println("=== DANH SACH NHAN VIEN ===");

        double tong = 0;

        for (int i = 0; i < list.size(); i++) {
            Employee e = list.get(i);

            System.out.println(e.toString()
                    + " -> Luong: "
                    + String.format("%.0f", e.getSalary()));

            tong = tong + e.getSalary();
        }

        System.out.printf("Tong quy luong: %.0f%n", tong);

        Employee max = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getSalary() > max.getSalary()) {
                max = list.get(i);
            }
        }

        System.out.println("Nhan vien luong cao nhat: "
                + max.toString()
                + " -> Luong: "
                + String.format("%.0f", max.getSalary()));

        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee a, Employee b) {
                return Double.compare(b.getSalary(), a.getSalary());
            }
        });

        System.out.println("=== SAP XEP THEO LUONG GIAM DAN ===");

        for (int i = 0; i < list.size(); i++) {
            Employee e = list.get(i);

            System.out.println(e.toString()
                    + " -> Luong: "
                    + String.format("%.0f", e.getSalary()));
        }
    }
}


