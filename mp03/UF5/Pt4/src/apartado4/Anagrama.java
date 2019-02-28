/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartado4;

import static java.util.Arrays.sort;
import java.util.Scanner;

/**
 *
 * @author mirokshi
 */
public class Anagrama {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        //Variables 
        String textUno;
        String textDos;

        //Pido dos textos y no salen del bucle si son vacios 
        do {

            System.out.println("Introduce una palabra : ");
            textUno = ent.nextLine();

        } while (textUno.isEmpty());

        do {
            System.out.println("Introduce otra palabra");
            textDos = ent.nextLine();
        } while (textDos.isEmpty());

        //Quito los signos con el metodo de quitar signos 
        String copiaTextUno = quitarSignos(textUno);
        String copiaTextDos = quitarSignos(textDos);

        //Los paso los dos textos a minusculas
        copiaTextUno = copiaTextUno.toLowerCase();
        copiaTextDos = copiaTextDos.toLowerCase();

        //Los ordenos 
        copiaTextUno = ordenaString(copiaTextUno);
        copiaTextDos = ordenaString(copiaTextDos);
        
         //Despues de ordenarlos si los dos textos son iguales retorna "true" 
        if (copiaTextUno.equals(copiaTextDos)) {
            System.out.println("\nSon anagramas");
        } else {
            System.out.println("\nNo son anagramas");
        }
        

    }

    //Metodo que ordena Strings 
    protected static String ordenaString(String string) {
        //Declaro  un array de char que convierte al String a una secuencia de caracteres
        char[] charArray = string.toCharArray();

        //uso el metodo  sort 
        sort(charArray);

        //retorna las secuencia de caracteres odenados en un String 
        return new String(charArray);
    }

    //Metodo que quita signos 
    public static String quitarSignos(String string) {
        //Declaro un int que contiene la longitud del String
        int len = string.length();
        //Declaro un StringBuilder y le paso el int 
        StringBuilder dest = new StringBuilder(len);
        
        char c;

        //Bucle for <-
        for (int i = (len - 1); i >= 0; i--) {
            //lo recorre letra por letra
            c = string.charAt(i);
            
             //Al recorrer el String mira si es una letra
            if (Character.isLetter(c)) {
                //y las va obteniendo
                dest.append(c);
            }
        }
        //al final retorna un String 
        return dest.toString();
    }
}
