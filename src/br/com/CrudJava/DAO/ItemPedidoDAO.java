/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.CrudJava.DAO;

import br.com.CrudJava.MODEL.ItemPedidoMODEL;
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
public class ItemPedidoDAO {
    
      
    String sql;
    PreparedStatement stmt;
    Connection con;
    
    
    public void CadastrarPedido(ItemPedidoMODEL ItemPedido){
    
    Conexao c = new Conexao();
        
    sql = "insert into item_do_pedido(num_pedido,codigo_produto,quantidade) values(?,?,?)";
    
    
    con = c.getConnection();
    
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1,ItemPedido.getFk_pedido().getNum_pedido());
            stmt.setInt(2,ItemPedido.getFk_produto().getCodigo_produto());
            stmt.setInt(3,ItemPedido.getQtdd());
            stmt.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    
    
    }
    
    
    public ResultSet BuscaItemPedido(int num_pedido){
    
        ResultSet rs;
    Conexao c = new Conexao();
    
    sql = "Select * from item_do_pedido "
            + "inner join produto "
            + "on item_do_pedido.codigo_produto = produto.codigo_produto "
            + "where item_do_pedido.num_pedido = ?";
    
    con = c.getConnection();
        try {
            
            stmt = con.prepareStatement(sql);
            stmt.setInt(1,num_pedido);
           rs = stmt.executeQuery();
            
        } catch (SQLException ex) {
            Logger.getLogger(ItemPedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
            rs = null;
        }
    
    return rs;
    
    }
}
