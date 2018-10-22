/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartado1;

import java.io.*;


/**
 *
 * @author mirokshi
 */
public class ExcepcionesCheckedTratadas {

    public static void main(String[] args) throws IOException { //añado esta excepcion el main para el fileInput.close
        FileReader readfile = null;
        try {
            readfile = new FileReader("archivo.txt");
            BufferedReader fileInput = new BufferedReader(readfile);
            for (int counter = 0; counter < 3; counter++) 
                System.out.println(fileInput.readLine());
                fileInput.close(); 
            
        } catch (FileNotFoundException ex) { //catch que trsta la excepcion si no existe el archivo
            System.out.println("El arrchivo al que tratas de acceder no existe" + ex);
        } finally {
            //Creo y escribo en un archivo nuevo
            
            File newfile = new File("newarchivo.txt");
            //Create the file
            if (newfile.createNewFile()) {
                System.out.println("File esta creado!");
            } else {
                System.out.println("File ya existe existe.");
            }

            //Write Content
            FileWriter writer = new FileWriter(newfile);
            writer.write("Test");
            writer.close();

        }

    }
}
