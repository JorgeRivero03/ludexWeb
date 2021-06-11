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

public class MUsuario {
    
    private int id_usuario;
    private String nom_usuario, app_usuario, sex_usuario, correo_usuario, pass_usuario, user_usu;
    
    //crear el constructor
    
    public MUsuario(){
    
    }
    //metodo para agregar un nuevo usuario
    
    //metodo para eliminar un usuario
    
    //metodo para actualiuzar un usuario
    
    //metodo para consultar todos los usuarios
    
    //metodo para buscar un usuario por id
    
    
    
    
    
    //metodos para verificar el usuario
    
    public MUsuario verificarUsuario(String user, String pass) throws ClassNotFoundException{
        MUsuario u = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            con = Conexion.getConnecto();
            String q ="select * from MUsuario where user_usu = ? and pass_usuario = ?";
            ps = con.prepareStatement(q);
            //enviar los parametros de user y password
            ps.setString(1, user);
            ps.setString(2, pass);
            //ejecutamos al querry
            rs = ps.executeQuery();
            //buscar adentro de la tabla musuario los datos que queremos 
            while(rs.next()){
                u = new MUsuario();
                u.setId_usuario(rs.getInt("id_usuario"));
                u.setNom_usuario(rs.getString("nom_usuario"));
                u.setApp_usuario(rs.getString("app_usuario"));
                u.setSex_usuario(rs.getString("sex_usuario"));
                u.setCorreo_usuario(rs.getString("correo_usuario"));
                u.setPass_usuario(rs.getString("pass_usuario"));
                u.setUser_usu(rs.getString("user_usu"));
                break;
                
            }
        }catch(SQLException e){
            System.out.println("No conecto con la tabla");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            u = null;
        }finally{
            //vamos a cerrar conexiones
            try{
                rs.close();
                ps.close();
                con.close();
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }
        return u;
    }
    
    //metodos get and set

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNom_usuario() {
        return nom_usuario;
    }

    public void setNom_usuario(String nom_usuario) {
        this.nom_usuario = nom_usuario;
    }

    public String getApp_usuario() {
        return app_usuario;
    }

    public void setApp_usuario(String app_usuario) {
        this.app_usuario = app_usuario;
    }

    public String getSex_usuario() {
        return sex_usuario;
    }

    public void setSex_usuario(String sex_usuario) {
        this.sex_usuario = sex_usuario;
    }

    public String getCorreo_usuario() {
        return correo_usuario;
    }

    public void setCorreo_usuario(String correo_usuario) {
        this.correo_usuario = correo_usuario;
    }

    public String getPass_usuario() {
        return pass_usuario;
    }

    public void setPass_usuario(String pass_usuario) {
        this.pass_usuario = pass_usuario;
    }

    public String getUser_usu() {
        return user_usu;
    }

    public void setUser_usu(String user_usu) {
        this.user_usu = user_usu;
    }
    
    
    
}
