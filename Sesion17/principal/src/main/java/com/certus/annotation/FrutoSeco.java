/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.annotation;

/**
 *
 * @author jdextre
 */
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Para poner la anotación en Javadocs
@Documented

//Cuando la anotación es necesaria. SOURCE: descartardo durante la compilación, no se escribirá en el bytecode. CLASS: Descartada durante la carga de la clase; útil cuando se hace el bytecode-level post-processing. RUNTIME: No se descarta; la anotación estará disponible en tiempo de ejecución mediante reflection
@Retention(RetentionPolicy.RUNTIME)

//Lugar donde puede ir la anotación
@Target(ElementType.FIELD)
public @interface FrutoSeco {
	boolean tieneVitaminaE() default false;
	
	int calorias();
	
}
