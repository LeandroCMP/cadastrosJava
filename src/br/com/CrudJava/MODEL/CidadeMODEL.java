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
public class CidadeMODEL {
    
    private String nome_cidade;
    private int cod_cidade;
    private EstadoMODEL estado;

    /**
     * @return the nome_cidade
     */
    public String getNome_cidade() {
        return nome_cidade;
    }

    /**
     * @param nome_cidade the nome_cidade to set
     */
    public void setNome_cidade(String nome_cidade) {
        this.nome_cidade = nome_cidade;
    }

    /**
     * @return the cod_cidade
     */
    public int getCod_cidade() {
        return cod_cidade;
    }

    /**
     * @param cod_cidade the cod_cidade to set
     */
    public void setCod_cidade(int cod_cidade) {
        this.cod_cidade = cod_cidade;
    }

    /**
     * @return the estado
     */
    public EstadoMODEL getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(EstadoMODEL estado) {
        this.estado = estado;
    }
    
    
    
}
