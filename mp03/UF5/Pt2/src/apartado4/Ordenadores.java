/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartado4;

import static apartado4.EscribeStreamObjecte.count;
import java.io.Serializable;

/**
 *
 * @author mirokshi
 */
public class Ordenadores implements Serializable {
   
      private  String SO ;
      private   String procesador;
      private  int almacenamiento;
      private  int ram;



    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    
    @Override
    public String toString() {
          
        return "Ordenador "+(count++) + " SO=" + SO + ", procesador=" + procesador + ", almacenamiento=" + almacenamiento + ", ram=" + ram;
    }
    
    
}
