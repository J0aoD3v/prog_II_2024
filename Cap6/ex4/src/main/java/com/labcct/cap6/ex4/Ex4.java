/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.labcct.cap6.ex4;

import java.time.LocalDate;

/**
 *
 * @author JoãoColaço
 */
public class Ex4 {

    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        d = Data.mudarData(d, 2025);
        
        System.out.println(d.getDayOfMonth());
        System.out.println(d.getMonth());
        System.out.println(d.getYear());
        
        System.out.println("Hello World!");
    }
}
