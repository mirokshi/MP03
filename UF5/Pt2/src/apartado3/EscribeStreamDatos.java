/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartado3;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author mirokshi
 */
public class EscribeStreamDatos {
    
    static final String dataFile = "dates";
    //variables
      
      static String SO ;
      static  String procesador;
      static int almacenamiento;
      static int ram;
     
      
    
    public static void main(String[] args) throws IOException {
    Scanner ent=new Scanner(System.in)    ;
    
        
        //peticion para introducir
        System.out.println("INTRODUCCION DE NUEVO ORDENADOR");
        System.out.print("Sistema Operativo : ");
        SO = ent.next();
        System.out.print("Procesador : ");
        procesador = ent.next();
        System.out.print("Capacidad de almacenamiento");
        almacenamiento = ent.nextInt();
        System.out.print("RAM : ");
        ram =  ent.nextInt();
        
        //
         DataOutputStream out = null;
        
        try {
            out = new DataOutputStream(new
                    BufferedOutputStream(new FileOutputStream(dataFile)));
            
                out.writeUTF(SO);
                out.writeUTF(procesador);
                out.writeInt(almacenamiento);
                out.writeInt(ram);
                
            
        } finally {
            if(out!=null) out.close();
        }

    }
}
    

