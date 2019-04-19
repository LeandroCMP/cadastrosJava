/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.CrudJava.MODEL;

/**
 *
 * @author Alunos
 */
public class PedidoMODEL {
    
    private VendedorMODEL fk_vendedor;
    private ClienteMODEL fk_cliente;
    private int num_pedido;
    private int prazo_entrega;

    /**
     * @return the fk_vendedor
     */
    public VendedorMODEL getFk_vendedor() {
        return fk_vendedor;
    }

    /**
     * @param fk_vendedor the fk_vendedor to set
     */
    public void setFk_vendedor(VendedorMODEL fk_vendedor) {
        this.fk_vendedor = fk_vendedor;
    }

    /**
     * @return the fk_cliente
     */
    public ClienteMODEL getFk_cliente() {
        return fk_cliente;
    }

    /**
     * @param fk_cliente the fk_cliente to set
     */
    public void setFk_cliente(ClienteMODEL fk_cliente) {
        this.fk_cliente = fk_cliente;
    }

    /**
     * @return the num_pedido
     */
    public int getNum_pedido() {
        return num_pedido;
    }

    /**
     * @param num_pedido the num_pedido to set
     */
    public void setNum_pedido(int num_pedido) {
        this.num_pedido = num_pedido;
    }

    /**
     * @return the prazo_entrega
     */
    public int getPrazo_entrega() {
        return prazo_entrega;
    }

    /**
     * @param prazo_entrega the prazo_entrega to set
     */
    public void setPrazo_entrega(int prazo_entrega) {
        this.prazo_entrega = prazo_entrega;
    }
    
    
    
    
    
    
}
