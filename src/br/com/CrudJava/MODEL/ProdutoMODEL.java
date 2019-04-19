/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.CrudJava.MODEL;

/**
 *
 * @author Leroy2
 */
public class ProdutoMODEL {
  
    private String descricao_produto;
    private String unidade_produto;
    private int codigo_produto;
    private Double val_unit;

    /**
     * @return the descricao_produto
     */
    public String getDescricao_produto() {
        return descricao_produto;
    }

    /**
     * @param descricao_produto the descricao_produto to set
     */
    public void setDescricao_produto(String descricao_produto) {
        this.descricao_produto = descricao_produto;
    }

    /**
     * @return the unidade_produto
     */
    public String getUnidade_produto() {
        return unidade_produto;
    }

    /**
     * @param unidade_produto the unidade_produto to set
     */
    public void setUnidade_produto(String unidade_produto) {
        this.unidade_produto = unidade_produto;
    }

    /**
     * @return the codigo_produto
     */
    public int getCodigo_produto() {
        return codigo_produto;
    }

    /**
     * @param codigo_produto the codigo_produto to set
     */
    public void setCodigo_produto(int codigo_produto) {
        this.codigo_produto = codigo_produto;
    }

    /**
     * @return the val_unit
     */
    public Double getVal_unit() {
        return val_unit;
    }

    /**
     * @param val_unit the val_unit to set
     */
    public void setVal_unit(Double val_unit) {
        this.val_unit = val_unit;
    }
    
    
    
    
}
