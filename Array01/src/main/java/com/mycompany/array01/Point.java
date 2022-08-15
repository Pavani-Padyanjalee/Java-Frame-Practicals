/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.point;

/**
 *
 * @author ICT5
 */
    

    public class Point {
        
     
    public int x = 0;
    public int y = 0;
 
    public static void main(String[]args) {
    Point num = new Point(2,1);
    System.out.println(num.x);
    System.out.println(num.y);
    
}
             
    public Point (int x, int y){
       this.x=x;
       this.y=y;  
    
        
            
        }
    }

 
