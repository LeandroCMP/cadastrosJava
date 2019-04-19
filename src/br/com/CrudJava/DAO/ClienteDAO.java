/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.CrudJava.DAO;



import br.com.CrudJava.MODEL.ClienteMODEL;
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
public class ClienteDAO {
    
      String sql;
    PreparedStatement stmt;
    Connection con;
    
    
      
        public void InserirCliente(ClienteMODEL cliente){
      
   Conexao conexao = new Conexao();
    
     con = conexao.getConnection();
        
    sql = "Insert into cliente (nome_cliente,endereco,cep,cpf,fk_cidade,fk_sexo) values (?,?,?,?,?,?)";
        
    try {
        
        
            stmt = con.prepareStatement(sql);
            
   
            stmt.setString(1,cliente.getNome_cliente());
            stmt.setString(2,cliente.getEndereco());
            stmt.setString(3,cliente.getCep());
            stmt.setString(4,cliente.getCpf());
            stmt.setInt(5,cliente.getFk_cidade().getCod_cidade());
            stmt.setInt(6,cliente.getFk_sexo().getCod());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Cliente Cadastrado com Sucesso");
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Erro ao Cadastrar Cliente");
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
    
    }
    
    public void AlterarCliente(ClienteMODEL cliente,Integer cod){
     
    Conexao conexao = new Conexao();
    
    con=conexao.getConnection();
    
    sql="Update cliente set nome_cliente = ?, endereco = ?, cep = ?, cpf = ?, fk_cidade = ? ,fk_sexo = ? where codigo_cliente = ? ";
    
       try {
           stmt=con.prepareStatement(sql);
           stmt.setString(1,cliente.getNome_cliente());
            stmt.setString(2,cliente.getEndereco());
            stmt.setString(3,cliente.getCep());
            stmt.setString(4,cliente.getCpf());
            stmt.setInt(5,cliente.getFk_cidade().getCod_cidade());
            stmt.setInt(6,cliente.getFk_sexo().getCod());
            stmt.setInt(7,cod);
           
           stmt.executeUpdate();
           
           JOptionPane.showMessageDialog(null,"Alteracão realizada com sucesso.");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao Alterar");
           Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    }
    
    
    public void DeleteCliente(Integer cod){
    
    Conexao conexao = new Conexao();
    con = conexao.getConnection();
    
    sql="Delete from cliente where codigo_cliente = ?";
    
    
       try {
           stmt=con.prepareStatement(sql);
           stmt.setInt(1,cod);
           stmt.executeUpdate();
           
           JOptionPane.showMessageDialog(null,"Deletado com sucesso.");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao deletar.");
           Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    
    }
    
    public ResultSet BuscarCliente(ClienteMODEL cliente){

Conexao conexao = new Conexao();

ResultSet rs;

con= conexao.getConnection();

sql="Select * from cliente "
    + "inner join cidade "
    + "on cliente.fk_cidade = cidade.cod_cidade "
    + "inner join estado "
    + "on estado.cod_estado = cidade.fk_estado "
    + "inner join sexo "
    + "on cliente.fk_sexo = sexo.cod_sexo "
    + "where "
    + "upper(cliente.nome_cliente) like upper(?)";

       try {
           stmt=con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
           
          stmt.setString(1,"%"+cliente.getNome_cliente()+"%");
         rs = stmt.executeQuery();
           
         
       } catch (SQLException ex) {
           
           rs=null;
           
           Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
           
       }
return rs;   }
}
