/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt7;

import controlador.controlador;
import model.model;
import vista.vista;

/**
 *
 * @author mirokshi
 */
public class Pt7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      vista v=new vista();
      model m=new model();
      controlador c=new controlador(v,m);
      v.setVisible(true);
      
      


//GUI MVC 
//        
//        KeyListener k=new KeyListener(){
//            @Override
//            public void keyTyped(KeyEvent arg0) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//
//            @Override
//            public void keyPressed(KeyEvent arg0) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//
//            @Override
//            public void keyReleased(KeyEvent arg0) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//            
//        };
//        
//        KeyAdapter ka=new KeyAdapter() {
//            @Override
//            public void keyTyped(KeyEvent e) {
//                super.keyTyped(e); 
//                e.getKeyChar();
//            }
//        
//        };
        
    }
    
}
