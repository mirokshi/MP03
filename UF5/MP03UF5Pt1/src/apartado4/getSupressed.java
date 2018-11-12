/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartado4;

import java.io.IOException;

/**
 *
 * @author mirokshi
 */
public class getSupressed {
/**Devuelve un array todas las excepciones que se suprimieron
*/
    
    public static void funcion1() throws Exception{
      throw new Exception();
  }
    
  public static void funcion2() throws Throwable{
      try{
          funcion1();
      }catch(Exception e){
        throw e.fillInStackTrace();
      }
  }
  
    public static void main(String[] args)throws Throwable {
        try{
       funcion2();
   }catch(Exception e){
       Throwable[] suppress = e.getSuppressed();
        System.err.println("Atrapado dentro de la principal : ");
      System.out.println(suppress[0].toString());
    }
    }
}