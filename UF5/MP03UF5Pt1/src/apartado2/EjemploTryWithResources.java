/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartado2;

import java.io.*;

/**
 *
 * @author mirokshi
 */
class Main {

    public static void main(String[] args) {
        
        try ( BufferedReader br = new BufferedReader(new FileReader("archivo.txt"))) {
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException ie) {
            System.out.println("EXCEPCION:" + ie);
        }
    }
}
