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

public class Quiz06 {
    public static void main(String[]args) {
        
        int x = 50;
        int i;
        Scanner we = new Scanner(System.in);
        Random r = new Random();
        int num1 = r.nextInt(10);
        
        for (i=0; i<x; i++) {
            System.out.println("Enter number between 1-10");
            int num2 = we.nextInt();
            
            if (num1 == num2) {
                System.out.println("Number is correct "+num2);
            break;}
            
            else {
                System.out.println("Incorrect number. Please try again.");
            
            continue;
            }
        }
    }
    
}
