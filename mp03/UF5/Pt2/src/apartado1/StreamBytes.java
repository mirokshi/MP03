/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartado1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author mirokshi
 */
public class StreamBytes {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        
        try {
            in = new FileInputStream("text_original");
            out = new FileOutputStream("text_bytes");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
                
            }
             
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
           
        }
    }

}
