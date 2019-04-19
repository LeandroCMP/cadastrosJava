/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.CrudJava.DAO;

import br.com.CrudJava.MODEL.CidadeMODEL;
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
public class CidadeDAO {
    
      
    String sql;
    PreparedStatement stmt;
    Connection con;
   
    
        public void InserirCidade(CidadeMODEL cidade){
      
   Conexao conexao = new Conexao();
    
     con = conexao.getConnection();
        
    sql = "Insert into cidade (nome_cidade,fk_estado) values (?,?)";
        
    try {
        
        
            stmt = con.prepareStatement(sql);
            
   
            stmt.setString(1,cidade.getNome_cidade());
            stmt.setInt(2,cidade.getEstado().getCod());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Cidade Cadastrada com Sucesso");
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Erro ao Cadastrar Cidade");
            Logger.getLogger(EstadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
    
    }
    
    public void AlterarCidade(CidadeMODEL cidade,Integer cod){
    
    Conexao conexao = new Conexao();
    
    con=conexao.getConnection();
    
    sql="Update cidade set nome_cidade= ?, fk_estado = ? where cod_cidade = ? ";
    
       try {
           stmt=con.prepareStatement(sql);
           stmt.setString(1,cidade.getNome_cidade());
           stmt.setInt(2,cidade.getEstado().getCod());
           stmt.setInt(3,cod);
           
           stmt.executeUpdate();
           
           JOptionPane.showMessageDialog(null,"Alteracão realizada com sucesso.");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao Alterar");
           Logger.getLogger(EstadoDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    }
    
    
    public void DeleteCidade(Integer cod){
    
    Conexao conexao = new Conexao();
    con = conexao.getConnection();
    
    sql="Delete from cidade where cod_cidade = ?";
    
    
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
    
public ResultSet listarCidade(int cod){

Conexao conexao = new Conexao();

ResultSet rs;

con= conexao.getConnection();

sql=" Select * from cidade where fk_estado = ?";

       try {
           stmt=con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
           
           stmt.setInt(1,cod);
           
         rs = stmt.executeQuery();
           
         
       } catch (SQLException ex) {
           
           rs=null;
           
           Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
           
       }
return rs;   }


public ResultSet BuscarCidade(CidadeMODEL cidade){

Conexao conexao = new Conexao();

ResultSet rs;

con= conexao.getConnection();

sql=" Select * from cidade inner join estado on estado.cod_estado = cidade.fk_estado where upper(nome_cidade) like upper(?)";

       try {
           stmt=con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
           
          stmt.setString(1,"%"+cidade.getNome_cidade()+"%");
         rs = stmt.executeQuery();
           
         
       } catch (SQLException ex) {
           
           rs=null;
           
           Logger.getLogger(EstadoDAO.class.getName()).log(Level.SEVERE, null, ex);
           
       }
return rs;   }


public ResultSet listarTodaCidade(){

Conexao conexao = new Conexao();

ResultSet rs;

con= conexao.getConnection();

sql=" Select * from cidade";

       try {
           stmt=con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
    
         rs = stmt.executeQuery();
           
         
       } catch (SQLException ex) {
           
           rs=null;
           
           Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
           
       }
return rs;   }
    
}
