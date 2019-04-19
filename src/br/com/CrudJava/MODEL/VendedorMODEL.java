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
public class VendedorMODEL {
    
    private String nome_vendedor;
    private String faixa_comissao;
    private Double salario_vendedor;
    private int codigo_vendedor;
    private SexoMODEL fk_sexo;
    /**
     * @return the nome_vendedor
     */
    public String getNome_vendedor() {
        return nome_vendedor;
    }

    /**
     * @param nome_vendedor the nome_vendedor to set
     */
    public void setNome_vendedor(String nome_vendedor) {
        this.nome_vendedor = nome_vendedor;
    }

    /**
     * @return the faixa_comissao
     */
    public String getFaixa_comissao() {
        return faixa_comissao;
    }

    /**
     * @param faixa_comissao the faixa_comissao to set
     */
    public void setFaixa_comissao(String faixa_comissao) {
        this.faixa_comissao = faixa_comissao;
    }

    /**
     * @return the salario_vendedor
     */
    public Double getSalario_vendedor() {
        return salario_vendedor;
    }

    /**
     * @param salario_vendedor the salario_vendedor to set
     */
    public void setSalario_vendedor(Double salario_vendedor) {
        this.salario_vendedor = salario_vendedor;
    }

    /**
     * @return the codigo_vendedor
     */
    public int getCodigo_vendedor() {
        return codigo_vendedor;
    }

    /**
     * @param codigo_vendedor the codigo_vendedor to set
     */
    public void setCodigo_vendedor(int codigo_vendedor) {
        this.codigo_vendedor = codigo_vendedor;
    }

    /**
     * @return the fk_sexo
     */
    public SexoMODEL getFk_sexo() {
        return fk_sexo;
    }

    /**
     * @param fk_sexo the fk_sexo to set
     */
    public void setFk_sexo(SexoMODEL fk_sexo) {
        this.fk_sexo = fk_sexo;
    }
    
    
    
    
    
    
}
