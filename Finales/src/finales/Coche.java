/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finales;

/**
 *
 * @author mirokshi
 */
public final class Coche { //clase final coche 
     
    final int RUEDAS = 4; //variable final definida
    
     public final int getNumRuedas(){ //metodo final el cual no se puede cambiar 
        return RUEDAS;
    }
}

/**
 * si se trata de crear otra clase extendiendo la clase 'Coche',
 * se mostrará un mensaje de error de tiempo de compilación
 */

//class Van extends Coche{
//    
//}


