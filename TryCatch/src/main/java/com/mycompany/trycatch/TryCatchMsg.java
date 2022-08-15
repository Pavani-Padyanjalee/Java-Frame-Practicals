/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trycatch;

/**
 *
 * @author deepika
 */
public class TryCatchMsg {
    public static void main (String[]args) {
        try{
            int a = 10;
            int b = 0;
            int c = a/b;
            System.out.println("C is = "+c);
        }
        catch (Exception e) {
            System.out.println("Division by zero : "+e.getMessage());
        }
    }
}
