/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class DConsumo {
    int id_consumo;
    String fecha_con;
    float cant_con, gasto_con;

    public DConsumo() {
    }

    public DConsumo(String fecha_con) {
        this.fecha_con = fecha_con;
    }

    public DConsumo(float cant_con, float gasto_con) {
        this.cant_con = cant_con;
        this.gasto_con = gasto_con;
    }

    public int getId_consumo() {
        return id_consumo;
    }

    public void setId_consumo(int id_consumo) {
        this.id_consumo = id_consumo;
    }





    public String getFecha_con() {
        return fecha_con;
    }

    public void setFecha_con(String fecha_con) {
        this.fecha_con = fecha_con;
    }

    public float getCant_con() {
        return cant_con;
    }

    public void setCant_con(float cant_con) {
        this.cant_con = cant_con;
    }

    public float getGasto_con() {
        return gasto_con;
    }

    public void setGasto_con(float gasto_con) {
        this.gasto_con = gasto_con;
    }
    
    
    
}
