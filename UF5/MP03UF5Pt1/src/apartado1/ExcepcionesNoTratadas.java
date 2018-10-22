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
public class ExcepcionesNoTratadas {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        //Excepcion checked
//        FileReader file = new FileReader("archivo.txt"); //con errores por que falta tratar las excepciones 
//        BufferedReader fileInput = new BufferedReader(file); 
//
//        for (int counter = 0; counter < 3; counter++)  
//            System.out.println(fileInput.readLine()); 
//          
//        fileInput.close();

                
        //Excepcion unchecked 
        int arr[]={1,2,3,4,5};
        System.out.println(arr[7]);
        
    }
    
}
