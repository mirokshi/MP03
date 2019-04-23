package controller;

import javax.swing.table.DefaultTableModel;
import model.Almacen;
import model.Modelo;
import model.Producto;


/**
 *
 * @author mirokshi
 */
public class Controlador extends Modelo {

    public Controlador() {

    }

    public boolean insertarProducto(int id, String nombre, String precio) {
        Producto producto = new Producto(nombre, precio, id);
        return this.insertarProducto(producto);
    }

    public boolean modificarProducto(int id, String nombre, String precio) {
        Producto producto = new Producto(nombre, precio, id);        
        return this.modificarProducto(producto);
    }

    public DefaultTableModel productos() {
        String titulos[] = {"ID", "NOMBRE", "PRECIO"};
        DefaultTableModel dtm = new DefaultTableModel(null, titulos);
        Producto producto = new Producto();
        Producto[] p = this.selectProducto(producto);
        if (p != null) {
            for (Producto pro : p) {
                Object[] cli = new Object[3];
                cli[0] = pro.getId();
                cli[1] = pro.getNombre();
                cli[2] = pro.getPrecio();
                dtm.addRow(cli);
            }
        }
        return dtm;
    }

    public boolean borrarProducto(int id) {
        if (id > 0) {
            Producto producto = new Producto(null, null, id);
            return this.borrarProducto(producto);
        } else {
            return false;
        }
    }
    
    /*****************************************ALMACEN*******************************/
    
    /**
     * 
     * @param id
     * @param nombre
     * @param capacidad
     * @return 
     */
     public boolean insertarAlmacen(int id, String nombre, int capacidad) {
        Almacen almacen = new Almacen(nombre, capacidad, id);
        return this.insertarAlmacen(almacen);
    }

     
    public boolean modificarAlmacen(int id, String nombre, int capacidad) {
        Almacen almacen = new Almacen(nombre, capacidad, id);        
        return this.modificarAlmacen(almacen);
    }

    public DefaultTableModel almacenes() {
        String titulos[] = {"ID", "NOMBRE", "CAPACIDAD"};
        DefaultTableModel dtm = new DefaultTableModel(null, titulos);
        Almacen almacen = new Almacen();
        Almacen[] p = this.selectAlmacen(almacen);
        if (p != null) {
            for (Almacen alm : p) {
                Object[] cli = new Object[3];
                cli[0] = alm.getId();
                cli[1] = alm.getNombre();
                cli[2] = alm.getCapacidad();
                dtm.addRow(cli);
            }
        }
        return dtm;
    }

    public boolean borrarAlmacen(int id) {
        if (id > 0) {
            Almacen almacen = new Almacen(null, 0, id);
            return this.borrarAlmacen(almacen);
        } else {
            return false;
        }
    }
   
}
