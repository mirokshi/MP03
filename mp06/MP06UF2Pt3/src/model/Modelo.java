package model;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;

/**
 *
 * @author mirokshi
 */
public class Modelo {

    private ObjectContainer db;

    private void open() {
        //CREAMOS LA CONEXION Y EL ARCHIVO QUE ALMACENARÁ LOS DATOS
        this.db = Db4o.openFile("database.yap");
    }

    public boolean insertarProducto(Producto objeto) {
        try {
            //BUSCAMOS SI EXISTE EL OBJETO, SI NO INSERTAMOS EL OBJETO RECIBIDO EN LA BASE DE DATOS
            this.open();     
            db.store(objeto);
            this.db.close();
            return true;
        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            System.out.println("bdoo.Controlador.insertarProducto() : " + e);
            return false;
        }
    }

    public boolean modificarProducto(Producto objeto) {
        try {
            //BUSCAMOS SI EXISTE EL OBJETO, SI ES ASÍ LO ACTUALIZAMOS EN LA BASE DE DATOS
            this.open();
            ObjectSet resultados = this.db.queryByExample(new Producto(null, null, objeto.getId()));
            if (resultados.size() > 0) {                
                Producto resultado = (Producto) resultados.next();
                resultado.setNombre(objeto.getNombre());
                resultado.setPrecio(objeto.getPrecio());
                this.db.store(resultado);
                this.db.close();
                return true;
            } else {
                this.db.close();
                return false;
            }
        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            System.out.println("bdoo.Controlador.insertarProducto() : " + e);
            return false;
        }
    }

    public Producto buscarProducto(Producto objeto) {
        this.open();   
        Producto encontrado = null;
        ObjectSet resultados = this.db.queryByExample(objeto);
        
        if (resultados.hasNext()) {
            encontrado = (Producto) resultados.next();
        }
        return encontrado;
    }

    public Producto[] selectProducto(Producto objeto) {
        try {
            //CONSULTAMOS LOS OBJETOS ALMACENADOS EN LA BASE DE DATOS Y LOS RETORNAMOS EN UN ARREGLO DE TIPO Producto
            Producto[] productos = null;
            this.open();
            ObjectSet resultados = this.db.queryByExample(objeto);
            int i = 0;
            if (resultados.hasNext()) {
                productos = new Producto[resultados.size()];
                while (resultados.hasNext()) {
                    productos[i] = (Producto) resultados.next();
                    i++;
                }
            }
            this.db.close();
            return productos;
        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            System.out.println("bdoo.Controlador.insertarProducto() : " + e);
            return null;
        }
    }

    public boolean borrarProducto(Producto objeto) {
        try {
            //CONSULTAMOS LOS OBJETOS ALMACENADOS EN LA BASE DE DATOS Y SI EXISTE UNA COINCIDENCIA LA ELIMINAMOS            
            this.open();
            ObjectSet resultados = this.db.queryByExample(objeto);
            if (resultados.size() > 0) {
                Producto producto = (Producto) resultados.next();
                this.db.delete(producto);
                this.db.close();
                return true;
            } else {
                this.db.close();
                return false;
            }
        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            System.out.println("bdoo.Controlador.insertarProducto() : " + e);
            return false;
        }
    }
    
    
  /**************************************************ALMACEN********************************/
    
    public boolean insertarAlmacen(Almacen objeto) {
        try {
            //BUSCAMOS SI EXISTE EL OBJETO, SI NO INSERTAMOS EL OBJETO RECIBIDO EN LA BASE DE DATOS
            this.open();     
            db.store(objeto);
            this.db.close();
            return true;
        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            System.out.println("bdoo.Controlador.insertarAlmacen() : " + e);
            return false;
        }
    }

    public boolean modificarAlmacen(Almacen objeto) {
        try {
            //BUSCAMOS SI EXISTE EL OBJETO, SI ES ASÍ LO ACTUALIZAMOS EN LA BASE DE DATOS
            this.open();
            ObjectSet resultados = this.db.queryByExample(new Almacen(null, 0, objeto.getId()));
            if (resultados.size() > 0) {                
                Almacen resultado = (Almacen) resultados.next();
                resultado.setNombre(objeto.getNombre());
                resultado.setCapacidad(objeto.getCapacidad());
                this.db.store(resultado);
                this.db.close();
                return true;
            } else {
                this.db.close();
                return false;
            }
        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            System.out.println("bdoo.Controlador.modificarAlmacen() : " + e);
            return false;
        }
    }

    public Almacen buscarAlmacen(Almacen objeto) {
        this.open();   
        Almacen encontrado = null;
        ObjectSet resultados = this.db.queryByExample(objeto);
        
        if (resultados.hasNext()) {
            encontrado = (Almacen) resultados.next();
        }
        return encontrado;
    }

    public Almacen[] selectAlmacen(Almacen objeto) {
        try {
            //CONSULTAMOS LOS OBJETOS ALMACENADOS EN LA BASE DE DATOS Y LOS RETORNAMOS EN UN ARREGLO DE TIPO Almacen
            Almacen[] almacenes = null;
            this.open();
            ObjectSet resultados = this.db.queryByExample(objeto);
            int i = 0;
            if (resultados.hasNext()) {
                almacenes = new Almacen[resultados.size()];
                while (resultados.hasNext()) {
                    almacenes[i] = (Almacen) resultados.next();
                    i++;
                }
            }
            this.db.close();
            return almacenes;
        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            System.out.println("bdoo.Controlador.selectAlmacen() : " + e);
            return null;
        }
    }

    public boolean borrarAlmacen(Almacen objeto) {
        try {
            //CONSULTAMOS LOS OBJETOS ALMACENADOS EN LA BASE DE DATOS Y SI EXISTE UNA COINCIDENCIA LA ELIMINAMOS            
            this.open();
            ObjectSet resultados = this.db.queryByExample(objeto);
            if (resultados.size() > 0) {
                Almacen almacen = (Almacen) resultados.next();
                this.db.delete(almacen);
                this.db.close();
                return true;
            } else {
                this.db.close();
                return false;
            }
        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            System.out.println("bdoo.Controlador.borrarAlmacen() : " + e);
            return false;
        }
    }

}
