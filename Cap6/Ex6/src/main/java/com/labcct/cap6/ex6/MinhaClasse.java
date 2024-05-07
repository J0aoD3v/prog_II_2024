/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.labcct.cap6.ex6;

/**
 *
 * @author JoãoColaço
 */
public class MinhaClasse {
    // Campo estático para contar a quantidade de objetos
    private static int quantidadeObjetos = 0;

    // Construtor da classe
    public MinhaClasse() {
        // Incrementa a quantidade de objetos toda vez que um novo objeto é criado
        quantidadeObjetos++;
    }

    // Método para obter a quantidade de objetos
    public static int getQuantidadeObjetos() {
        return quantidadeObjetos;
    }
}