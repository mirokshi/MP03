/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introexcepcion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class IntroExcepcion {

    
    public void lanzarExcepciones() throws IOException {
try (BufferedReader b=new BufferedReader(new InputStreamReader(System.in))){
    
    int i=-1;
            while (i<0) {
                try{
                    i=Integer.parseInt(b.readLine());
                    if (i<0) throw new java.lang.NumberFormatException();
                    }catch(java.lang.NumberFormatException e){
                            System.out.println("Vuelve a intentarlo");
                            i=-1;
                            }
                }
            }

    
    }
    public static void main(String[] args) {

        
    }
    
}
