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
public class TrataLanzadas {
    public static void main(String[] args) {
        //1.
        try { 
            int numA = 30, numB = 0; 
            int numC = numA/numB;  //  No se puede dividir entre 0
            System.out.println ("Result = " + numC); 
        } 
        catch(ArithmeticException ae) { 
            System.out.println ("No se puede dividir entre 0" ); 
            System.out.println("EXCEPCION: "+ae);
        } 
        //2
        try { 
            String textA = null; //valor null 
            System.out.println(textA.charAt(0)); 
        } catch(NullPointerException ne) { 
            System.out.println("El valor es nulo"); 
            System.out.println("EXCEPCION : "+ne);
        } 
       
        //3
        try { 
            String charA = "Me agrada programar :D "; 
            char charC = charA.charAt(26); 
            System.out.println(charC); 
        } 
        catch(StringIndexOutOfBoundsException se) { 
            System.out.println("La posicion a la que intentas acceder no existe");
            System.out.println("EXCEPCION"+se); 
        } 
    }
}
