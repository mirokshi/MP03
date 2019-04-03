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
            System.out.println(pinturas.getId() + "\t"+ pinturas.getNombre() +"\t"+ pinturas.getEpoca() + "\t"+pinturas.getId_pintor());
            
        }
//         
//        System.out.println("INSERTANDO UN NUEVO PINTOR");
//        Pintores nuevoPintor = new Pintores();
//        nuevoPintor.setNombre("Claude");
//        nuevoPintor.setApellido("Monet");
//        nuevoPintor.setEdad(86);
//        daoPintores.insert(nuevoPintor);
//        
//        System.out.println("INSERTANDO UNA NUEVA PINTURA");
//        Pinturas nuevaPintura = new Pinturas();
//        nuevaPintura.setNombre("hola");
//        nuevaPintura.setEpoca("nose");
//        nuevaPintura.setFecha_creacion(1936);
//        nuevaPintura.setId_pintor(nuevoPintor);
//        daoPinturas.insert(nuevaPintura);
//        
//        lstVehiculos = daoPintores.selectAll();
//        
//        for (Pintores Pintores : lstVehiculos) {
//            System.out.println(Pintores.getId() + "\t" + Pintores.getNombre());
//        }
//      
    }
    
}
