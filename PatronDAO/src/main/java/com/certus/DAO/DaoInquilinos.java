/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.DAO;

import com.certus.DTO.Inquilinos;
import java.util.List;

public interface DaoInquilinos {
    //Operaciones que soporta la interfaz
    public List <Inquilinos> inquilinosSel();
    public Inquilinos inquilinosGet(Integer id);
    public String inquilinosIns(Inquilinos inquilino);
    public String inquilinosUpd(Inquilinos inquilino);
    public String inquilinosDel(List<Integer> ids);
    public String getMessage();
}