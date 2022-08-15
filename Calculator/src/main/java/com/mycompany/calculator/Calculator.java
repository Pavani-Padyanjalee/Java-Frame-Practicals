/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculator;

/**
 *
 * @author ICT5
 */
import java.util.*;
public class Calculator {
 
    public static void main(String[] args) {

        Scanner ab=new Scanner(System.in);
        
        System.out.print("Enter number 1 = ");
       int num1= ab.nextInt();
        System.out.print("Enter number 2 = ");
        int num2 = ab.nextInt();
        
       System.out.println("Choose your operator type");
       System.out.println("1.addition");
       System.out.println("2.Substraction");
       System.out.println("3.Multiplication");
       System.out.println("4.Division");
       
       System.out.println("What is your choice?");
        int operator = ab.nextInt();
       
       
       
       if (operator==1){
           addition(num1,num2);}
       
       else if (operator==2){
           substraction(num1,num2);}
       
       else if (operator==3){
           multiplication(num1,num2);}
       
       else if (operator==4){
           division(num1,num2);}
    }
      
       public static void addition(int num1,int num2){
           System.out.println("Result is =" +(num1+num2));}
       
        public static void substraction(int num1,int num2){
           System.out.println("Result is =" +(num1-num2));}
        
         public static void multiplication(int num1,int num2){
           System.out.println("Result is =" +(num1*num2));}
         
          public static void division(int num1,int num2){
           System.out.println("Result is =" +(num1/num2));}

          

}
