/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myguipracticals;

/**
 *
 * @author ICT5
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class ShowBorderLayout extends JFrame {
    public ShowBorderLayout (){
        setLayout (new BorderLayout(5,10));
        
        add(new JButton ("East"), BorderLayout.EAST);
        add(new JButton ("South"), BorderLayout.SOUTH);
        add(new JButton ("West"), BorderLayout.WEST);
        add(new JButton ("North"), BorderLayout.NORTH);
        add(new JButton ("Center"), BorderLayout.CENTER);
        
    }
    
public static void main(String []args) {
    ShowBorderLayout frame = new ShowBorderLayout();
    frame.setTitle ("ShowBorderLayout");
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300,300);
    frame.setVisible(true);
}
}
