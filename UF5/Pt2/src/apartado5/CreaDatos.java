/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartado5;


import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author mirokshi
 */
public class CreaDatos {

    static final String dataFile = "aleatorio";
    static final int numero =142;
    



    public static void main(String[] args) throws IOException {

        DataOutputStream out = null;
        

        try {
            out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)));

            for (int i = 0; i < numero; i++) {
                    out.writeUTF(" ");
                    out.writeInt(numero);

            }
        } finally {
            if (out != null) {
                out.close();
            }
        }

    }
}
