/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesposteriorv8;

/**
 *
 * @author mirokshi
 */

//Interfaz TestInterface

interface TestInterface 

{ 
    // abstract method 
    public void cuadrado(int a); 
  
    // default method 
    default void mostrar() 
    { 
      System.out.println("Metodo por defecto ejecutado"); 
    } 
} 
