/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp06uf2pt2;

import dao.PintoresDAO;
import dao.PinturasDAO;
import java.util.List;
import model.Pintores;
import model.Pinturas;

/**
 *
 * @author mirokshi
 */
public class MP06UF2Pt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           PintoresDAO daoPintores = new PintoresDAO();
        List<Pintores> lstVehiculos = daoPintores.selectAll();
        System.out.println("------PINTORES------");
        for (Pintores pintores : lstVehiculos) {
            System.out.println(pintores.getId() + "\t" + pintores.getNombre());
        }
        
        
         PinturasDAO daoPinturas = new PinturasDAO();
        List<Pinturas> lstPinturas = daoPinturas.selectAll();
        System.out.println("------PINTURAS------");
        for (Pinturas pinturas : lstPinturas) {
            System.out.println(pinturas.getId() + "\t"+ pinturas.getNombre() +"\t"+ pinturas.getEpoca()+"\t"+(Pintores)pinturas.getId_pintor());
            
        }
    }
    
}
