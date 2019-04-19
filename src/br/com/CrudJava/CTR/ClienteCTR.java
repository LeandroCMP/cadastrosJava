/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.CrudJava.CTR;

import br.com.CrudJava.DAO.ClienteDAO;
import br.com.CrudJava.MODEL.CidadeMODEL;
import br.com.CrudJava.MODEL.ClienteMODEL;
import br.com.CrudJava.MODEL.SexoMODEL;
import java.sql.ResultSet;

/**
 *
 * @author Leroy2
 */
public class ClienteCTR {
    
    ClienteMODEL model = new ClienteMODEL();
    ClienteDAO dao = new ClienteDAO();
    
    
    public void SetCodigo_Cliente(int cod){

    model.setCodigo_cliente(cod);

    }
    
    public int GetCodigo_Cliente(){
    
    return model.getCodigo_cliente();
    
    }
    
    
    public void SetNome_Cliente(String nome){

    model.setNome_cliente(nome);

    }
    
    public String GetNome_Cliente(){
    
    return model.getNome_cliente();
    
    }
    
    
    
     public void SetCep_Cliente(String cep){

    model.setCep(cep);

    }
    
    public String GetCep_Cliente(){
    
    return model.getCep();
    
    }
    
    
     public void SetCPF_Cliente(String cpf){

    model.setCpf(cpf);

    }
    
    public String GetCPF_Cliente(){
    
    return model.getCpf();
    
    }
    
       public void SetEndereco_Cliente(String endereco){

    model.setEndereco(endereco);

    }
    
    public String GetEndereco_Cliente(){
    
    return model.getEndereco();
    
    }
    
     public void SetFk_Sexo_Cliente(SexoMODEL fk_sexo){

    model.setFk_sexo(fk_sexo);

    }
    
    public SexoMODEL GetFk_Sexo_Cliente(){
    
    return model.getFk_sexo();
    
    }
    
    
    
     public void SetFk_Cidade_Cliente(CidadeMODEL fk_cidade){

    model.setFk_cidade(fk_cidade);

    }
    
    public CidadeMODEL GetFk_Cidade_Cliente(){
    
    return model.getFk_cidade();
    
    }
    
    public void DeletarCliente(int cod){
    
    dao.DeleteCliente(cod);
    
    }
    
    
    public void CadastrarCliente(){
    
    dao.InserirCliente(model);
    
    }
    
    
    public void AlterarCliente(int cod){
    
    dao.AlterarCliente(model,cod);
    
    }
    
    public ResultSet BuscarCliente(){
    
    return dao.BuscarCliente(model);
    
    }
    
}
