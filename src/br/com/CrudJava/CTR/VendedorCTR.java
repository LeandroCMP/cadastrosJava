/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.CrudJava.CTR;

import br.com.CrudJava.DAO.VendedorDAO;
import br.com.CrudJava.MODEL.SexoMODEL;
import br.com.CrudJava.MODEL.VendedorMODEL;
import java.sql.ResultSet;

/**
 *
 * @author Leroy2
 */
public class VendedorCTR {
    
    VendedorMODEL model = new VendedorMODEL();
    VendedorDAO dao = new VendedorDAO();
    
    
    public void SetCodigo_Vendedor(int cod){
    
   model.setCodigo_vendedor(cod);
    
    }
    
    public int GetCodigo_Vendedor(){
    
    return model.getCodigo_vendedor();
    
    }
    
    
    public void SetNome_Vendedor(String nome){
    
   model.setNome_vendedor(nome);
    
    }
    
    public String GetNome_Vendedor(){
    
    return model.getNome_vendedor();
    
    }
    
    
    public void SetFaixa_Comissao(String comissao){
    
   model.setFaixa_comissao(comissao);
    
    }
    
    public String GetFaixa_Comissao(){
    
    return model.getFaixa_comissao();
    
    }
    
    
    
    public void SetSalario_Vendedor(Double salario){
    
    model.setSalario_vendedor(salario);
    
    }
    
    public Double GetSalario_Vendedor(){
    
    return model.getSalario_vendedor();
    
    }
    
    public SexoMODEL GetFk_Sexo(){
    
    return model.getFk_sexo();
    
    }
    
    public void SetFk_Sexo(SexoMODEL fk_sexo){
    
    model.setFk_sexo(fk_sexo);
    
    }
    
    
    public void InserirVendedor(){
    
    dao.InserirVendedor(model);
    
    }
    
    public void AlterarVendedor(int cod){
    
    dao.AlterarVendedor(model, cod);
    
    }
    
    public void DeletarVendedor(int cod){
    
    dao.DeleteVendedor(cod);
    
    }
    
    
    public ResultSet BuscarVendedor(){
    
    return dao.BuscarVendedor(model);
    
    }
    
    
    
    
    
}
