/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;



/**
 *
 * @author mirokshi
 */
public class Lambda {
    
    //Interficie que contiene un metodo 
        interface Persona {
         //metodo datos persona que contiene tres tiposde datos diferentes (String, int y boolean)
        String datosPersona(String nombre ,int  edad, boolean genero);
    }
        
//Metodo "datosPersona" que implementa la interficie 
    public static String datosPersona(String nombre ,int edad,boolean genero, Persona Persona) {
        return Persona.datosPersona(nombre, edad, genero);
    }


    public static void main(String args[]) {

        //Declaracion de tipo de expresion Lamdba
        Persona datosPersonaLamdba = (String nombre, int edad, boolean genero) ->"Nombre: "+ nombre+ "\nEdad: "+ Integer.toString(edad) +"\nEs hombre? : "+genero ;
        
       
        
//Expresion Lamdba         
        System.out.println("Expresion Lamdba");
        System.out.println("------------------------");
        System.out.println( datosPersona("Emilio Jose", 36,true, datosPersonaLamdba)); 
      

//Clase anonima
        System.out.println("\nClase anonima");
        System.out.println("--------------------------");    
        System.out.println(datosPersona("Maria Cinta",23,false, 
                new Persona(){
                    public String datosPersona(String nombre,int edad, boolean genero ){
                        return "Nombre: "+nombre+"\nEdad: "+Integer.toString(edad)+"\nEs hombre? : "+genero;
                    }
                }
        ));
       


        
    }


}
        
