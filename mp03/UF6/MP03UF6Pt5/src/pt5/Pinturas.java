/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt5;

/**
 *
 * @author mirokshi
 */
public class Pinturas {

    private int id;
    private String nombre;
    private int fecha;
    private String estilo;
    //Variable que asocian a la clase a un pintor
    private Pintor pintor;

    //Obreros
    public Pinturas() { 
    }

    

    public Pinturas(int picture_id, String picture_name, String picture_style, int picture_date) {
        this.id = picture_id;
        this.nombre = picture_name;
        this.estilo = picture_style;
        this.fecha = picture_date;
    }

    public Pinturas(String pictureName, int pictureDate, String pictureStyle) {
        this.nombre = pictureName;
        this.fecha = pictureDate;
        this.estilo = pictureStyle;
    }

    @Override
    public String toString() {
        if(this.pintor == null)return "\n\tPinturas{" + " ID: " + id + ", \n\tNombre: " + nombre + ", \n\tAño creación: " + fecha + ", \n\tEstilo y/o genero: " + estilo + "}";
        return "Pinturas{" + " ID: " + id + ", Nombre: " + nombre + ", Año creación: " + fecha + ", Estilo y/o genero: " + estilo + ", Pintor: "+pintor+ "}\n";
    }



    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public Pintor getPintor() {
        return pintor;
    }

    public void setPintor(Pintor pintor) {
        this.pintor = pintor;
    }

}
