/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.sesion19;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jdextre
 */
public class ManteLambda {
     public static void main(String args[]) { 
         //Primero crear una clase alumno
         //Crear el arreglo de datos listaAlumnos
         List<Alumno> listaAlumnos = new ArrayList<>();
     
     
         listaAlumnos.add(new Alumno(1, "1717213183", "Javier Ignacio", "Molina Cano", "Java 8", 7, 28));
		listaAlumnos.add(new Alumno(2, "1717456218", "Lillian Eugenia", "Gómez Álvarez", "Java 8", 10, 33));
		listaAlumnos.add(new Alumno(3, "1717328901", "Sixto Naranjoe", "Marín", "Java 8", 8.6, 15));
		listaAlumnos.add(new Alumno(4, "1717567128", "Gerardo Emilio", "Duque Gutiérrez", "Java 8", 10, 13));
		listaAlumnos.add(new Alumno(5, "1717902145", "Jhony Alberto", "Sáenz Hurtado", "Java 8", 9.5, 15));
		listaAlumnos.add(new Alumno(6, "1717678456", "Germán Antonio", "Lotero Upegui", "Java 8", 8, 34));
		listaAlumnos.add(new Alumno(7, "1102156732", "Oscar Darío", "Murillo González", "Java 8", 8, 32));
		listaAlumnos.add(new Alumno(8, "1103421907", "Augusto Osorno", "Palacio Martínez", "PHP", 9.5, 17));
		listaAlumnos.add(new Alumno(9, "1717297015", "César Oswaldo", "Alzate Agudelo", "Java 8", 8, 26));
		listaAlumnos.add(new Alumno(10, "1717912056", "Gloria Amparo", "González Castaño", "PHP", 10, 28));
		listaAlumnos.add(new Alumno(11, "1717912058", "Jorge León", "Ruiz Ruiz", "Python", 8, 22));
		listaAlumnos.add(new Alumno(12, "1717912985", "John Jairo", "Duque García", "Java Script", 9.4, 32));
		listaAlumnos.add(new Alumno(13, "1717913851", "Julio Cesar", "González Castaño", "C Sharp", 10, 22));
		listaAlumnos.add(new Alumno(14, "1717986531", "Gloria Amparo", "Rodas Monsalve", "Ruby", 7, 18));
		listaAlumnos.add(new Alumno(15, "1717975232", "Gabriel Jaime", "Jiménez Gómez", "Java Script", 10, 18));
     
                //Listas los alumnos
                System.out.println("**** Lista de alumnos ****");
                listaAlumnos.stream().forEach(a->System.out.println(a));
                
                 //Numero de elementos de la lista
                System.out.println("**** Numero de elementos de la lista ****");
                System.out.println(listaAlumnos.stream().count());
                
                //Imprimir los 2 primeros alumnos de la lista
                 System.out.println("**** Imprirmir los dos primeros registros ****");
                listaAlumnos.stream().limit(2).forEach(a->System.out.println(a));
                
                //Imprimir el prinmer alumni
                System.out.println("**** Primer alumno ****");
                System.out.println(listaAlumnos.stream().findFirst());
                
                //Imprimir los alumnos con mayor nota de 9
                System.out.println("****Alumnos que tengan nota mayor a 9 y de la clase de Ruby ****");
                listaAlumnos.stream().
                        filter(a->a.getNota()>9 || a.getNombreCurso().equals("PHP"))
                            .forEach(p->System.out.println(p));
               
                
                //Cursos que contienen la letra a
                System.out.println("****Alumnos que contienen la letra A en el curso ****");
                listaAlumnos.stream().filter(a->a.getNombreCurso().contains("a")).forEach(System.out::println);
                
                //Cursos que contienen la letra a
                System.out.println("****Alumnos que termina con la letra j en el curso ****");
                listaAlumnos.stream().filter(a->a.getNombreCurso().endsWith("t")).forEach(System.out::println);
                
     
     }
}
