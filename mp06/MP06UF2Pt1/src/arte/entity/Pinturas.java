package arte.entity;
// Generated 18 mar. 2019 16:48:34 by Hibernate Tools 4.3.1



/**
 * Pinturas generated by hbm2java
 */
public class Pinturas  implements java.io.Serializable {


     private Integer id;
     private Pintores pintor;
     private String nombre;
     private String epoca;
     private int fechaCreacion;

//    @Override
//    public String toString() {
//        return "Pinturas [ " + "\n ID: " + id + "\n Pintor :" + pintor + "\n Nombre: " + nombre + "\n Epoca: " + epoca + "\n Año creacion: " + fechaCreacion + "\n ]";
//    }

     
    public Pinturas() {
    }

    public Pinturas(Pintores pintor, String nombre, String epoca, int fechaCreacion) {
       this.pintor = pintor;
       this.nombre = nombre;
       this.epoca = epoca;
       this.fechaCreacion = fechaCreacion;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Pintores getPintor() {
        return this.pintor;
    }
    
    public void setPintor(Pintores pintor) {
        this.pintor = pintor;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEpoca() {
        return this.epoca;
    }
    
    public void setEpoca(String epoca) {
        this.epoca = epoca;
    }
    public int getFechaCreacion() {
        return this.fechaCreacion;
    }
    
    public void setFechaCreacion(int fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }




}


