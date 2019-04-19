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
public class ItemPedidoMODEL {
    
    private PedidoMODEL fk_pedido;
    private ProdutoMODEL fk_produto;
    private int qtdd;

    /**
     * @return the fk_pedido
     */
    public PedidoMODEL getFk_pedido() {
        return fk_pedido;
    }

    /**
     * @param fk_pedido the fk_pedido to set
     */
    public void setFk_pedido(PedidoMODEL fk_pedido) {
        this.fk_pedido = fk_pedido;
    }

    /**
     * @return the fk_produto
     */
    public ProdutoMODEL getFk_produto() {
        return fk_produto;
    }

    /**
     * @param fk_produto the fk_produto to set
     */
    public void setFk_produto(ProdutoMODEL fk_produto) {
        this.fk_produto = fk_produto;
    }

    /**
     * @return the qtdd
     */
    public int getQtdd() {
        return qtdd;
    }

    /**
     * @param qtdd the qtdd to set
     */
    public void setQtdd(int qtdd) {
        this.qtdd = qtdd;
    }
    
    
}
