/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.patronfactorymethod;

public class CreditCard implements Payment{

  @Override
  public void paymentMethod() {

    System.out.println("Payment Method: Credit Card");

  }
}