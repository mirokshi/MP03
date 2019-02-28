/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartado1;

/**
 *
 * @author mirokshi
 */
public class NumDecimales {

    public static void main(String[] args) {

        int decimales = 0, entero;

        if (args.length != 0) {

            for (int i = 0; i < args.length; i++) {

                double argsdbl = Double.parseDouble(args[i]);
                entero = (int) argsdbl;

                System.out.println(argsdbl);

                while (argsdbl > entero) {
                    argsdbl *= 10;
                    decimales++;
                    entero = (int) argsdbl;
                }

                System.out.println("Tiene " + decimales + " decimales");
            }
        } else {
            System.out.println("Incorrecto | Error");

        }

    }
}
