/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab7;

/**
 *
 * @author TUONG VY
 */
public class DichVuSV {
 
    public static void main(String[] args) {
        EmpService service = new EmpSerImpl();

        Employee nv1 = new FullTime("FT01", "Nguyen Van An", 12000000);
        Employee nv2 = new PartTime("PT01", "Tran Thi Binh", 80, 50000);

        Employee nv3 = new FullTime("FT02", "Le Van Cuong", 15500000);

        Employee nv4 = new FullTime("ft01", "Ngo Van Giang", 9000000);

        if (service.add(nv1)) {
            System.out.println("Them thanh cong: " + nv1.getId());
        } else {
            System.out.println("Them that bai, trung ID: " + nv1.getId());
        }

        if (service.add(nv2)) {
            System.out.println("Them thanh cong: " + nv2.getId());
        } else {
            System.out.println("Them that bai, trung ID: " + nv2.getId());
        }

        if (service.add(nv3)) {
            System.out.println("Them thanh cong: " + nv3.getId());
        } else {
            System.out.println("Them that bai, trung ID: " + nv3.getId());
        }

        if (service.add(nv4)) {
            System.out.println("Them thanh cong: " + nv4.getId());
        } else {
            System.out.println("Them that bai, trung ID: " + nv4.getId());
        }

        Employee tim1 = service.findById("pt01");

        if (tim1 != null) {
            System.out.println("Tim thay: " + tim1.toString());
        } else {
            System.out.println("Khong tim thay nhan vien pt01");
        }

        Employee tim2 = service.findById("XX99");

        if (tim2 != null) {
            System.out.println("Tim thay: " + tim2.toString());
        } else {
            System.out.println("Khong tim thay nhan vien XX99");
        }

        System.out.println("=== DANH SACH NHAN VIEN ===");

        for (int i = 0; i < service.getAll().size(); i++) {
            Employee e = service.getAll().get(i);

            System.out.println(e.toString()
                    + " -> Luong: "
                    + String.format("%.0f", e.getSalary()));
        }

        System.out.printf("Tong luong: %.0f%n",
                service.getTotalSalary());
    }
}

    

