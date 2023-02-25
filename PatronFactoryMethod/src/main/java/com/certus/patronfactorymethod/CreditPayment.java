/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.patronfactorymethod;

/**
 *
 * @author jdextre
 */
public class CreditPayment extends Shop {
 
    @Override
    public Payment makePayment() {
      return new CreditCard();
    }
  }