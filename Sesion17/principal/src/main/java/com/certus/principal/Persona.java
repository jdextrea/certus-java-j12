/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.principal;
import com.certus.annotation.Validable;
import com.certus.annotation.Validacion;
/**
 *
 * @author jdextre
 */
@Validable
public class Persona {
    String dni;
    String nombre;
    String correo;
    @Validacion(mayusculas=true)
    String codigo;
}


