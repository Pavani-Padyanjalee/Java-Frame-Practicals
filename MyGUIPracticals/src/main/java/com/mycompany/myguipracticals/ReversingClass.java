/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myguipracticals;

/**
 *
 * @author ICT5
 */
import java.util.*;
public class ReversingClass {
    public static void main(String []paani) {
        
        String reverse = "";
        
        Scanner as = new Scanner(System.in);
        System.out.print("Enter the String to be reversed.. : ");
        
        String original = as.nextLine();
        int length = original.length();
        
        for (int a = (length-1); a >=0 ; a--)
        reverse = reverse + original.charAt(a);
        
        System.out.println("Reverse of the String : "+reverse);
    }
    
    
}
