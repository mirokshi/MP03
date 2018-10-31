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
        Scanner ent=new Scanner(System.in);
        
        String text;
        char caracter;
        
        System.out.println("Introduce un texto acabado en ENTER");
        text=ent.next();
        
        System.out.println("Introudce el caracter a buscar");
        caracter=ent.next().charAt(0);
        
        
    }
   
}
