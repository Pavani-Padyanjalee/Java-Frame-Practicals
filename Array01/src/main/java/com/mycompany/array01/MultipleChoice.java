/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.multiplechoice;

import java.util.*;
public class MultipleChoice {
    public static void main (String args[]) {
        Scanner keyboard = new Scanner(System.in);
        int answer1,answer2, answer3,score=0;
        System.out.println("are you ready for the question");
        keyboard.next();
        //System.out.println("Yes");
        System.out.println();
        System.out.println("Ok,Here it comes");
        System.out.println();
        
        System.out.println("Q1.what is the capital of Alaska?");
        System.out.println("1.Melbern");
        System.out.println("2.Anchorage");
        System.out.println("3.Juneau");
        answer1 = keyboard.nextInt();
        System.out.println();
        if (answer1==3){
            System.out.println(" That's right!!Well Done.");
            score++;
        } 
        else {
            System.out.println(" Sorry,answer is incorrect");     
        }
        System.out.println();
       System.out.println("Q2.Can you store the value Dog in a variable of type int?");
       System.out.println("1.Yes");
       System.out.println("2.No");
       answer2 = keyboard.nextInt();
       System.out.println();
       if (answer2==2) {
           System.out.println("That's Right.");
           score++;
       }
       else {
           System.out.println("Your answer is incorrect");
       }
       System.out.println();
    System.out.println("Q3.What is the national flower of Sri Lnak?"); 
    System.out.println("1.Lily");
    System.out.println("2.Lotus");
    System.out.println("3.sun-FLower");
    answer3 =keyboard.nextInt();
    System.out.println();
    if (answer3==2) {
        System.out.println("That's Right!! WEll Done."); 
    score++;
    } else {
        System.out.println("Oops! Your answer is incorrect"); }
     System.out.println();
       System.out.println("Q4.Who is the president of Sri Lanka?");
       System.out.println("1.Mahinda Rajapaksha");
       System.out.println("2.Ranil Wickckramasinghe");
       System.out.println("3.Gotabaya rajapaksha");
       answer2 = keyboard.nextInt();
       System.out.println();
       if (answer2==3) {
           System.out.println("That's Right.Well Done.");
           score++;
       }
       else {
           System.out.println("Your answer is incorrect");
           System.out.println();
       }
        System.out.println();
        System.out.println("Overall,You got " + score + " out of 4 correct");
        System.out.println("Thank You!");     
    }
      
}
    
      
       
 
        
        
        
        
    


