/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.certus.DAO;
import com.certus.DTO.Inquilinos;
import java.util.List;

public interface DaoInquilinos {
    //Operaciones que va soportar la interfaz (CRUD)
    public List<Inquilinos> inquilinosSel();
    public Inquilinos inquilinosGet(Integer id);
    public String inquilinosIns(Inquilinos inquilinos);
    public String inquilinosUpd(Inquilinos inquilinos);
    public String inquilinosDel(List<Integer> ids);
    public String getMessage();
}
