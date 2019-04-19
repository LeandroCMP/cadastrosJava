/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.CrudJava.CTR;

import br.com.CrudJava.DAO.ItemPedidoDAO;
import br.com.CrudJava.MODEL.ItemPedidoMODEL;
import br.com.CrudJava.MODEL.PedidoMODEL;
import br.com.CrudJava.MODEL.ProdutoMODEL;
import java.sql.ResultSet;

/**
 *
 * @author Alunos
 */
public class ItemPedidoCTR {
   
    
    ItemPedidoMODEL model = new ItemPedidoMODEL();
    ItemPedidoDAO dao = new ItemPedidoDAO();
    
    
    public void SetFk_Pedido(PedidoMODEL pedido){
    
    model.setFk_pedido(pedido);
        
    }
    
    public PedidoMODEL GetFk_Pedido(){
    
    return model.getFk_pedido();
    
    }
    
    
    public void SetFk_Produto(ProdutoMODEL produto){
    
    model.setFk_produto(produto);
        
    }
    
    
    public ProdutoMODEL GetFk_Produto(){
    
    return model.getFk_produto();
    
    }
    
    
    
    public void SetQuantidade(int qtdd){
    
    model.setQtdd(qtdd);
    
    }
    
    
    public int GetQuantidade(){
    
    return model.getQtdd();
    
    }
    
    
    public void CadastrarItemPedido(){
    
    dao.CadastrarPedido(model);
    
    }
    
    
    public ResultSet BuscarItemPedido(int num_pedido){
    
    return dao.BuscaItemPedido(num_pedido);
    
    }
    
    
}
