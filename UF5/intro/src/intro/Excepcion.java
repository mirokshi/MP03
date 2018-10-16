/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author mirokshi
 */
public class Excepcion {

    public void lanzarExcepcion() throws FileNotFoundException, IOException{
        String path="/";
        BufferedReader b=new BufferedReader(new FileReader(path));
        b.readLine();
        b.close();
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Excepcion e=new Excepcion();
        
        e.lanzarExcepcion();
        
    }
    
}
