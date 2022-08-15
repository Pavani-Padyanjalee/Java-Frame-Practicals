/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculation;

/**
 *
 * @author ICT5
 */
import java.util.*;
public class Calculation {

public static void main (String args[]){
    
Scanner in = new Scanner(System.in);
System.out.println("Enter num1:");
int num1 = in.nextInt();
System.out.println("Enter num2:");
int num2 = in.nextInt();

System.out.println ("Choose Your operator type");
System.out.println("1.addition");
System.out.println("2.substraction");
System.out.println("3.multiplication");
System.out.println("4.division");

System.out.println("What is your choice");
int  operator = in.nextInt();

if (operator==1) 
{ addition(num1,num2); }

else if (operator==2) 
  {substraction(num1,num2);}
    
else if (operator==3){ 
multiplication(num1,num2);}
            
    else if (operator==4) 
    {division(num1,num2); }
            
in.close();

}
public static void addition(int num1,int num2){
System.out.println("addition="+(num1+num2));} 

public static void substraction(int num1,int num2) {
System.out.println("substraction="+(num1-num2)); }

public static void multiplication (int num1,int num2) {
System.out.println("mutiplication="+(num1*num2));}
        
public static void division (int num1,int num2) {
System.out.println("devision="+(num1/num2));
}
        
}