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
import java.awt.FlowLayout;

public class ShowFlowLayout extends JFrame {
        public ShowFlowLayout () {
            
            setLayout (new FlowLayout (FlowLayout.RIGHT,10,10));
            
            add (new JLabel ("First name"));
            add (new JTextField (10));
            add (new JLabel ("Last name"));
            add (new JTextField (10));
            add (new JRadioButton ("Red"));
            add (new JTextField(10));
            
        }
        
            public static void main(String[]args) {
                ShowFlowLayout frame = new ShowFlowLayout ();
                
                frame.setSize(400,400);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
            
            }
    
    

