/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factory;

/**
 *
 * @author michael
 */
public class TestaConexao {

    public static void main(String[] args) {
        ConnectionFactory MySQL = new ConnectionFactory();
        MySQL.getConexaoMySQL();
        System.out.println(MySQL.statusConnection());
        MySQL.CloseConnection();
        
    }
    
}
