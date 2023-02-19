package com.mycompany.sesion04;
public class Sesion04 extends Operaciones{
    public enum Paises {
    PERU, BRAZIL, PARAGUAY, CHILE
    //Arreglo de constantes.
    }
    
    public static void main(String[] args) {
        
        Paises pais = Paises.PARAGUAY;
        System.out.println(pais.name());
        System.out.println(pais.ordinal());
        //Crear un programa que permita mostrar los valores de un enumerado
        Paises arreglo[] = Paises.values();
        
        for(int x=0;x<arreglo.length;x++) {
        System.out.println(arreglo[x]);
        }
        
//x=x+1
        //x++
       /* for (int x=1;x<=10;x++) {
        System.out.println("Hello World!" + x);
        }
*/
        //Tabla de multiplicar de 5
        //1x5=5
        //2x5=10
        //3x5=15
        
        /*
        final int numero = 5;
        int factor=0;
        for  (int x=1;x<=12;x++) {
            factor = numero * x;
        System.out.println(x + "*" + numero + "=" + factor);
        }
*/
        Fecha objFecha = new Fecha();
        objFecha.MostrarFecha("12/11/2022");
        
        //programa que me muestre la fecha (agregar dia, mes y el año)
        //soluciones, crear un constructor y pasar los datos.
        //Metodo get, set
        //Cambio el ambio del atributo
        //objFecha.dia=12;
        //objFecha.mes=11;
        //objFecha.anio=2022;
        objFecha.setDia(12);
        objFecha.setMes(11);
        objFecha.setAnio(2022);
        objFecha.MuestraFecha();
        
        
        //Crear un programa que permite heredar dos metodos suma y resta de la clase Operaciones
        Operaciones objOpera = new Operaciones();
        objOpera.setNum1(15);
        objOpera.setNum2(5);
        double suma = objOpera.sumar();
        double resta = objOpera.restar();
        
        System.out.println(suma);
        System.out.println(suma);

        //Aplicando la herencia y encapsulamiento
        Sesion04 objSesion = new Sesion04();
        
        
        objSesion.setNum1(20);
        objSesion.setNum2(12);
        double Sumar = objSesion.sumar();
        System.out.println(Sumar);
        
    }
}
