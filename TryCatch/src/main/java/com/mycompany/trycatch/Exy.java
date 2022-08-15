/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trycatch;

/**
 *
 * @author deepika
 */
public class Exy {
    public static void main (String[]args) {
        try {
        int val = Integer.parseInt(args [0]);
        int a = Integer.parseInt(args [1]);
        int c = val/a;
        System.out.println(c);}
        
        catch (ArithmeticException e)
                {
                System.out.println("Divided by Zero");
                }
        finally
                {
                System.out.println("After catch statement");
                }
    }
    
}
