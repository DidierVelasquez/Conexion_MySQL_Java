/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu.gt.mysql_java;
import java.sql.*;


/**
 *
 * @author casa vb
 */
public class Conexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        
        Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost/mensajes_bdd?serverTimezone=UTC",
                                                          "root","123456789");
        
        System.out.println("Conexion exitosa");
    }
    
}
