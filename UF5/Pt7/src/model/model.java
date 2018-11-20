/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author mirokshi
 */
public class model {

    private int posicion;
    
    
    public int getPosicion() {
        return posicion;
    }
    
    public void calcularPosicion(String frase, String palabra){
        
        if ( frase == null || palabra== null){
            posicion=-1;
        }else{
        posicion = frase.indexOf(palabra);    
        }
        
    }
    
    
}
