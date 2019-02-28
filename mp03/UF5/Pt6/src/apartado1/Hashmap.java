/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartado1;

import java.util.HashMap;

/**
 *
 * @author mirokshi
 */
public class Hashmap {

    public static void main(String[] args) {

        Profesor profe1= new Profesor(1,"Juan");
        Profesor profe2 = new Profesor(2,"Miguel");
        Profesor profe3 = new Profesor(3,"Luis");
        Profesor profe4 = new Profesor(4,"Jose");

        Aula aula1 = new Aula("2.A", 41);
        Aula aula2 = new Aula("5.C", 33);
        Aula aula3 = new Aula("3.D", 27);
        Aula aula4 = new Aula("1.B", 32);
        
        
        
        HashMap<Profesor, Aula> asociaTutor = new HashMap<>();
        
        //Miro si el HashMap esta vacio
        System.out.println("Aún no hay tutores asociados? "+ asociaTutor.isEmpty());
        
        //Agrego
        asociaTutor.put(profe1, aula2);
        asociaTutor.put(profe2, aula3);
        asociaTutor.put(profe3, aula1);
        asociaTutor.put(profe4, null); //Al mostrar el valor es 'null'
        
        
        //Miro el tamaño del HashMap
        System.out.println("Nnumero de asociaciones "+asociaTutor.size());
        
        /*
        * Metodo putIfAbsent :
        * Si el HashMap tiene una clave y ningun  valor asociado , este lo asocia con el valor dado
        * y si la clave ya tiene asociado un valor mantiene el origial
        */
        asociaTutor.putIfAbsent(profe4, aula4);
        
        //Desasocia un profesor de un aula
        asociaTutor.remove(profe1);
        
        
        //Expresion Lambda que lita el HashMap
        System.out.println("\nLista de profesores que son tutores de un aula");
        asociaTutor.forEach((Profesor, Aula) -> {
            System.out.println(Profesor + " => " + Aula);
        });
        
        
    }

}

class Profesor {

    private int id;
    private String nombre;
    
    public Profesor(int id, String nombre ) {
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "\nProfesor" + "\nID: " + id + "\nNombre: " + nombre;
    }

    


}

class Aula {
    
    private String nombre;
    private int numAlumnos;

    public Aula(String nombre, int horas) {
        this.nombre = nombre;
        this.numAlumnos = horas;
    }

    @Override
    public String toString() {
        return "\n\tAula" + "\n\tNombre: " + nombre + "\n\tNumero de alumnos: " + numAlumnos + '\n';
    }

    
    

}
