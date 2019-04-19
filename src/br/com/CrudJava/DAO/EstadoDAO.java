/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.CrudJava.DAO;

import br.com.CrudJava.MODEL.EstadoMODEL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class EstadoDAO {
    
    String sql;
    PreparedStatement stmt;
    Connection con;
   
    
        public void InserirEstado(EstadoMODEL estado){
      
   Conexao conexao = new Conexao();
  
    
    
    
     con = conexao.getConnection();
        
    sql = "Insert into estado (nome_estado,sigla_estado) values (?,?)";
        
    try {
        
        
            stmt = con.prepareStatement(sql);
            
   
            stmt.setString(1,estado.getNome());
            stmt.setString(2,estado.getSigla());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Estado Cadastrado com Sucesso");
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Erro ao Cadastrar Estado");
            Logger.getLogger(EstadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
    
    }
    
    public void AlterarEstado(EstadoMODEL estado,Integer cod){
    
    Conexao conexao = new Conexao();
    
    con=conexao.getConnection();
    
    sql="Update estado set nome_estado= ?, sigla_estado = ? where cod_estado = ? ";
    
       try {
           stmt=con.prepareStatement(sql);
           stmt.setString(1,estado.getNome());
           stmt.setString(2,estado.getSigla());
           stmt.setInt(3,cod);
           
           stmt.executeUpdate();
           
           JOptionPane.showMessageDialog(null,"Alteracão realizada com sucesso.");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao Alterar");
           Logger.getLogger(EstadoDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    }
    
    
    public void DeleteEstado(Integer cod){
    
    Conexao conexao = new Conexao();
    con = conexao.getConnection();
    
    sql="Delete from estado where cod_estado = ?";
    
    
       try {
           stmt=con.prepareStatement(sql);
           stmt.setInt(1,cod);
           stmt.executeUpdate();
           
           JOptionPane.showMessageDialog(null,"Deletado com sucesso.");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao deletar.");
           Logger.getLogger(EstadoDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    
    }
    
public ResultSet listarEstado(){

Conexao conexao = new Conexao();

ResultSet rs;

con= conexao.getConnection();

sql=" Select * from estado";

       try {
           stmt=con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
           
         rs = stmt.executeQuery();
           
         
       } catch (SQLException ex) {
           
           rs=null;
           
           Logger.getLogger(EstadoDAO.class.getName()).log(Level.SEVERE, null, ex);
           
       }
return rs;   }


public ResultSet BuscarEstado(EstadoMODEL estado){

Conexao conexao = new Conexao();

ResultSet rs;

con= conexao.getConnection();

sql=" Select * from estado where upper(nome_estado) like upper(?)";

       try {
           stmt=con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
           
          stmt.setString(1,"%"+estado.getNome()+"%");
         rs = stmt.executeQuery();
           
         
       } catch (SQLException ex) {
           
           rs=null;
           
           Logger.getLogger(EstadoDAO.class.getName()).log(Level.SEVERE, null, ex);
           
       }
return rs;   }

}
