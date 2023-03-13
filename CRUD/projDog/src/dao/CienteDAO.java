package dao;


import factory.ConnectionFactory;
import modelo.Cliente;
import java.sql.*;
import java.sql.PreparedStatement;


public class CienteDAO {
    private Connection connection;
    private Cliente cliente;
    
    public CienteDAO(){
    this.connection = new ConnectionFactory().getConexaoMySQL();   
}
    
    public void adiciona(Cliente cliente){
        String sql = "INSERT INTO cliente(cli_nome) VALUES(?)";
        
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,cliente.getNome());
            stmt.execute();
            stmt.close();
            
        }
        catch(SQLException u){
            throw new RuntimeException(u);
        }
    }
    
    
}
