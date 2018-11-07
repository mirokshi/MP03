/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartado3;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author mirokshi
 */
public class InicialesExReg {
    
     
     
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        
        String text;
        do {
        System.out.println("Introduce un texto");    
        text=console.next();
        } while (text.isEmpty());
        
        Pattern p = Pattern.compile("\\b[a-zA-Z]"); 
        Matcher m = p.matcher(text); 
        
                while (m.find()) {
                   System.out.print(m.group());
                    System.out.println();
                 
                }
        
        
    }
}
