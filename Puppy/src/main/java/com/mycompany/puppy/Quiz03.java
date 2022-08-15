/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.puppy;

/**
 *
 * @author deepika
 */
import java.util.*;

public class Quiz03 {
    public static void main (String[]args) {
        Scanner ab = new Scanner (System.in);
        System.out.print("Please Enter the First number : ");
        int num1 = ab.nextInt();
        System.out.println("Please Enter the Second number : ");
        int num2 = ab.nextInt();
        
        System.out.print("Please Choose your operation type : ");
        System.out.println("1 - Addition");
        System.out.println("2 - Substraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.println("What is your choice : ");
        int operator = ab.nextInt();
        
        if (operator == 1) {
            addition(num1,num2);}
        if (operator == 2) {
            substraction(num1,num2);}
        if (operator == 3) {
            multiplication(num1,num2);}
        if (operator == 4) {
            division(num1,num2);}
        ab.close();
        }
    public static void addition (int num1,int num2) {
    System.out.println("Addition = "+ (num1+num2));
    }
    public static void substraction (int num1,int num2) {
    System.out.println("Substraction = "+ (num1-num2));
    }
    public static void multiplication (int num1,int num2) {
    System.out.println("Multipication = "+ (num1*num2));
    }
    public static void division (int num1,int num2) {
    System.out.println("Division = "+ (num1/num2));
    }
}
