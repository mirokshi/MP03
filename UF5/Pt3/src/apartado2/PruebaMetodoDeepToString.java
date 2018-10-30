/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartado2;

import java.util.Arrays;

/**
 *
 * @author mirokshi
 */
public class PruebaMetodoDeepToString {
    public static void main(String[] args) {
                // Array de 2 dimensiones  
        int[][] mat = new int[2][2]; 
        mat[0][0] = 5; 
        mat[0][1] = 10; 
        mat[1][0] = 15; 
        mat[1][1] = 20; 
        
        
        //
        System.out.println(Arrays.deepToString(mat));
    }
}
