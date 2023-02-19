/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.principal;
import com.certus.annotation.FrutoSeco;
/**
 *
 * @author jdextre
 */
public class Bolsa {
    @FrutoSeco(calorias=500, tieneVitaminaE=true)
	private int almendrotas = 50;
	
	@FrutoSeco(calorias=600, tieneVitaminaE=true)
	private int avellanas = 40;
	
	//@FrutoSeco(calorias=700, arbolQueDaEsteFruto="Pino")
	private int pinones = 30;
}
