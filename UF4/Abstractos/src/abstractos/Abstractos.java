/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractos;

/**
 *
 * @author mirokshi
 */
public class Abstractos {

    public static void main(String arg[]) {
        /**
         * Objeto miGuitarra de tipo Instrumento
         */
        Instrumento miGuitarra = new Guitarra();
        System.out.println("Instrumento : " + miGuitarra.tipo);
        miGuitarra.tocar();
        System.out.println();
        /**
         * Objeto miSaxofon de tipo Instrumento
         */
        Instrumento miSaxofon = new Saxofon();
        System.out.println("Instrumento : " + miSaxofon.tipo);
        miSaxofon.tocar();
        System.out.println();
        /**
         * Objeto miViolin de tipo Instrumento
         */
        Instrumento miViolin = new Violin();
        System.out.println("Instrumento : " + miViolin.tipo);
        miViolin.tocar();

    }
}
