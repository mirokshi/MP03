/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt2;

import java.util.Scanner;

/**
 *
 * @author mirokshi
 */
public class Recorrer {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int posicion = 0;
        String text;
        char caracter, distinguir, buscar;

        do {
            //Introduccion de un texto acabado en INTRO
            System.out.println("Introduce un texto acabado en INTRO");
            text = ent.nextLine();
        } while (text.length() < 1);

        //Introduccion de un caracter a buscar  
        System.out.println("Introudce el caracter a buscar");
        caracter = ent.next().charAt(0);

        System.out.println("Distinguir mayusculas y minusculas? (S/N)");
        distinguir = ent.next().charAt(0);

        if (distinguir == 'S' || distinguir == 's') {
            System.out.println("Se distinguiran las mayusculas con las minisculas");
            System.out.println("\nEn que orden busco?");
            System.out.println("(1) izquierda -> derecha");
            System.out.println("(2) derecha -> izquierda");
            
            buscar = ent.next().charAt(0);
            
            System.out.format("El caracter %c aparece en las posiciones : \n ", caracter);
            switch (buscar) {
                            
                case '1':
                    
                    for (int n = text.length() - 1; n >= 0; n--) {
                        System.out.println(text.indexOf(caracter, n));
                    }
                    

                    break;

                case '2':
                    
                    
                    for (int i=0; i<text.length(); i++) {
                        System.out.println(text.lastIndexOf(caracter, i));
                    
                }
                    

                    break;

                default:
                    throw new AssertionError();
            }

        }

        if (distinguir == 'N' || distinguir == 'n') {
            System.out.println("No se distinguiran las mayusculas con las minisculas");
            System.out.println("\nEn que orden busco?");
            System.out.println("(1) izquierda -> derecha");
            System.out.println("(2) derecha -> izquierda");
            buscar = ent.next().charAt(0);
            switch (buscar) {
                case 1:
//                            for (int i = 0; i < text.length(); i++) {
//                    char c = text.charAt (i); System.out.println (c);  
//                            }
                    break;

                case 2:
//                        buscador2();

                    break;

                default:
                    throw new AssertionError();
            }
        }

    }

}
