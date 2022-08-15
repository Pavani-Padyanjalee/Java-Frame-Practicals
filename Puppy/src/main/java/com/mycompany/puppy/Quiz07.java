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

public class Quiz07 {
    public static void main(String []args) {
        Scanner as = new Scanner(System.in);
        System.out.println ("Enter a Number : ");
        int num1 = as.nextInt();
        System.out.println ("The Squareroot of " +num1+ " is : "+squareRoot(num1));
                    
    }
public static double squareRoot (int num2) {
        double temp;
        double sqrtroot = num2/2;
        do
        {
        temp = sqrtroot;
        sqrtroot = (temp+(num2/temp))/2;
}
        while ((temp-sqrtroot)!=0);
        return sqrtroot;
}}