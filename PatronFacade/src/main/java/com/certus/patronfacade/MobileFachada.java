/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.patronfacade;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author jdextre
 */
public class MobileFachada {
    public Mobile on() {
        Battery battery = new Battery();
        battery.on();
         
        CPU cpu = new CPU();
        cpu.bootLoad();
       
        MobileService gps = new GPSService();
        gps.start();
        
        MobileService wifi = new WifiService();
        wifi.start();
        
        List<MobileService> mobileServices = Arrays.asList(gps,wifi);
        Mobile mobile = new Mobile(battery,cpu,mobileServices);
        return mobile;
    }
    
    public void off(Mobile mobile) {
            //Quiero ver todos los servicios de mobile que estan prendidos, apagar
            for (MobileService service: mobile.getMobileServices()) {
                service.close();
            }
            mobile.getCpu().shutDown();
            mobile.getBattery().off(); 
    }
}
