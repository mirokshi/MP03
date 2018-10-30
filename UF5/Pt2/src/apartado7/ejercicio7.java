/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartado7;

import java.util.Formatter; 
import java.util.Scanner;

/**
 *
 * @author mirokshi
 */
public class ejercicio7 {
 
    public static void main(String[] args) {
        
        Scanner ent=new Scanner(System.in);
        Formatter formatter = new Formatter();
        double real = 0;
        String opcion=" ";
        
        System.out.println("Que formato de nuemeros reales desea introducir(?)");
        System.out.println("US : Americano" + "\nEU : Europeo");
        opcion=ent.next();
        
        switch (opcion) {
            case "US": case "us":
               
               System.out.println("Introduce numeros reales (FORMATO AMERICANO)");
               
                break;
            case "EU": case "eu":
                //POR DEFECTO ESTA FORMATO EUROPEO
                
                System.out.println("Introduce numeros reales (FORMATO EUROPEO)");
                real=ent.nextDouble();
            break;
            default:
                System.out.println("¡INCORRECTO!");
                break;
        }
        
        
        
        
        
        
    }
    
   
}
