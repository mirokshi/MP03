/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartado2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author mirokshi
 */
public class Buscar {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String text = "";

        System.out.println("Introduce un texto");

        do {
            String linea = console.next().trim();
            text = text + "\n" + linea;
        } while (!text.endsWith("."));

        System.out.println("Introduce la palabra a buscar");
        String regex = console.next();

        text=text.toLowerCase();
        Matcher m = Pattern.compile(regex).matcher(text);

        boolean found = false;
        while (m.find()) {
            System.out.format("He encontrado el texto"
                    + " \"%s\" que comienza "
                    + "en la posicion %d y termina en la posicion %d.%n",
                    m.group(),
                    m.start(),
                    m.end());
            found = true;

        }
    }
}
