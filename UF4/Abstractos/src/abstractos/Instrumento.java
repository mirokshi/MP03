/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractos;

/**
 *
 * @author mirokshi
 */

/**
 * Clase Abstracta Instrumento
 * La cual posee una propiedad tipo y un método abstracto tocar()
 * Todas las clases hijas que tenga están obligadas a implementar este método(tocar())
 */
abstract class Instrumento { 

    public String tipo;

    abstract void tocar(); //Metodo abstracto 
}

/**
 * Clase Concreta Guitarra, hija de Instrumento
 */
class Guitarra extends Instrumento {

    public Guitarra() {
        tipo = "Guitarra";
    }

    public  void tocar() { //hereda este metodo de la clase padre 
        System.out.println("Tocar La Guitarra");
    }
}

/**
 * Clase Concreta Violin, hija de Instrumento
 */
class Violin extends Instrumento {

    public Violin() {
        tipo = "Violin";
    }

    public void tocar() { //hereda este metodo de la clase padre 
        System.out.println("Tocar El violin");
    }
}

/**
 * Clase Concreta Saxofon, hija de Instrumento
 */
class Saxofon extends Instrumento {

    public Saxofon() {
        tipo = "Saxofon";
    }

    public void tocar() { //hereda este metodo de la clase padre 
        System.out.println("Tocar el Saxofon");
    }
    
    /**
     * Cada una de las clases concretas implementan el método tocar()
     * En cada constructor de las clases definimos el tipo
     * En las clases concretas no tenemos la variable tipo declarada pues se usa la variable heredada de la clase Instrumento.
     */
}
