/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import dao.PintoresDAO;
import java.util.List;
import model.Pintores;

/**
 *
 * @author mirokshi
 */
public class principal {
    public static void main(String[] args) {
        PintoresDAO dao = new PintoresDAO();
        List<Pintores> lstVehiculos = dao.selectAll();
        for (Pintores Pintores : lstVehiculos) {
            System.out.println(Pintores.getId() + "\t" + Pintores.getNombre());
        }
        
        Pintores nuevoPintor = new Pintores();
        nuevoPintor.setNombre("Hola");
        nuevoPintor.setApellido("ssss");
        nuevoPintor.setEdad(34);
        dao.insert(nuevoPintor);
        System.out.println("--------------------");
        lstVehiculos = dao.selectAll();
        
        for (Pintores Pintores : lstVehiculos) {
            System.out.println(Pintores.getId() + "\t" + Pintores.getNombre());
        }
      
    }
}
