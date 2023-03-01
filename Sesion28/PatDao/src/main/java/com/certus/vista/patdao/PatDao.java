/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.certus.vista.patdao;

import com.certus.DAO.Impl.DaoInquilinosImpl;
import com.certus.DTO.Inquilinos;
import java.time.LocalDate;

/**
 *
 * @author jdextre
 */
public class PatDao {

    public static void main(String[] args) {
        //Instanciar el objeto implementación
        DaoInquilinosImpl objDao = new DaoInquilinosImpl();
        //Instanciar el DTO
        Inquilinos objIn = new Inquilinos();
        //Obtener la fecha de hoy
        LocalDate currentDate = LocalDate.now();
        //Cargando los datos
        objIn.setDni("4555");
        objIn.setNombres("Emil");
        objIn.setPaterno("Dextre");
        objIn.setMaterno("Alarcon");
        objIn.setTelefono("6666");
        objIn.setCorreo("mail@mail.com");
        objIn.setDeuda(200.20);
        objIn.setFecha_ingreso(currentDate);
        //Llamar al metodo de Insertar del DAO
        objDao.inquilinosIns(objIn);
        
    }
}
