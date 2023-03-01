/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.certus.patrondao;

//import com.certus.DAO.Impl.DaoInquilinosImpl;
import com.certus.DAO.Impl.DaoInquilinosImpl2;
import com.certus.DTO.Inquilinos;
import java.time.LocalDate;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;

/**
 *
 * @author jdextre
 */
public class PatronDAO {

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        DaoInquilinosImpl2 objDAO = new DaoInquilinosImpl2();
        Inquilinos objIn = new Inquilinos();
        objIn.setDni("41700674");
        objIn.setNombres("jymmy");
        objIn.setPaterno("Dextre");
        objIn.setMaterno("Alarcon");
        objIn.setTelefono("6666");
        objIn.setCorreo("mai@com");
        objIn.setDeuda(200.20);
        objIn.setFecha_ingreso(currentDate);
        objDAO.inquilinosIns(objIn);
        
        
        //List<Integer> ids = new ArrayList<Integer>();
        //ids.add(3);
        //objDAO.inquilinosDel(ids);
        
    }
}
