/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.principal;

/**
 *
 * @author jdextre
 */
public class usoFinally {
    public static void main(String args[]) {
        int t;
        int nums[] = new int[2];
        int opc=2;
        try {
            switch (opc) {
                case 0:
                    t=10/opc;
                break;
                case 1:
                nums[4]  = 4;
                break;
                case 2:
                    return;
            }
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Elemento no encontrado");
        } catch (ArithmeticException exc) {
            System.out.println("No se puede dividir por cero");
        }
        finally {
        System.out.println("Saliendo del Try");
        }
    }
}
