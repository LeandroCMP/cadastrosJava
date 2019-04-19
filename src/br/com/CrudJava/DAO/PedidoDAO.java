/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.CrudJava.DAO;

import br.com.CrudJava.MODEL.PedidoMODEL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alunos
 */
public class PedidoDAO {
  
    
    String sql;
    PreparedStatement stmt;
    Connection con;
    
    
    public void CadastrarPedido(PedidoMODEL pedido){
    
    Conexao c = new Conexao();
        
    sql = "insert into pedido(prazo_entrega,codigo_cliente,codigo_vendedor) values(?,?,?)";
    
    
    con = c.getConnection();
    
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1,pedido.getPrazo_entrega());
            stmt.setInt(2,pedido.getFk_cliente().getCodigo_cliente());
            stmt.setInt(3,pedido.getFk_vendedor().getCodigo_vendedor());
            stmt.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    
    
    }
    
    
    public int BuscarNumPedido(){
    
        ResultSet rs;
        int retorno;
    Conexao c = new Conexao();
    
    sql="Select max(num_pedido) from pedido";
    
    con=c.getConnection();
    
        try {
            stmt = con.prepareStatement(sql);
           rs = stmt.executeQuery();
           
           if(rs.next()){
           
           retorno = rs.getInt("max");
           
           } else{retorno = 0;}
          
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
            retorno = 0;
        }
    
    return retorno;
    }
}
