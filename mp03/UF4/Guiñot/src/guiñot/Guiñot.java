/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiñot;

import java.util.Random;

/**
 *
 * @author mirokshi
 */
public class Guiñot {


    public static void main(String[] args) {

       
        System.out.println("\n----------------------------------------\n");
        System.out.println("CARTAS");
        System.out.println("\n----------------------------------------\n");
        for (Carta c:Carta.values()) {
            System.out.println(c);
        }
        
        System.out.println("\n----------------------------------------\n");
        System.out.println("VALOR");
        System.out.println("\n----------------------------------------\n");
        for (Valor v:Valor.values()) {
            System.out.println(v +" "+ v.muestraValor());
        }
        
         
        System.out.println("\n----------------------------------------\n");
        System.out.println("EL TRIUNFO ES : "+ Palo.obtenerTriunfo() );
        System.out.println("\n----------------------------------------\n");
        
        
        System.out.println("\n----------------------------------------\n");
        System.out.println("MANO GANADORA");
        System.out.println("\n----------------------------------------\n");
        System.out.println(Carta.ganarMano(Carta.ASOROS, Carta.SOTACOPAS));
        System.out.println(Carta.ganarMano(Carta.TRESBASTOS, Carta.ASESPADAS));
           
    }
    
        
    //ENUM PALOS
      public enum Palo {
          
        OROS, COPAS, ESPADAS, BASTOS;
    
        //metodo OBTENERTRIUNFO, implementa un Random para obtener un palo aleatoriamente
           public static Palo obtenerTriunfo() {
            Random r = new Random();
            return values()[r.nextInt(values().length)];
        }
        
    }
      
      //ENUM CARTAS
public enum Carta {
    REYOROS(Valor.REY,Palo.OROS), CABALLOOROS(Valor.CABALLO,Palo.OROS), SOTAOROS(Valor.SOTA,Palo.OROS), SIETEOROS(Valor.SIETE,Palo.OROS), SEISOROS(Valor.SEIS,Palo.OROS),
    CINCOOROS(Valor.CINCO, Palo.OROS), CUATROOROS(Valor.CUATRO,Palo.OROS), TRESOROS(Valor.TRES,Palo.OROS), DOSOROS(Valor.DOS,Palo.OROS), ASOROS(Valor.AS,Palo.OROS),
    REYCOPAS(Valor.REY,Palo.COPAS), CABALLOCOPAS(Valor.CABALLO,Palo.COPAS), SOTACOPAS(Valor.SOTA,Palo.COPAS), SIETECOPAS(Valor.SIETE,Palo.COPAS), SEISCOPAS(Valor.SEIS,Palo.COPAS),
    CINCOCOPAS(Valor.CINCO,Palo.COPAS), CUATROCOPAS(Valor.CUATRO,Palo.COPAS), TRESCOPAS(Valor.TRES,Palo.COPAS), DOSCOPAS(Valor.DOS,Palo.COPAS), ASCOPAS(Valor.AS,Palo.COPAS),
    REYESPADAS(Valor.REY,Palo.ESPADAS), CABALLOESPADAS(Valor.CABALLO,Palo.ESPADAS), SOTAESPADAS(Valor.SOTA,Palo.ESPADAS), SIETEESPADAS(Valor.SIETE,Palo.ESPADAS), SEISESPADAS(Valor.SEIS,Palo.ESPADAS),
    CINCOESPADAS(Valor.CINCO,Palo.ESPADAS), CUATROESPADAS(Valor.CUATRO,Palo.ESPADAS), TRESESPADAS(Valor.TRES,Palo.ESPADAS), DOSESPADAS(Valor.DOS,Palo.ESPADAS), ASESPADAS(Valor.AS,Palo.ESPADAS),
    REYBASTOS(Valor.REY,Palo.BASTOS), CABALLOBASTOS(Valor.CABALLO,Palo.BASTOS), SOTABASTOS(Valor.SOTA,Palo.BASTOS), SIETEBASTOS(Valor.SIETE,Palo.BASTOS), SEISBASTOS(Valor.SEIS,Palo.BASTOS),
    CINCOBASTOS(Valor.CINCO,Palo.BASTOS), CUATROBASTOS(Valor.CUATRO,Palo.BASTOS), TRESBASTOS(Valor.TRES,Palo.BASTOS), DOSBASTOS(Valor.DOS,Palo.BASTOS), ASBASTOS(Valor.AS,Palo.BASTOS);
    
    Valor valor;
    Palo palo;
    
    Carta(Valor valor,Palo palo ){
        this.valor=valor;
        this.palo=palo;
}
 
    public static Carta ganarMano(Carta carta1,Carta carta2){
  
        if (carta1.palo.equals(Palo.obtenerTriunfo())) {
            if (carta1.valor.muestraValor() > carta2.valor.muestraValor());
            return carta1;
            
        }else{
            return carta2;
        }
        
    }
    
    public static Carta ganarMano(Carta c1, Carta c2, Carta c3, Carta c4 ){
        
        // :( 
        
        return c4;
    }
    
}

public enum Valor {
    REY(4), CABALLO(2), SOTA(3), SIETE(0), SEIS(0), CINCO(0), CUATRO(0),TRES(10), DOS(0), AS(11);
    
    int valor;
    
    Valor(int valor){
        this.valor=valor;
    }
    
    int muestraValor(){
        return valor;
    }
}
    
    //metodo sobrecargado
    
//    public static Carta ganarMano(Carta carta1, Carta carta2) {
//       
//        boolean texto = carta1.name().contains(Palo.obtenerTriunfo().name());
//        if (texto==false) {
//            if (carta1.valor>carta2.valor) {
//                System.out.println("Ha ganado la primera carta");
//            return carta1;
//            }
//        }else 
//        System.out.println("Ha ganado la segunda carta");
//        return carta2;
//    }
//
//    public static Carta ganarMano(Carta carta1, Carta carta2, Carta carta3, Carta carta4) {
//        
//        
//
//        return carta2;
//    }



   
}
