/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Jorge Rivero
 */
import java.sql.*;

public class Conexion {
    //creamos metodo de conexion
    
    public static Connection getConnecto() throws ClassNotFoundException{
    
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String user, pass, url;
            url= "jdbc:myslq://localhost:3306/ludex";
            user= "root";
            pass= "root";
            
            return DriverManager.getConnection(url, user, pass);
            
        }catch(SQLException e){
            System.out.println("No se conecto a la bd");
            System.out.println(e.getMessage()); //obtener el mensaje de error
            System.out.println(e.getStackTrace()); //obtener el hilo del error
        }
        return null;
    }

    static Connection getConexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
            
}
