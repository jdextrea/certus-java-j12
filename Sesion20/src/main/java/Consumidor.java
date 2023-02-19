/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Consumidor extends Thread{
    //Es el recurso compartido
    private Contenedor contenedor;
   
    //Este metodo consulta a la BDClientes y su estructura es :
    //
    //Construtor
    public Consumidor(Contenedor c) {
    contenedor = c;
    }
    
    public void run() {
       //Crear una variable para recibir el valor
       int value=0;

    //Vamos un codigo que genere información de forma aleatoria
        for (int i=0;i<10;i++) {
                          //Se debe crear el metodo en el contenedor
                          //El valor que recogera de la clase Contenedor
                          //contenedor el recurso compartido
           value= contenedor.get();
            System.out.println("Consumidor recibe  " + value);
           
            }
        }
    }   
