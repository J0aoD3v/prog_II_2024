/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.labcct.cap6.passob;

/**
 *
 * @author JoãoColaço
 */
public class PassOb {
    // Passe objetos para os métodos
    public static void main(String[] args) {
        Block ob1 = new Block(10, 2 ,5);
        Block ob2 = new Block(10, 2 ,5);
        Block ob3 = new Block(4, 5 ,5);
        
        System.out.println("ob1 same dimensions as ob2: " + 
                ob1.sameBlock(ob2)); // Passa um objeto
        System.out.println("ob1 same dimensions as ob3: " + 
                ob1.sameBlock(ob3)); // Passa um objeto
        System.out.println("ob1 same volume as ob3: " + 
                ob1.sameVolume(ob3)); // Passa um objeto
        
        System.out.println("Hello World!");
    }
}