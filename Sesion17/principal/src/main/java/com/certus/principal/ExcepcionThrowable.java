/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.principal;

/**
 *
 * @author jdextre
 */
public class ExcepcionThrowable {
    public static void main(String args[]) {
        int nums[] = {4,8,16,32,64,128,256,512};
        int denom[] = {2,0,4,4,0,0};
        for (int i=0;i<=nums.length;i++) {
            
            try {
            System.out.println(nums[i] + "/" + denom[i] + " = " + (nums[i]/denom[i]));
            } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Existe error de Array");
                
            } 
            
            catch (ArithmeticException exc) {
            
            System.out.println("Existe un error aritmetico");
            
            }
            catch (Throwable exc) {
            System.out.println(exc.getStackTrace());
            
            } 
            
        }
        
    }
}
