/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.labcct.cap6.ex4;

import java.time.LocalDate;

/**
 *
 * @author JoãoColaço
 */
public class Data {
    public static LocalDate mudarData(LocalDate data, Integer ano) {
        return data.withYear(ano);
    }
            
    public static LocalDate mudarData(LocalDate data, Integer ano, Integer mes) {
        return data.withYear(ano).withMonth(mes);
    }
    
    public static LocalDate mudarData(LocalDate data, Integer ano, Integer mes, Integer dia) {
        return data.withYear(ano).withMonth(mes).withDayOfMonth(dia);
    }
}