/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.DAO.Impl;

import com.certus.DAO.DaoInquilinos;
import com.certus.DTO.Inquilinos;
import com.certus.Librerias.Conecta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author jdextre
 */
public class DaoInquilinosImpl  extends Conecta implements DaoInquilinos{
    //Atributos
   private String mensaje;
   private Connection con;
    
    @Override
    public List<Inquilinos> inquilinosSel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Inquilinos inquilinosGet(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String inquilinosIns(Inquilinos inquilinos) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO inquilinos( ")
                .append("dni,")
                .append("nombres,")
                .append("paterno,")
                .append("materno,")
                .append("telefono,")
                .append("correo,")
                .append("deuda,")
                .append("fecha_ingreso")
                .append(") VALUES (?,?,?,?,?,?,?,?)");
        
        try  {
            this.conectar();
            con = this.conexion;
            PreparedStatement ps = con.prepareStatement(sql.toString());
            ps.setString(1, inquilinos.getDni());
            ps.setString(2, inquilinos.getNombres());
            ps.setString(3, inquilinos.getPaterno());
            ps.setString(4, inquilinos.getMaterno());
            ps.setString(5, inquilinos.getTelefono());
            ps.setString(6, inquilinos.getCorreo());
            ps.setDouble(7, inquilinos.getDeuda());
            ps.setString(8,inquilinos.getFecha_ingreso().toString());
            int ctos = ps.executeUpdate();
                if  (ctos==0) {
                    mensaje = "cero filas insertadas";
                }
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }
        return mensaje;
    }

    @Override
    public String inquilinosUpd(Inquilinos inquilinos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String inquilinosDel(List<Integer> ids) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getMessage() {
     return mensaje;  
    }
    
}
