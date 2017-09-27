/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Henrique
 */
public class DAO {
    Connection con; //variavel do tipo Connection
    String url = "jdbc:mysql://127.0.0.1/biblioteca"; //endereço do banco de dados
    String driver = "com.mysql.jdbc.Driver"; //drive do banco de dados requisitado pelo netbeans
    String user = "root"; //usuario do banco de dados
    String password = "maxi3112"; //senha do banco de dados


    public DAO() { //construtor
    }
    
    public void desconectar(){ //metodo para desconectar do banco de dados
        try {
            con.close(); //fecha conexão
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public Connection conectar(){ //metodo para conectar no banco de dados
        try {
            Class.forName(driver); //nome do drive
            Connection conn = DriverManager.getConnection(url, "root", "maxi3112"); //conecta com o banco de dados
            
            return conn; //retorna a conexão
            } catch (Exception e) {
                System.err.println("ERRO:"); //caso houve erro
                System.err.println(e.getMessage());
            }
            
        return null;
    } 
}
