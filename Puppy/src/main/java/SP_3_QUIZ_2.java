/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author deepika
 */
import java.util.*;
public class SP_3_QUIZ_2 {
    public static void main(String[]args) {
        int no_of_students = 50;
        int no_of_subjects = 4;
        
        String subjectName[] = {"Database","Graphic","Communication","English"};
        Scanner as = new Scanner(System.in);
        String name[] = new String[no_of_students];
        int marks[][] = new int[no_of_students][no_of_subjects];
        
        int i = 0, j = 0;
        
        for(i = 0; i<no_of_students; i++) {
            System.out.println("Student"+(i+1)+"Details : ");
            System.out.println("Student Name : ");
            name[i] = as.nextLine();
            
        for(j = 0; j<no_of_subjects; j++) {
            System.out.println("Enter Marks of : "+subjectName[j]+":");
            marks[i][j] =as.nextInt();
        }}
        System.out.println("Student Name : "+name[i]);
        
        int total = 0;
        for(j = 0; j<no_of_subjects; j++) {
            System.out.println("Marks of"+subjectName[j]+":"+marks[i][j]);
            total = marks[i][j];
        }
        System.out.println("Total Marks : "+total);
    }}
        
    

