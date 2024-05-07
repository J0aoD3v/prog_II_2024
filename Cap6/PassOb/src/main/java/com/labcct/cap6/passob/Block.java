/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.labcct.cap6.passob;

/**
 *
 * @author JoãoColaço
 */
// Objetos podem ser passados para os métodos
public class Block {
    // armazena as dimensões de um bloco trimensional
    private int a, b, c;
    private int volume;
    
    public Block(int i, int j, int k) {
    a = i;
    b = j;
    c = k;
    volume = a * b * c;
    }
    
    // Retorna true se ob definir o mesmo block
    public boolean sameBlock(Block ob) { // Usa um tipo de objeto no parâmetro
        if((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;
        else return false;
    }
    
    // Retorna true se ob tiver o mesmo volume.
    public boolean sameVolume(Block ob) { // Usa um tipo de objeto no parâmetro
        if(ob.volume == volume) return true;
        else return false;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}