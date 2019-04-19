/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.CrudJava.DAO;

import br.com.CrudJava.MODEL.SexoMODEL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Leroy2
 */
public class SexoDAO {
    
    Connection con;
    PreparedStatement stmt;
    String sql;
    
    Conexao conexao = new Conexao();
    
    
    public void CadastraSexo(SexoMODEL sexo){
    
    con = conexao.getConnection();
    
    sql = "Insert into sexo (descricao_sexo) values(?)";
    
        try {
            stmt=con.prepareStatement(sql);
            stmt.setString(1,sexo.getDescricao());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Cadastro Efetuado com Sucesso.");
        } catch (SQLException ex) {
            Logger.getLogger(SexoDAO.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null,"Erro ao Efetuar Cadastro!");
        
        }    
    }
    
    
    public void AlteraSexo(SexoMODEL sexo){
    
    con = conexao.getConnection();
    
    sql = "Update sexo set descricao_sexo = ? where cod_sexo = ?";
    
        try {
            stmt=con.prepareStatement(sql);
            stmt.setString(1,sexo.getDescricao());
            stmt.setInt(2,sexo.getCod());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Alterado com Sucesso.");
        } catch (SQLException ex) {
            Logger.getLogger(SexoDAO.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null,"Erro ao Alterar!");
        
        }    
    }
    
    
  public void ExcluiSexo(SexoMODEL sexo){
    
    con = conexao.getConnection();
    
    sql = "Delete from sexo where cod_sexo = ?";
    
        try {
            stmt=con.prepareStatement(sql);
            stmt.setInt(1,sexo.getCod());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Excluido.");
        } catch (SQLException ex) {
            Logger.getLogger(SexoDAO.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null,"Erro ao Excluir!");
        
        }    
    }
 
  
  
  public ResultSet ListaSexo(){
    
      ResultSet rs;
      
    con = conexao.getConnection();
    
    sql = "Select * from sexo";
    
        try {
            stmt=con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rs = stmt.executeQuery();
    
        
        } catch (SQLException ex) {
            Logger.getLogger(SexoDAO.class.getName()).log(Level.SEVERE, null, ex);
        rs = null;
        }    
        return rs;
    }
  
  
  public ResultSet BuscarSexo(SexoMODEL sexo){

Conexao conexao = new Conexao();

ResultSet rs;

con= conexao.getConnection();

sql=" Select * from sexo where upper(descricao_sexo) like upper(?)";

       try {
           stmt=con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
           
          stmt.setString(1,"%"+sexo.getDescricao()+"%");
         rs = stmt.executeQuery();
           
         
       } catch (SQLException ex) {
           
           rs=null;
           
           Logger.getLogger(EstadoDAO.class.getName()).log(Level.SEVERE, null, ex);
           
       }
return rs;   }
}
