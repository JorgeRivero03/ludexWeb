
package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUDdcon;
import Modelo.DConsumo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DConsumoDAO implements CRUDdcon{

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    DConsumo dc = new DConsumo();
    
    @Override
    public List listarCon() {
        ArrayList<DConsumo>list=new ArrayList <>();
        String sql= "select * from dconsumo";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                DConsumo dc = new DConsumo();
                dc.setId_consumo(rs.getInt("id_consumo"));
                dc.setFecha_con(rs.getString("fecha_con"));
                dc.setCant_con(rs.getFloat("cant_con"));
                dc.setGasto_con(rs.getFloat("gasto_con"));
                list.add(dc);
                
            }
        } catch (Exception e) {
        
        }
        return list;
    }

    @Override
    public DConsumo list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(DConsumo dcon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean edit(DConsumo dcon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
