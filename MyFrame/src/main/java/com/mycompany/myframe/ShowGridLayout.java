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
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.GridLayout;

public class ShowGridLayout extends JFrame {
    public ShowGridLayout () {
        setLayout (new GridLayout(5,5,5,5));
        
        add (new JLabel ("First Name"));
        add (new JTextField (9));
        add (new JLabel ("Last Name"));
        add (new JTextField (10));
        add (new JRadioButton ("Red"));
    }
        
        public static void main (String[]args) {
            ShowGridLayout frame = new ShowGridLayout ();
            
            frame.setTitle ("My Grid Layout");
            frame.setSize(400,400);
            frame.setLocationRelativeTo (null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            
        }
     
    }
    

