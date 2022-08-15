/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myguipracticals;

/**
 *
 * @author ICT5
 */
 import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class ShowGridLayout extends JFrame{
   
    public ShowGridLayout () {
        
        setLayout (new GridLayout(3,2,10,20));
        
        add(new JLabel ("First Name "));
        add(new JTextField(8));
        add(new JLabel(" MI"));
        add(new JTextField(1));
        add(new JLabel("Last Name"));
        add(new JTextField(9));
    }
    
    public static void main(String[]args) {
        ShowGridLayout frame = new ShowGridLayout();
        frame.setTitle ("ShowGridLayout");
        frame.setLocationRelativeTo(null);
        frame.setSize(200,210);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
    

