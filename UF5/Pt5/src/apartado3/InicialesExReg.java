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
        System.out.println("Introduce tun direccion de correo");    
        text=console.nextLine();
        } while (text.isEmpty());

        

        Pattern p = Pattern.compile("\\b[a-zA-Z]"); 
        Matcher m = p.matcher(text); 
        
        
        System.out.println("Direcciones encontradas");
        
                while (m.find()) {
                   System.out.print(m.group() );                   
                }
        
        
    }
}
