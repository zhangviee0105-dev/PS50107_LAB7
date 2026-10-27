/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab7;

/**
 *
 * @author TUONG VY
 */
public class CardPay implements Pay {
    @Override
    public double pay(double amount) {
        double tienGiam = amount * 0.95;
        return tienGiam + tienGiam * TAX;
    }
}

    

