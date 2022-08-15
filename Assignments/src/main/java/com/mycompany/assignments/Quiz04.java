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
public class Quiz04 {
    public static void main(String[]args){
        try{
            Scanner as = new Scanner(System.in);
            System.out.println("Enter your GPA value : ");
            Double a = as.nextDouble();
            
            if (a>3.6) {
                System.out.println("First Class Hons.."); }
            else if (3.6> a && a>=3.4) {
                System.out.println("Upper Second Class Hons.."); }
            else if (3.4> a && a>=3) {
                System.out.println("Lower Second Class Hons.."); }
            else if (3> a && a>=2){
                System.out.println("Pass..");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
