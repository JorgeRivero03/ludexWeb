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
import java.util.*;
import java.sql.*;


public class MAdiccionUsuario {
    private int id_adiccion, id_usuario;
    private float consumo_historico, gasto_historico;
    private String fecha_adiccion;
    
    
    public MAdiccionUsuario(){
    
    }
    
    //metodo que se encarga en obtener toda las listas de gastos de adicciones 
    
    public Vector<MAdiccionUsuario> listaConGas() throws ClassNotFoundException{
        Vector<MAdiccionUsuario> lcg = new Vector<MAdiccionUsuario>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            con = Conexion.getConexion();
            String q = "select * from MAdiccionUsuario";
            ps = con.prepareStatement(q);
            rs = ps.executeQuery();
            //buscar todas las listas de la tabla
            while(rs.next()){
            //instancia de la listaConsumo
                MAdiccionUsuario consumo = new MAdiccionUsuario();
                consumo.setId_adiccion(rs.getInt("id_adiccion"));
                consumo.setFecha_adiccion(rs.getString("fecha_adiccion"));
                consumo.setConsumo_historico(rs.getFloat("consumo_historico"));
                consumo.setGasto_historico(rs.getFloat("gasto_historico"));
                consumo.setId_usuario(rs.getInt("id_usuario"));
                //los agrego a la lista consumo gasto
                lcg.add(consumo);
                       
            }
        }catch(SQLException e){
            System.out.println("No encontro la tabla consumo gasto");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            lcg = null;
        }finally{
            //cerramos conexiones
            try{
                rs.close();
                ps.close();
                con.close();
            }catch(SQLException e){
                System.out.println(e.getMessage());
                
            }
        }
        return lcg;
    }
    
    
    
    
    
    //constructor

    public int getId_adiccion() {
        return id_adiccion;
    }

    public void setId_adiccion(int id_adiccion) {
        this.id_adiccion = id_adiccion;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public float getConsumo_historico() {
        return consumo_historico;
    }

    public void setConsumo_historico(float consumo_historico) {
        this.consumo_historico = consumo_historico;
    }

    public float getGasto_historico() {
        return gasto_historico;
    }

    public void setGasto_historico(float gasto_historico) {
        this.gasto_historico = gasto_historico;
    }

    public String getFecha_adiccion() {
        return fecha_adiccion;
    }

    public void setFecha_adiccion(String fecha_adiccion) {
        this.fecha_adiccion = fecha_adiccion;
    }
    
    
    
}
