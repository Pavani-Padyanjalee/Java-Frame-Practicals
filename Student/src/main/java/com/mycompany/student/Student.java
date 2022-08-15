/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.student;


/**
 *
 * @author ICT5
 */
public class Student {

	String stName;
	int indexNum;

	public Student(String name,int indexNo){
	System.out.println("Student name is : "+name);
	System.out.println("Student's index no. is : "+indexNo);
	}

	public void setName(String name){
	stName= name;
	}

	public String getName(){
	System.out.println("Student name is : "+stName);
	return stName;
	}

	public void setindexNo(int indexNo){
	indexNum = indexNo;
	}

	public int getindexNo(){
	System.out.println("Index is: " +indexNum);
	return indexNum;
	}


	public static void main(String[]args) {
            
	Student pavani = new Student("Pavani",32);
	Student vijani = new Student("Vijani",33);

	pavani.setindexNo(20);
	pavani.getindexNo();

	vijani.setindexNo(21);
	vijani.getindexNo();
}
}

