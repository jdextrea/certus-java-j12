/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.certus.principal;

import com.certus.annotation.FrutoSeco;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Principal {

    public static void main(String[] args) throws InterruptedException {
    //   Usuario objUsuario = new Usuario("Luisa","6666666",16);
    //   System.out.println(validador(objUsuario.getEdad()));
            Bolsa bolsita = new Bolsa();
		int caloriasTotalesA = contarCaloriasTotalesFrutosSecos(bolsita);
		System.out.println("Calorias totales de los frutos secos de una bolsita de la marca 'A': " + caloriasTotalesA);

		System.out.println("");
    
    
    }
    
    
    
    public static int contarCaloriasTotalesFrutosSecos(final Object bolsita) {
		Class<?> claseBolsita = bolsita.getClass();

		int caloriasTotales = 0;

		final Field[] variables = claseBolsita.getDeclaredFields(); // Incluye variables privadas
		for (final Field variable : variables) {

			final Annotation anotacionObtenida = variable.getAnnotation(FrutoSeco.class);

			if (anotacionObtenida != null && anotacionObtenida instanceof FrutoSeco) {
				final FrutoSeco anotacionFrutoSeco = (FrutoSeco) anotacionObtenida;

				int calorias = anotacionFrutoSeco.calorias();
                                        

				int cantidad = 0;
				try {
					variable.setAccessible(true);
					cantidad = variable.getInt(bolsita);
				} catch (IllegalArgumentException | IllegalAccessException e) {
					e.printStackTrace();
				}

				String nombreFrutoSeco = variable.getName();
                                                                                            
				System.out.println("	-Hay " + cantidad + " de " + nombreFrutoSeco + ", y cada una tiene " + calorias + " calorías");

				caloriasTotales += (cantidad * calorias);
			}
		}

		return caloriasTotales;
	}
    
  
    public static boolean validador(int edad) {
        
        if  (edad>=18) {
        return true;
        } else {
        return false;
        }
        
    }
}
