/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myguipracticals;

/**
 *
 * @author ICT5
 */
public class MouseFrame extends JFrame{
    public MouseFrame (){
        setSize (250,300); setTitle ("Mouse Moves");
        addMouseMotionListener ( {
        new MouseMotionAdapter () {
            
            public void mouseMoved (MouseEvent e) {
                
                System.out.println("mouse moved to ["+e.getX() + ", "+e.getY() + "]");}});
            }
    }
    
    
}
