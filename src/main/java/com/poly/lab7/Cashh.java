/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab7;

/**
 *
 * @author TUONG VY
 */
public class Cashh implements Pay{
    

    @Override
    public double pay(double amount) {
        return amount + amount * TAX;
    }
}


