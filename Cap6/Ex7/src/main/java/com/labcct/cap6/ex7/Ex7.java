/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.labcct.cap6.ex7;

import static com.labcct.cap6.ex7.Calculadora.calcular;

/**
 *
 * @author JoãoColaço
 */
public class Ex7 {

    public static void main(String[] args) {
        // Exemplo de uso
        int resultadoSoma = calcular("SOM", 2, 4, 6);
        System.out.println("Soma: " + resultadoSoma);

        int resultadoMultiplicacao = calcular("MULT", 3, 5, 2);
        System.out.println("Multiplicação: " + resultadoMultiplicacao);
        
        System.out.println("Hello World!");
    }
}
