
package Interfaces;

import Modelo.DConsumo;
import java.util.List;


public interface CRUDdcon {
    public List listarCon();
    public DConsumo list(int id);
    public boolean add(DConsumo dcon);
    public boolean edit(DConsumo dcon);
    public boolean eliminar(int id);
}
