/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.trycatch;

/**
 *
 * @author deepika
 */
public class TryCatch {

    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a/b;
            
            System.out.println("C is :" +c);
        }
        catch (ArithmeticException e)
        {
            System.out.println ("Divided by zero : "+e);
        }
            System.out.println("Exception Handling");
    }
}
