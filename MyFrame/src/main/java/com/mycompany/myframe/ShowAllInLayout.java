/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myframe;

/**
 *
 * @author deepika
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class ShowAllInLayout extends JFrame {
    public void ShowFlowlayout () {
        setLayout (new FlowLayout (FlowLayout.LEFT,5,5));
        
    add (new JLabel ("FirstName"));
    add (new JTextField (10));
    add (new JLabel ("MIS number"));
    add (new JTextField (10));
    }
    public void ShowGridLayout () {
        setLayout (new GridLayout (10,10,10,10));
    
    add (new JLabel ("FirstName"));
    add (new JTextField (10));
    add (new JLabel ("MIS number"));
    add (new JTextField (10));
    }
    
    public void ShowBorderLayout () {
        setLayout (new BorderLayout (30,30));
        
        add (new JButton ("North"), BorderLayout.NORTH);
    }
    
    public static void main (String[]args) {
        
        ShowFlowLayout frame = new ShowFlowLayout ();
                
                
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
    }
    {
        
        ShowGridLayout frame = new ShowGridLayout ();
            
            frame.setTitle ("My Grid Layout");
            
            frame.setLocationRelativeTo (null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
    }
    {
        ShowBorderLayout frame = new ShowBorderLayout ();
        
        frame.setTitle ("My Border Layout");
        
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible (true);
    {
        
        
        frame.setTitle("My All In One Layout");
        frame.setSize (400,600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    }}
    

