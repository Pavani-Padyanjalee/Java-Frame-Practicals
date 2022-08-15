/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trycatch;

/**
 *
 * @author deepika
 */
import java.io.*;

public class ByteStreamEx {
    public static void main (String []args) {
        try {
            InputStreamReader abc = new InputStreamReader (System.in);
            System.out.println("Please Enter Character = ");
            char c = (char)abc.read();
            System.out.println("The Entered character is = " +c);
        }
        catch (IOException error)
        {
            System.out.println(error);
        }
    }
    
}
