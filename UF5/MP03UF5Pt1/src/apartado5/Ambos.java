/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartado5;

import java.io.IOException;

/**
 *
 * @author mirokshi
 */
class Colores {

    void color() throws IOException {
        System.out.println("AZUL");
    }
}

class Room extends Colores {

    @Override
    void color() throws IOException { //si tuviera la Exception generaria error
        System.out.println("BLANCO");
    }

    public static void main(String args[]) {
        Colores obj = new Room();
        try {
            obj.color();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
