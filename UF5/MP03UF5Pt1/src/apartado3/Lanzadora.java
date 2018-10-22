/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartado3;

/**
 *
 * @author mirokshi
 */
public class Lanzadora {

    //Arithmetic exception
    int numA = 30, numB = 0;
    int numC = numA / numB;  // No se puede dividir entre 0 y lanza un excepcion

 
    //NullPointer Exception        
    String textA = null; //valor null
    char charB =  textA.charAt(0); //al intentar acceder no se puede por que el valor es nulo
    
   //StringIndexOutOfBound Exception
    String charA = "Me agrada programar :D "; // Longitud del texto es 24 
    char charC = charA.charAt(26); // Al intentar acceder a una posicion no existente, lanza una excepcion 
     
    
}
