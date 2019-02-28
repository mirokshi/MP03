/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartado5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 *
 * @author mirokshi
 */
public class AccesoAleatorio {
    
    static final String dataFile = "aleatorio";
     
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // Declaració de variables
        Scanner ent=new Scanner(System.in);
         
        int posicion;
        
        do {
        System.out.println("Introduce un numero entero positivo ");
        posicion=ent.nextInt();   
            
        } while (posicion<=0);
        
        
        try ( RandomAccessFile archivo = new RandomAccessFile(dataFile, "rw")) {
            archivo.seek(0); //Pos0
            while (true) {
                archivo.seek(posicion*4);
                 posicion = archivo.readInt();
                 System.out.println(posicion);
                 break;
            }
            
        } catch (Exception e) {
            System.out.println("La posicion indicada no existe o está vacia"); //mensaje de error

        }

    }

}
