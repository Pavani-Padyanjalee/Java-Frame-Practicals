/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myframe;

/**
 *
 * @author deepika
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class ShowBorderLayout extends JFrame{
    public ShowBorderLayout (){
        setLayout (new BorderLayout (10,10) );
        
        add (new JButton ("East"), BorderLayout.EAST);
        add (new JButton ("West"), BorderLayout.SOUTH);
        add (new JButton ("North"), BorderLayout.NORTH);
        add (new JButton ("South"), BorderLayout.NORTH);
    }
        
    public static void main (String[]args) {
        ShowBorderLayout frame = new ShowBorderLayout ();
        
        frame.setTitle ("My Border Layout");
        frame.setSize(400,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible (true);
        
        
    }
        
    
}
    

