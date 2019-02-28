/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaconstructores;

/**
 *
 * @author mirokshi
 */

  
public class HerenciaConstructores {
    
    public static void main (String [ ] Args) {

        Profesor profesor1 = new Profesor ("Juan", "Hernández García", 33);

        profesor1.setIdProfesor("Prof 22-387-11");

        profesor1.mostrarNombreApellidosYCarnet();
    }

} 
