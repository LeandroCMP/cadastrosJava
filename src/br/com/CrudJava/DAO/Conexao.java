package br.com.CrudJava.DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leroy
 */
public class Conexao {
    
final private String caminho ="jdbc:postgresql://localhost:5432/";
final    private String banco = "bancoprincipal";
final    private String senha = "1234";
final    private String usuario = "postgres";
    

    public Connection getConnection() {
         Connection con = null;
        try{
             Class.forName("org.postgresql.Driver");
        
         try {
          
           con = DriverManager.getConnection(caminho+banco,usuario,senha);
             System.out.println("Conexão Bem-Sucedida");
        } 
        catch (SQLException e) {
            
            System.out.println("Não foi possivel se conectar ao banco de dados!");
            throw new RuntimeException(e);
            
        }
        
        } catch (ClassNotFoundException ex) {
            
            System.out.println("Classe não Encontrada");
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            
        }
     return con;
    }
    

    
    
}
