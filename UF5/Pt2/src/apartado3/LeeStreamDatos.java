/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartado3;


import java.io.*;



/**
 *
 * @author mirokshi
 */
public class LeeStreamDatos {
     static final String dataFile = "dates";

     
        public static void main(String[] args) throws IOException {

        DataInputStream in = null;
        try {
           in = new DataInputStream(new
                    BufferedInputStream(new FileInputStream(dataFile)));
            
           String SO2;
           String procesador2;
           int almacenamiento2;
           int ram2;
           
                   
            try {
                while (true) {
                    SO2 = in.readUTF();
                    procesador2 = in.readUTF();
                    almacenamiento2 = in.readInt();
                    ram2 = in.readInt();
                    
                     System.out.format("Sistema operativo %s\nProcesador %s\nAlmacenamiento %d\nRAM %d\n" ,SO2, procesador2,almacenamiento2, ram2);
                }
                 } catch (EOFException ex) { }
            
        } finally {
            if(in!=null) in.close();
        }
    }

    
}
