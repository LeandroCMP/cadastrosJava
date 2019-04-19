/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.CrudJava.DAO;


import br.com.CrudJava.MODEL.ProdutoMODEL;
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
public class ProdutoDAO {
  
    String sql;
    PreparedStatement stmt;
    Connection con;
    
    
      
        public void InserirProduto(ProdutoMODEL produto){
      
   Conexao conexao = new Conexao();
    
     con = conexao.getConnection();
        
    sql = "Insert into produto (descricao_produto,unidade,val_unit) values (?,?,?)";
        
    try {
        
        
            stmt = con.prepareStatement(sql);
            
   
            stmt.setString(1,produto.getDescricao_produto());
            stmt.setString(2,produto.getUnidade_produto());
            stmt.setDouble(3,produto.getVal_unit());
         
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Produto Cadastrado com Sucesso");
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Erro ao Cadastrar Produto");
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
    
    }
    
    public void AlterarProduto(ProdutoMODEL produto,Integer cod){
     
    Conexao conexao = new Conexao();
    
    con=conexao.getConnection();
    
    sql="Update produto set descricao_produto = ?,unidade = ?,val_unit = ? where codigo_produto = ? ";
    
       try {
           stmt=con.prepareStatement(sql);
            stmt.setString(1,produto.getDescricao_produto());
            stmt.setString(2,produto.getUnidade_produto());
            stmt.setDouble(3,produto.getVal_unit());
            stmt.setInt(4,cod);
           
           stmt.executeUpdate();
           
           JOptionPane.showMessageDialog(null,"Alteracão realizada com sucesso.");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao Alterar");
           Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    }
    
    
    public void DeleteProduto(Integer cod){
    
    Conexao conexao = new Conexao();
    con = conexao.getConnection();
    
    sql="Delete from produto where codigo_produto = ?";
    
    
       try {
           stmt=con.prepareStatement(sql);
           stmt.setInt(1,cod);
           stmt.executeUpdate();
           
           JOptionPane.showMessageDialog(null,"Deletado com sucesso.");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao deletar.");
           Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    
    }
    
    public ResultSet BuscarProduto(ProdutoMODEL produto){

Conexao conexao = new Conexao();

ResultSet rs;

con= conexao.getConnection();

sql="Select * from produto "
    + "where "
    + "upper(descricao_produto) like upper(?)";

       try {
           stmt=con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
           
          stmt.setString(1,"%"+produto.getDescricao_produto()+"%");
         rs = stmt.executeQuery();
           
         
       } catch (SQLException ex) {
           
           rs=null;
           
           Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
           
       }
return rs;   }
}
