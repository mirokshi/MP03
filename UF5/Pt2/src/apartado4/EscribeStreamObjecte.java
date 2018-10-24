/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartado4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

/**
 *
 * @author mirokshi
 */
public class EscribeStreamObjecte {

    public static int count=1;

    public static void main(String[] args) throws IOException {
        Scanner ent = new Scanner(System.in);
        Ordenadores o = new Ordenadores();

        //peticion para introducir
        System.out.println("INTRODUCCION DE NUEVO ORDENADOR");
        System.out.print("Sistema Operativo : ");
        o.setSO(ent.next());
        System.out.print("Procesador : ");
        o.setProcesador(ent.next());
        System.out.print("Almacenamiento : ");
        o.setAlmacenamiento(ent.nextInt());
        System.out.print("RAM : ");
        o.setRam(ent.nextInt());

        File dataFile = new File("object");
        ObjectOutputStream out = null;
        try {

            if (dataFile.exists()) {
                out = new AppendingObjectOutputStream(new FileOutputStream(dataFile, true));
                
            } else {
                out = new ObjectOutputStream(new FileOutputStream(dataFile, true));
                
            }
            out.writeObject(o);

        } finally {
            
            if (out != null) {
                out.close();
                
            }
        }

    }

}

class AppendingObjectOutputStream extends ObjectOutputStream {

    public AppendingObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        reset();
    }
}
