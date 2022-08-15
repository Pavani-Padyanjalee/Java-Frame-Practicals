/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignments;

/**
 *
 * @author ICT5
 */
import java.util.Random;
import java.util.*;

public class Quiz02 {
    public static void main (String[]args){
        
    Scanner ab = new Scanner (System.in);
    System.out.println("Enter Number between 1-10 : ");
    int num1 = ab.nextInt();
    
    Random a = new Random();
    int num2 = a.nextInt(1,10);
    System.out.println(num2);
    
    if (num1==num2) {
        System.out.println("Number is correct.");
    }
    else {
        System.out.println("Incorrect Number. Correct Number = "+ num2);
    }
    }
    
    
    
}
