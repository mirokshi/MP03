/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

/**
 *
 * @author mirokshi
 */
public class Lambda {
        interface OperacionMatematica {

        int operar(int a, int b);
    }
        

    public static int operar(int a, int b, OperacionMatematica OperacionMatematica) {
        return OperacionMatematica.operar(a, b);
    }


    public static void main(String args[]) {


        //with type declaration
        OperacionMatematica suma = (int a, int b) -> a + b;

//        //with out type declaration
//        OperacionMatematica resta = (a, b) -> a - b;
//
//        //with return statement along with curly braces
//        OperacionMatematica multiplicacion = (int a, int b) -> {
//            return a * b;
//        };
//
//        //without return statement and without curly braces
//        OperacionMatematica division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + operar(10, 5, suma));
        
//        System.out.println("10 - 5 = " + tester.operar(10, 5, resta));
//        System.out.println("10 x 5 = " + tester.operar(10, 5, multiplicacion));
//        System.out.println("10 / 5 = " + tester.operar(10, 5, division));

        
    }


}
        
