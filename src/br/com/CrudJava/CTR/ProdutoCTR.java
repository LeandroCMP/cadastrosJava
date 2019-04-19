/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.CrudJava.CTR;

import br.com.CrudJava.DAO.ProdutoDAO;
import br.com.CrudJava.MODEL.ProdutoMODEL;
import java.sql.ResultSet;

/**
 *
 * @author Leroy2
 */
public class ProdutoCTR {
    
    ProdutoMODEL model = new ProdutoMODEL();
    ProdutoDAO dao = new ProdutoDAO();
    
    
    public void SetDescricao_produto(String descricao){
    
    model.setDescricao_produto(descricao);
    
    }
    
    public String GetDescricao_produto(){
    
    return model.getDescricao_produto();
    
    }
    
    
    
    public void SetUnidade_produto(String unidade){
    
    model.setUnidade_produto(unidade);
    
    }
    
    public String GetUnidade_produto(){
    
    return model.getUnidade_produto();
    
    }
    
    
    
    public void SetCodigo_produto(int cod){
    
    model.setCodigo_produto(cod);
    
    }
    
    public int GetCodigo_produto(){
    
    return model.getCodigo_produto();
    
    }
    
    
    
    
    public void SetVal_unit(Double val){
    
    model.setVal_unit(val);
    
    }
    
    public Double GetVal_unit(){
    
    return model.getVal_unit();
    
    }
    
    
    public void InserirProduto(){
    
    dao.InserirProduto(model);
    
    }
    
    
    public void AlterarProduto(int cod){
    
    dao.AlterarProduto(model,cod);
    
    }
    
    
    public void DeletarProduto(int cod){
    
    dao.DeleteProduto(cod);
    
    }
    
    
    public ResultSet BuscarProduto(){
    
    return dao.BuscarProduto(model);
    
    }
}
