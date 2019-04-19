/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.CrudJava.CTR;

import br.com.CrudJava.DAO.PedidoDAO;
import br.com.CrudJava.MODEL.ClienteMODEL;
import br.com.CrudJava.MODEL.PedidoMODEL;
import br.com.CrudJava.MODEL.VendedorMODEL;

/**
 *
 * @author Alunos
 */
public class PedidoCTR {
    
    PedidoMODEL model = new PedidoMODEL();
    PedidoDAO dao = new PedidoDAO();
    
    
    
    public void SetNumPedido(int num){
    
    model.setNum_pedido(num);
    
    }
    
    public int GetNumPedido(){
    
    return model.getNum_pedido();
    
    }
    
    
    public void SetFkvendedor(VendedorMODEL vendedor){
    
    model.setFk_vendedor(vendedor);
    
    }
    
    public VendedorMODEL GetFk_Vendedor(){
    
    return model.getFk_vendedor();
    
    }
    
    
    public void SetFkcliente(ClienteMODEL cliente){
    
    model.setFk_cliente(cliente);
    
    }
    
    public ClienteMODEL GetFk_Cliente(){
    
    return model.getFk_cliente();
    
    }
    
    public void SetPrazo_Entrega(int prazo){
    
    model.setPrazo_entrega(prazo);
    
    }
    
    public int GetPrazo_Entrega(){
    
    return model.getPrazo_entrega();
    
    }
    
    public void CadastrarPedido(){
    
    dao.CadastrarPedido(model);
    
    }
    
    public int BuscarNumPedido(){
    
    return dao.BuscarNumPedido();
    
    }
    
}
