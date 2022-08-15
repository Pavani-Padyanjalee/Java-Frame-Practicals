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
import javax.swing.JButton;
import java.awt.FlowLayout;

public class ShowFlowLayout extends JFrame{
    public JButton button = new JButton ("Push");
    public ShowFlowLayout () {
        
        setLayout (new FlowLayout (FlowLayout.LEFT, 10,20));
        
        add(new JLabel ("First Name "));
        add(new JTextField(8));
        add(new JLabel(" MI"));
        add(new JTextField(5));
        add(new JLabel("Last Name"));
        add(new JTextField(9));
    }
    
    public static void main(String[]args) {
        ShowFlowLayout frame = new ShowFlowLayout();
        frame.setTitle ("ShowFlowLayout");
        frame.setLocationRelativeTo(null);
        frame.setSize(500,210);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public ShowFlowLayout () {
        panel.add(button);
        add(panel);
        button.addActionListener (new ActionListener ()) {
        public void actionPerformed (ActionEvent e) {
            String text = button.getText()+",again";
            button.setText(text);
            pack();
        }
    }
    }
}
