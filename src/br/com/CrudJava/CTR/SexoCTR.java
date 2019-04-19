/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.CrudJava.CTR;

import br.com.CrudJava.DAO.SexoDAO;
import br.com.CrudJava.MODEL.SexoMODEL;
import java.sql.ResultSet;

/**
 *
 * @author Leroy2
 */
public class SexoCTR {
    
    SexoMODEL model = new SexoMODEL();
    SexoDAO dao = new SexoDAO();
    
    
    public void SetCod(Integer cod){
    
    model.setCod(cod);
    
    }
    
    public int GetCod(){
    
    return model.getCod();
    
    }
    
    
    public void SetDescricao(String desc){
    
    model.setDescricao(desc);
    
    }
    
    public String GetDescricao(){
    
    return model.getDescricao();
    
    }
    
    public void CadastraSexo(){
    
    dao.CadastraSexo(model);
    
    }
    
    public void AlteraSexo(){
    
    dao.AlteraSexo(model);
    
    }
    
    public void ExcluiSexo(){
    
    dao.ExcluiSexo(model);
    
    }
    
    public ResultSet ListaSexo(){
    
    return dao.ListaSexo();
    
    }
    
     public ResultSet BuscarSexo(){
     
     return dao.BuscarSexo(model);
     
     }
}
