/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.certus.patronfacade;

/**
 *
 * @author jdextre
 */
public class PatronFacade {

    public static void main(String[] args) {
        MobileFachada facade = new MobileFachada();
        Mobile mobile = facade.on();
        System.out.println("-------------------");
        facade.off(mobile);
    }
}
