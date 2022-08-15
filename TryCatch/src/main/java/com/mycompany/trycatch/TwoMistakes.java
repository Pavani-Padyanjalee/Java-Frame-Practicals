/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trycatch;

/**
 *
 * @author deepika
 */
public class TwoMistakes {
    public static void main(String[]args) {
        
        int a=30;
        int b=0, result;
        
        int []array = {22,33,44};
    
    
    try {
    result = a/b;
    result = array[a];
}
    catch (ArithmeticException Error) 
    {
        System.out.println("Arithmetic Error");
    }
    catch (IndexOutOfBoundsException Error)
    {
        System.out.println("Index Error");
    }
}
}

