/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jdextre
 */

public class Productor extends Thread{
    //Creamos el obj contenedor
    //Lo comun
    private Contenedor contenedor;
   
    //Construtor
    public Productor(Contenedor c) {
    contenedor = c;
    }
    
    public void run() {
    //Vamos un codigo que genere información de forma aleatoria
        for (int i=0;i<10;i++) {
              //Se debe crear el metodo en el contenedor  
            //objeto contenedor manda un valor
             contenedor.put(i);
            System.out.println("Productor envia: " + i);
            try {
                sleep((int)(Math.random()*100));
            } catch (InterruptedException e) {
           
            }
        }
    }   
}