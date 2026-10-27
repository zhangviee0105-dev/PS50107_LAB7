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
public class ThanhToan {
    public static void main(String[] args) {
        double[] donHang = {100000, 250000, 1000000};

        List<Pay> methods = new ArrayList<>();
        methods.add(new Cashh());
        methods.add(new CardPay());

        for (int i = 0; i < donHang.length; i++) {
            double amount = donHang[i];

            double tienMat = methods.get(0).pay(amount);
            double the = methods.get(1).pay(amount);

            System.out.printf(
                    "Don hang %.0f: Tien mat = %.0f | The = %.0f%n",
                    amount, tienMat, the);
        }
    }
    
}
