/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.labcct.cap6.ex7;

/**
 *
 * @author JoãoColaço
 */
public class Calculadora {
    public static int calcular(String operacao, int... numeros) {
        if (operacao.equalsIgnoreCase("SOM")) {
            int soma = 0;
            for (int num : numeros) {
                soma += num;
            }
            return soma;
        } else if (operacao.equalsIgnoreCase("MULT")) {
            int multiplicacao = 1;
            for (int num : numeros) {
                multiplicacao *= num;
            }
            return multiplicacao;
        } else {
            throw new IllegalArgumentException("Operação inválida. Use 'SOM' ou 'MULT'.");
        }
    }
}
