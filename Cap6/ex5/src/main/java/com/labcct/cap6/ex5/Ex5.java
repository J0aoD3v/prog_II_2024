/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.labcct.cap6.ex5;

import java.time.LocalDate;

/**
 *
 * @author JoãoColaço
 */
public class Ex5 {

    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        String dataFormatada = Util.formatarData(dataAtual);
        System.out.println(dataFormatada);
        
        System.out.println("Hello World!");
    }
}