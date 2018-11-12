/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartado5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author mirokshi
 */
public class DireccionesOK {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String regex = "[a-zA-Z0-9_.-]+@[a-z]+\\.[a-z]+";
        String correo;
        do {
            System.out.println("Introduce una direccion de correo electronico");
            correo = console.next();
        } while (correo.isEmpty());

        if (correo.length() > 0) {
                
            Matcher m = Pattern.compile(regex).matcher(correo);
            
            boolean found = false;
            
            
            while (m.find()) {
                if (m.matches()== true) {
                System.out.println("Correo correcta");
                System.out.println(m.group());
               }else {
                    System.out.println("Correo incorrecto");
                }
                
                found = true;
            }
            
        }
    }

}
