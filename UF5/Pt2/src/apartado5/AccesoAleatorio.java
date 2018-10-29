/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartado5;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mirokshi
 */
public class AccesoAleatorio {
    
    static final String dataFile = "aleatorio";

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // Declaració de variables
        Random rn = new Random();
        Scanner ent=new Scanner(System.in);
        int posicion=0;
        
        do {
        System.out.println("Introduce un numero entero positivo ");
        posicion=ent.nextInt();   
            
        } while (posicion<0);
        
        int offset=rn.nextInt();
        
        try ( RandomAccessFile archivo = new RandomAccessFile(dataFile, "rw")) {
            archivo.seek(0); //Pos0
            
            //Ens desplacem a la posició desitjada
            archivo.seek(posicion);
            
            //Mostrem un missatge de comiat
            System.out.println(posicion);
        } catch (Exception e) {
            System.out.println("ERROR"); //mensaje de error

        }

    }

}
