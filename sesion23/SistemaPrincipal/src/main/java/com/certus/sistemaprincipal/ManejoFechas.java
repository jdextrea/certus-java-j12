/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.sistemaprincipal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author jdextre
 */
public class ManejoFechas {
     public static void main(String[] args) { 
         //Mostrar la fecha Actual
         LocalDate fechaActual = LocalDate.now();
         System.out.println(fechaActual);
         
         //Cambiar la fecha
         LocalDate fechaPasada = LocalDate.of(2019,01,20);
         System.out.println(fechaPasada);
         
         //Validar si el año es bisiesto
         LocalDate bisiesto = LocalDate.of(2024,11,30);
         System.out.println(bisiesto.isLeapYear());
         
         //Uso del metodo del Parse
         LocalDate dato = LocalDate.parse("2023-02-13");
         System.out.println(dato);
         
         LocalDate nuevaFecha = dato.plusDays(1);
         System.out.println(nuevaFecha);
         
         validarFecha("12/30/2022");
         validarFecha("12,30,2022");
         //validarFecha(null);
         
        LocalTime time = LocalTime.now();
        LocalTime time2 = LocalTime.parse("11:00:59.759");
        LocalTime time3 = LocalTime.of(11, 00, 59);
        System.out.println(time);
        System.out.println(time2);
        System.out.println(time3);
         
         
     }
     //Metodo para validar si es fecha
     
     public static boolean validarFecha(String strDate) {
         //Revisar si fecha es un valor null
         if (strDate.trim().equals("")) {
             return true;
         } else {
             
         SimpleDateFormat sdfrmt = new SimpleDateFormat("MM/dd/yyyy");
         sdfrmt.setLenient(false);
         
             try {
                 Date javaDate = sdfrmt.parse(strDate);
                 System.out.println(strDate  + "Es valido el formato de fecha");
             } catch (ParseException e) {
                 System.out.println(strDate  + "No es un formato valido de fecha");
                 return false;
             } 
             }
             //Retornar Verdadero si es fecha valida
             return true;
         }
     }
     

