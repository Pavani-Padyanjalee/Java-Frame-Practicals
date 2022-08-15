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

public class Quiz01 {
    public static void main (String[]args) {
        Scanner as = new Scanner (System.in);
        System.out.println("Enter your age = ");
        int a = as.nextInt();
        
        if (a<16) {
            System.out.println("You cannot drive..");
            System.out.println ("You cannot vote..");
            System.out.println ("You cannot rent a house..");
        }
        else { if (a<18) { System.out.println ("You cannot vote..");
                           System.out.println ("You cannot rent a house..");}
        
        else { if (a<25) { System.out.println ("You cannot rent a house.."); }
        
        else {System.out.println("You can do anything that is legal..");}
        }
        }
        
    }
    
}
