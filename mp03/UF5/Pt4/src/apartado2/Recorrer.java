/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartado2;

import java.util.Scanner;

/**
 *
 * @author mirokshi
 */
public class Recorrer {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        
        String text;
        char caracter, distinguir, buscar;

        do {
            //Introduccion de un texto acabado en INTRO
            System.out.println("Introduce un texto acabado en INTRO");
            text = ent.nextLine().trim();
        } while (text.isEmpty());

        //Introduccion de un caracter a buscar  
        System.out.println("\nIntroudce el caracter a buscar");
        caracter = ent.next().charAt(0);

        //Pregunta si  desea distinguir las mayusculas de las minusculas
        System.out.println("\nDistinguir mayusculas y minusculas? (S/N)");
        distinguir = ent.next().charAt(0);
        
        //Si se quiere distinguir
        if (distinguir == 'S' || distinguir == 's') {
            System.out.println("\nSe distinguiran las mayusculas con las minisculas");
            //Se escoge la direccion de la busqueda
            System.out.println("\nEn que orden busco?\n");
            System.out.println("(1) izquierda -> derecha");
            System.out.println("(2) derecha -> izquierda");
            buscar = ent.next().charAt(0);

            System.out.format("\nEl caracter %c aparece en las posiciones : \n ", caracter);
            switch (buscar) {
                
                //De izquierda a derecha -->
                case '1':

                    for (int i = 0; i < text.length() - 1; i++) {
                        System.out.println(text.indexOf(caracter, i));

                    }

                    break;
                //De derecha a izquierda <--
                case '2':

                    for (int n = text.length(); n >=0; n--) {
                        System.out.println(text.indexOf(caracter, n));
                    }

                    break;

                default:
                    throw new AssertionError();
            }

        }
        //Si no se quiere distinguir
        if (distinguir == 'N' || distinguir == 'n') {
            System.out.println("No se distinguiran las mayusculas con las minisculas");
            //Se escoge la direccion de la busqueda
            System.out.println("\nEn que orden busco?\n");
            System.out.println("(1) izquierda -> derecha");
            System.out.println("(2) derecha -> izquierda");
            buscar = ent.next().charAt(0);
            
            System.out.format("\nEl caracter %c aparece en las posiciones : \n ", caracter);
            switch (buscar) {
                //De izquierda a derecha -->
                case '1':
                    text = text.toLowerCase();
                    for (int i = 0; i < text.length() - 1; i++) {
                        System.out.println(text.indexOf(caracter, i));
                    }

                    break;

                 //De derecha a izquierda <--
                case '2':
                    text = text.toLowerCase();
                    for (int n = text.length()-1; n >= 0; n--) {
                        System.out.println(text.indexOf(caracter, n));
                    }

                    break;

                default:
                    throw new AssertionError();
            }
        }

    }

}
