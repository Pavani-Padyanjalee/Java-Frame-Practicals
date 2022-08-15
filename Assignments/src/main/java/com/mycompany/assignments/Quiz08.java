/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignments;

/**
 *
 * @author ICT5
 */
import java.util.*;

public class Quiz08 {
    public static void main(String[]args) {
        int num;
        int p;
        int sum = 0;
        Scanner pp = new Scanner (System.in);
        System.out.print("Enter the number : ");
        num = pp.nextInt();
        
        while(num>0) {
            p = num%10;
            sum = sum +p;
            num = num/10;
            
        System.out.println("Sum of Digits" +sum);
        
        }
    }
    
}
