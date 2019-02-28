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


class InterfacesPosteriorV8 implements TestInterface 
{ 
    // implementacion de un metodo abstracto
    public void cuadrado(int a) 
    { 
        System.out.println(a*a); 
    } 
  
    public static void main(String args[]) 
    { 
        InterfacesPosteriorV8 d = new InterfacesPosteriorV8(); 
        d.cuadrado(4); 
  
       // metodo por defecto ejecutado
        d.mostrar(); 
    } 
} 
