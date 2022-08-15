/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.Array01;

/**
 *
 * @author ICT5
 */
 import java.util.*;
public class ScanProject01 {
public static void main(String args[]){

	Scanner up = new Scanner(System.in);
	int basic=30000;
	System.out.print("Enter no.of hours worked =");
	int hours=up.nextInt();
	
	
	if(hours<40)
	System.out.print("Your Total Salary is = "+basic);
	else
		if(hours<60)
		System.out.print("Your Total Salary is = "+(basic+(800*(hours-40))));
		else
		System.out.print("Your Total Salary is = "+(basic+(1000*(hours-40))));
	up.close();
    }
}
