/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.CrudJava.CTR;

import br.com.CrudJava.DAO.EstadoDAO;
import br.com.CrudJava.MODEL.EstadoMODEL;
import java.sql.ResultSet;

/**
 *
 * @author Alunos
 */
public class EstadoCTR {
    
    EstadoMODEL model = new EstadoMODEL();
    EstadoDAO dao = new EstadoDAO();
    
    
    
    
    public void SetNome(String nome){
    
    model.setNome(nome);
        
    }
    
     public void SetSigla(String sigla){
    
    model.setSigla(sigla);
        
    }
     
      public void SetCod(Integer cod){
    
    model.setCod(cod);
        
    }
      
      public ResultSet ListaEstado(){
      
      return dao.listarEstado();
          
      }
      
      public void AlterarEstado(Integer cod){
      
      dao.AlterarEstado(model, cod);
          
      }
      
      public void InserirEstado(){
      
      dao.InserirEstado(model);
      
      }
      
     public void ExcluirEstado(Integer cod){
     
     dao.DeleteEstado(cod);
     
     }
     
     public ResultSet BuscarEstado(){
     
     return dao.BuscarEstado(model);
     
     }
}
