package com.certus.DAO.Impl;

import com.certus.DAO.DaoInquilinos;
import com.certus.DTO.Inquilinos;
import com.certus.Librerias.ConectaDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DaoInquilinosImplSing implements DaoInquilinos{

    //Definir es un objeto de tipo de connection
    private final Connection conectaDb;
    private String mensaje;
    
    //Crear un constructor Y llamo al PAtron Singleton de Conecta
    public DaoInquilinosImplSing () {
        this.conectaDb = ConectaDB.devolverConexion();
    }
    
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String inquilinosUpd(Inquilinos inquilinos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String inquilinosDel(List<Integer> ids) {
            StringBuilder sql = new StringBuilder();
            sql.append("DELETE FROM inquilinos where ")
                    .append("idinquilinos = ?");
            try {
                PreparedStatement ps = conectaDb.prepareStatement(sql.toString());
                conectaDb.setAutoCommit(false);
                boolean ok = true;
                        for  (int id =0;id < ids.size();id ++ ) {
                            ps.setInt(1, ids.get(id));
                         int ctos = ps.executeUpdate();
                            if (ctos==0) {
                                ok=false;
                                mensaje = "ID : " + ids.get(id) + " no existe";
                            } //FIn del if
                        } //Fin del for
                    if (ok) {
                        conectaDb.commit();
                    } else {
                        conectaDb.rollback();
                    }
                   conectaDb.setAutoCommit(true);
            } catch (SQLException e) {
                mensaje = e.getMessage();
            }
           return mensaje; 
    }

    @Override
    public String getMessage() {
        return mensaje;
    }
    
}
