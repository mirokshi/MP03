/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartado4;


import static apartado4.EscribeStreamObjecte.count;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author mirokshi
 */
public class LeeStreamObjecte {
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
    File dataFile = new File("object");
    ObjectInputStream in = new ObjectInputStream(new
                    BufferedInputStream(new FileInputStream(dataFile)));;

    
    try {
            
            while (true) {
                Ordenadores o=(Ordenadores) in.readObject();
                System.out.println(o);
            
            }
    }catch (EOFException e){
            
        } finally {
            if(in!=null) in.close();
            
        }
    }

}
