/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartado1;

import static apartado1.RecorrerArray.sumaArray;

/**
 *
 * @author mirokshi
 */
public class RecorrerArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        int[][] prueba = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}};
        int[][] prueba2 = {{}, {}, {}};
        System.out.println(sumaArray(prueba));
        System.out.println(sumaArray(prueba2));
        
    }
    
//    metodo estatico que devuelve un int y tiene como parametro un vector bidimensional
        static int sumaArray(int[][] vector){
            int suma=0;
            //si la longitud del vector  es cero regresa 0
            if (vector.length == 0)  return 0;
                
            //recorre el vector 
                for (int i = 0; i < vector.length; i++) {
                    for (int j = 0; j < vector[0].length; j++) {
                        //suma los valores de las columnas
                        suma+=vector[i][j];
                    }
                }
                //devuelve la suma 
            return suma;
        
}
        
       
    
}

 
