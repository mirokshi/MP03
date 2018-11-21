/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartado4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author mirokshi
 */
public class apartado4 {

    public static void main(String[] args) {
        MultiCapsa<String> mc = new MultiCapsa<String>(new ArrayList<String>());
        mc = new MultiCapsa<String>(new HashSet<String>());
        mc.afegir("Primer");
        mc.afegir("Segon");
        System.out.println((mc.esBuida() ? "buida" : "no buida"));
        System.out.println(mc.obtenir());
        mc.eliminar();
        System.out.println(mc.obtenir());
        mc.eliminar();
        System.out.println((mc.buidar() ? "buidada" : "no buidada"));
        System.out.println((mc.esBuida() ? "buida" : "no buida"));

    }

}

class MultiCapsa<E> {

    private Collection<E> contingut;

    public MultiCapsa(Collection<E> implementacio) {
        contingut = implementacio;
    }

//Implementacion de los metodos
    public boolean esBuida() {
        if (contingut.isEmpty() == true) {
            return true;
        }
        if (contingut.isEmpty() == false) {
            return false;
        }
        return false;
    }

    public void afegir(E elem) {
        contingut.add(elem);
    }

    public E obtenir() {
        Iterator<E> it = contingut.iterator();
        return it.next();

    }

    public boolean eliminar() {
        if (contingut.isEmpty()) {
            return false;
        }

        if (!contingut.isEmpty()) {
            contingut.remove(obtenir());
            return true;

        }
        return false;
    }

    public boolean buidar() {
        if (!contingut.isEmpty()) {
            contingut.removeAll(contingut);
            return true;
        }
        return false;
    }

}
