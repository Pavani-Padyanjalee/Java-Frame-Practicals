/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myframe;

/**
 *
 * @author deepika
 */

import javax.swing.*;

public class MyFrameWithComponents {
    public static void main(String[]args) {
        JFrame frame = new JFrame ("My Frame With Components");
        
        JButton jbtOK = new JButton("OK");
        frame.setBounds(10,20,10,20);
        frame.add(jbtOK);
        
        JLabel jlbName = new JLabel("Type your name");
        frame.setBounds(10,20,10,20);
        frame.add(jlbName);
        
        JTextField jtfName = new JTextField("Type your name here");
        frame.setBounds(20,20,20,20);
        frame.add(jtfName);
        
        JCheckBox jcbBold = new JCheckBox("Bold");
        frame.setBounds(40,40,40,40);
        frame.add(jcbBold);
        
        JComboBox jcboColor = new JComboBox(new String[] {"Red", "Green","Blue"});
        frame.setBounds(15,15,15,15);
        frame.add(jcboColor);
        
        JRadioButton jrbRed = new JRadioButton("Red");
        frame.setBounds(12,12,24,24);
        frame.add(jrbRed);
        
        frame.setSize(200,200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        
    }
    
    
}
