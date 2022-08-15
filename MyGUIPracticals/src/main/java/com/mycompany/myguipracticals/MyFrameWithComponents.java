/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myguipracticals;

/**
 *
 * @author ICT5
 */
import javax.swing.*;

public class MyFrameWithComponents {
    public static void main(String[]args){
        JFrame frame = new JFrame ("PavaniFrameWithComponenets");
        
        JButton jbtOK = new JButton("Okey");
        jbtOK.setBounds(150,150,70,30);
        frame.add(jbtOK);
        
        JButton jbtOK2 = new JButton("Hello");
        jbtOK2.setBounds(100,300,100,100);
        frame.add(jbtOK2);
        
        
        frame.setSize(700,500);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    
}
}
