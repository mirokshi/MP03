/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartado4;

import java.util.Scanner;

/**
 *
 * @author mirokshi
 */
public class Anagrama {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        String palabra1, palabra2 ;

        do {

            System.out.println("Introduce una palabra : ");
            palabra1 = ent.nextLine();

        } while (palabra1.isEmpty());
        
        do {
            System.out.println("Introduce otra palabra");
            palabra2=ent.nextLine();
        } while (palabra2.isEmpty());
        
        palabra1=palabra1.toLowerCase();
        palabra2=palabra2.toLowerCase();
        
        StringBuilder m=new StringBuilder(palabra1);
        
        System.out.println("Palabra 1 : "+palabra1);
        System.out.println("Palabra 2 :  "+palabra2);
        
        
    }
}
