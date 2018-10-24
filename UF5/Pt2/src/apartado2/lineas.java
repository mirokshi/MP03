/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartado2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author mirokshi
 */
public class lineas {

    public static void main(String[] args) throws IOException {

        BufferedReader inputStream1 = null, inputStream2 = null;
        PrintWriter outputStream = null;

        try {
            inputStream1 = new BufferedReader(new FileReader("origin1"));
            inputStream2 = new BufferedReader(new FileReader("origin2"));
            outputStream = new PrintWriter(new FileWriter("fusion"));

            String l;
            
            while ((l = inputStream1.readLine()) != null) {
                outputStream.println(l);
                
            }
            while ((l= inputStream2.readLine()) != null) {
                outputStream.println(l);
            }
            
            
        } finally {
            if (inputStream1 != null && inputStream2 != null) {
                inputStream1.close();
                inputStream2.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

}
