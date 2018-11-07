/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartado3;

import java.util.Scanner;

/**
 *
 * @author mirokshi
 */
public class Iniciales {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        String text, x="";
        String signosDePuntuacion = "¡!¿?.,;: ";
       
        do {

            System.out.println("Introduce un texto");
            text = ent.nextLine();

        } while (text.isEmpty());
        
         
        String textSubs = text.substring(0, 1);
        
        for (int i = 0; i < text.length(); i++) {
            x = text.substring(i, i + 1);

            if (signosDePuntuacion.contains(x)) {
                text= text.replaceAll("\\"+x," ");
                
                x = text.substring(i + 1, i + 2);
                textSubs = textSubs +" - "+ x;

            }

        }
        System.out.println(textSubs);

    }

}
