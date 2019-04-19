/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.CrudJava.CTR;

import br.com.CrudJava.DAO.CidadeDAO;
import br.com.CrudJava.MODEL.CidadeMODEL;
import br.com.CrudJava.MODEL.EstadoMODEL;
import java.sql.ResultSet;

/**
 *
 * @author Alunos
 */
public class CidadeCTR {
    
    CidadeMODEL model = new CidadeMODEL();
    CidadeDAO dao = new CidadeDAO();
    
    
    
    public String GetNomeCidade(){
    
    return model.getNome_cidade();
    
    }
    
    
    public void SetNomeCidade(String nome){
    
     model.setNome_cidade(nome);
    
    }
    
    
       public int GetCodCidade(){
    
    return model.getCod_cidade();
    
    }
    
    
    public void SetCodCidade(int cod){
    
     model.setCod_cidade(cod);
    
    }
    
    
    
       public EstadoMODEL GetEstado(){
    
    return model.getEstado();
    
    }
    
    
    public void SetEstado(EstadoMODEL estado){
    
     model.setEstado(estado);
    
    }
    
    
     public ResultSet ListaCidade(int cod){
      
      return dao.listarCidade(cod);
          
      }
      
      public void AlterarCidade(Integer cod){
      
      dao.AlterarCidade(model, cod);
          
      }
      
      public void InserirCidade(){
      
      dao.InserirCidade(model);
      
      }
      
     public void ExcluirCidade(Integer cod){
     
     dao.DeleteCidade(cod);
     
     }
     
     public ResultSet BuscarCidade(){
     
     return dao.BuscarCidade(model);
     
     }
    
      public ResultSet ListaTodaCidade(){
      
      return dao.listarTodaCidade();
          
      }
}
