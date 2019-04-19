/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.CrudJava.DAO;


import br.com.CrudJava.MODEL.VendedorMODEL;
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
public class VendedorDAO {
     String sql;
    PreparedStatement stmt;
    Connection con;
    
    
      
        public void InserirVendedor(VendedorMODEL vendedor){
      
   Conexao conexao = new Conexao();
    
     con = conexao.getConnection();
        
    sql = "Insert into vendedor (nome_vendedor,salario_fixo,faixa_comissao,fk_sexo) values (?,?,?,?)";
        
    try {
        
        
            stmt = con.prepareStatement(sql);
            
   
            stmt.setString(1,vendedor.getNome_vendedor());
            stmt.setDouble(2,vendedor.getSalario_vendedor());
            stmt.setString(3,vendedor.getFaixa_comissao());
            stmt.setInt(4,vendedor.getFk_sexo().getCod());
           
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Vendedor Cadastrado com Sucesso");
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Erro ao Cadastrar Vendedor");
            Logger.getLogger(VendedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
    
    }
    
    public void AlterarVendedor(VendedorMODEL vendedor,Integer cod){
     
    Conexao conexao = new Conexao();
    
    con=conexao.getConnection();
    
    sql="Update vendedor set nome_vendedor = ? ,salario_fixo = ? ,faixa_comissao = ?, fk_sexo = ? where codigo_vendedor = ? ";
    
       try {
           stmt=con.prepareStatement(sql);
           stmt.setString(1,vendedor.getNome_vendedor());
            stmt.setDouble(2,vendedor.getSalario_vendedor());
            stmt.setString(3,vendedor.getFaixa_comissao());
            stmt.setInt(4,vendedor.getFk_sexo().getCod());
            stmt.setInt(5,cod);
            
           stmt.executeUpdate();
           
           JOptionPane.showMessageDialog(null,"Alteracão realizada com sucesso.");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao Alterar");
           Logger.getLogger(VendedorDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    }
    
    
    public void DeleteVendedor(Integer cod){
    
    Conexao conexao = new Conexao();
    con = conexao.getConnection();
    
    sql="Delete from vendedor where codigo_vendedor = ?";
    
    
       try {
           stmt=con.prepareStatement(sql);
           stmt.setInt(1,cod);
           stmt.executeUpdate();
           
           JOptionPane.showMessageDialog(null,"Deletado com sucesso.");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao deletar.");
           Logger.getLogger(VendedorDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    
    }
    
    public ResultSet BuscarVendedor(VendedorMODEL vendedor){

Conexao conexao = new Conexao();

ResultSet rs;

con= conexao.getConnection();

sql="Select * from vendedor"
    + " inner join sexo"
    + " on sexo.cod_sexo = vendedor.fk_sexo"
    + " where "
    + " upper(vendedor.nome_vendedor) like upper(?)";

       try {
           stmt=con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
           
          stmt.setString(1,"%"+vendedor.getNome_vendedor()+"%");
         rs = stmt.executeQuery();
           
         
       } catch (SQLException ex) {
           
           rs=null;
           
           Logger.getLogger(VendedorDAO.class.getName()).log(Level.SEVERE, null, ex);
           
       }
return rs;   }
}
