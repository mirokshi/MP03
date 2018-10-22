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
public class ExcepcionesTratadas {

   
    
    public static void main(String args[]) {
         int arr[] ={1,2,3,4,5};
       try{
	   System.out.println(arr[6]);
	}
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("La posicion a la que intentas accedir no existe ");
	   System.out.println("EXCEPCION "+ e);
	} finally{
           System.out.println("Posicion arr[2] contiene el valor :");
           System.out.println(arr[2]);
       }
    }
}
