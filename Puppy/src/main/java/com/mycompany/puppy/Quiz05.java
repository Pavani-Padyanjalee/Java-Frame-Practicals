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

public class Quiz05 {
    public static void main(String[]args) {
        Scanner key = new Scanner (System.in);
        int answer1,answer2,answer3,answer4,score=0;
        System.out.println("Are you ready for a quiz ? ");
        key.next();
        System.out.println("OK, Here it comes");
        System.out.println();
        
        System.out.println("Q1. What is the capital city of Alaska?");
        System.out.println("1.Melborn");
        System.out.println("2.Anchorage");
        System.out.println("3.Juneau");
        
        answer1 = key.nextInt();       
        if(answer1 == 3) {
            System.out.println("That's right!!! Well Done.");
            score++; }
        else {
            System.out.println("Sorry, the answer is incorrect.");}
                    
        System.out.println("Q2. Can you store the value of /Dog/ in a variable of type int?");
        System.out.println("1.Yes");
        System.out.println("2.No");
        
        answer2 = key.nextInt();
        if(answer2 == 2) {
            System.out.println("That's right!!! Well Done.");
            score++; }
        else {
            System.out.println("Sorry, the answer is incorrect. Dog is a string. Int can only store numbers.");}
        
        System.out.println("Q3.When did Sri Lanka gain Freedom from English?");
        System.out.println("1.04/02/1948");
        System.out.println("2.02/04/1948");
        System.out.println("3.04/04/1948");
        
        answer3 = key.nextInt();
        if(answer3 == 1) {
            System.out.println("That's right!!! Well Done.");
            score++; }
        else {
            System.out.println("Sorry, the answer is incorrect.");
        
        System.out.println("Q4. What is mean by SDLC ?");
        System.out.println("1.Software Development Life Cycle.");
        System.out.println("2.System Development Life Cycle.");
        System.out.println("3.System Design Life Cycle.");
        
        answer4 = key.nextInt();
        if(answer4 == 1) {
            System.out.println("You got the right answer.");
            score++; }
        else {
            System.out.println("Sorry your choice is wrong.");
        }
        }
    }
        }
   
    

