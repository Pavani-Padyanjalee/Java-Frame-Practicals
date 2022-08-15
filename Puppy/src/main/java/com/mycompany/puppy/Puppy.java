/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.puppy;

/**
 *
 * @author deepika
 */
public class Puppy {
    private int weight;
    private int loudness;
    private String BarkNoise;
    
    public Puppy(){
        weight = 12;
        loudness = 4;
        BarkNoise = "Woof";
    }
    public Puppy(int w, int l){
        weight = w;
        loudness = l;
        BarkNoise = "Arf";
    }
    public Puppy(int w, int l, String bark){
        weight = w;
        loudness = l;
        BarkNoise = "Arf";
    }
    
    public static void main(String[] args) {
        Puppy a = new Puppy();
        Puppy b = new Puppy(12,23);
        Puppy c = new Puppy(30,40,"Crunch");
        
        System.out.println("Weight is = "+a.weight);
        System.out.println("Loudness is = "+a.loudness);
        System.out.println("BarkNoise is = "+a.BarkNoise);
        
        System.out.println("Weight is = "+b.weight);
        System.out.println("Loudness is = "+b.loudness);
        System.out.println("BarkNoise is = "+b.BarkNoise);
        
        System.out.println("Weight is ="+c.weight);
        System.out.println("Loudness is = "+c.loudness);
        System.out.println("BarkNoise is = "+c.BarkNoise);
        
        
    }
}
