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
public class PruebaLambda {

    //interficie Funcional
    interface Funcional{
    //Unico metodo abstracto
        String concadena(String a, String b);
}
    
    public static void pruebaLambda(String a, String b, Funcional f){
        System.out.println(f.concadena(a, b));
    }
    
    public static void main(String[] args) {
//        ejemplo de clase anonima
        pruebaLambda("Bona"," tarde <3",
                new Funcional(){
                   public String concadena(String a,String b){
                        return a+b;
                    }
                }
                
                );
        
//        ejemplo de expresion lambda
        pruebaLambda("Bona"," tarde",
                (String a, String b) -> a+b
                );
        
         
    }
    
}
