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
public class ClienteMODEL {
   
    private String nome_cliente;
    private String endereco;
    private String cep;
    private String cpf;
    private int codigo_cliente;
    private SexoMODEL fk_sexo;
    private CidadeMODEL fk_cidade;

    /**
     * @return the nome_cliente
     */
    public String getNome_cliente() {
        return nome_cliente;
    }

    /**
     * @param nome_cliente the nome_cliente to set
     */
    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the codigo_cliente
     */
    public int getCodigo_cliente() {
        return codigo_cliente;
    }

    /**
     * @param codigo_cliente the codigo_cliente to set
     */
    public void setCodigo_cliente(int codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
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

    /**
     * @return the fk_cidade
     */
    public CidadeMODEL getFk_cidade() {
        return fk_cidade;
    }

    /**
     * @param fk_cidade the fk_cidade to set
     */
    public void setFk_cidade(CidadeMODEL fk_cidade) {
        this.fk_cidade = fk_cidade;
    }
    
}
