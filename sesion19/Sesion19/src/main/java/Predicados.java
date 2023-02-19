
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jdextre
 */
public class Predicados {
    public static void main(String args[]) {
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6,7,8,9,10);
        
        System.out.println("Numeros pares");
        evaluar(listaNumeros,(n)->n%2==0);
        
        System.out.println("Numeros mayores 4");
        evaluar(listaNumeros,(n)->n>4);
        
    }
    
    public static void evaluar(List<Integer> listaNumeros, Predicate<Integer> predicado) {
            for  (Integer n: listaNumeros) {
                if (predicado.test(n)) {
                    System.out.println(n + " ");
                }
            }
        
    
    }
}
