/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt5;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseFileLockedException;
import com.db4o.ext.DatabaseReadOnlyException;
import com.db4o.ext.Db4oIOException;
import com.db4o.ext.IncompatibleFileFormatException;
import com.db4o.ext.OldFormatException;
import com.db4o.query.Query;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

/**
 *
 * @author mirokshi
 */
public class Pt5 {

    static ObjectContainer db = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f = new File("soda.yap");

        try {

            db = Db4oEmbedded.openFile("soda.yap");

            inserts();

            /**
             * 1
             */
//            Query q = db.query();
//            q.constrain(Pintor.class);
//            q.descend("nombre").constrain("Pablo"); //Busco al pintor que contenga el nombre de Pablo
//           
//            ObjectSet<Pintor> result = q.execute();
//            System.out.println("Edad actual");
//            for (Pintor p : result) {
//                System.out.println(p.toString());
//            }
//            //MODIFICO
//            Pintor exPint = (Pintor)result.next();
//            exPint.setEdad(99);
//            
//            System.out.println("Edad modifacada");
//            for (Pintor p : result) {
//                System.out.println(p.getNombre()+" "+ p.getEdad());
//            }
//            
//            db.store(exPint); //Se hace un db.store para poder guardar el Pintor


            /**
             * 2
             */
//            Query q = db.query();
//            q.constrain(Pintor.class);
//            q.descend("nombre").constrain("Pablo"); //Busco al pintor que contenga el nombre de Pablo
//          
//            ObjectSet<Pintor> result = q.execute();
//            System.out.println("Muestro antes de borrar");
//            result.forEach((p) -> {
//                System.out.println("\nNombre : " + p.getNombre() +"\nPinturas :" + p.getPinturas());
//            });
//
//            System.out.println("\nReflexion: Borra pintor, pero no borra las pinturas ya que en el pintor solo las tiene asociadas"
//                    + "y la clase pinturas aún se conservarán  ");
//
//            
//            Pintor exPint = (Pintor) result.next();
//            System.out.println("\tBorrando el pintor.....");
//            db.delete(exPint);
//            System.out.println("\n\tPintor borrado!");
//
//
//                    
//            Query q2 = db.query();
//            q2.constrain(Pinturas.class);
//            ObjectSet<Pinturas> resultPintura = q2.execute();
//
//            System.out.println("\nListado de pinturas");
//            resultPintura.forEach((pinturas) -> {
//                System.out.println(pinturas.toString());
//            });


            /**
             * 3
             */
            Pinturas pintura16 = new Pinturas(16, "En la terraza", "Impresionismo", 1881);
            Pinturas pintura17 = new Pinturas(17, "Los paraguas", "Impresionismo", 1881);
            Collection<Pinturas> pinturaC4 = new ArrayList<>();
            pinturaC4.add(pintura16);
            pinturaC4.add(pintura17);

            Pintor pintor12 = new Pintor(11, "Pierre", "Renoir", 78);
            pintor12.setPinturas(pinturaC4);

            db.store(pintor12);

            db.store(pintura16);
            db.store(pintura17);

//            Query q=db.query();
//            q.constrain(Pintor.class);
//            q.descend("pinturas").constrain(pinturaC4);
//            
//            ObjectSet<Pintor> resultPintor = q.execute();
//            resultPintor.forEach((pintor) ->  {
//                 System.out.println(pintor.toString());
//            });


            /**
             * 4 Consulta que busca por un rango min: 60 - max: 80
             *
             */
//            Query q = db.query();
//            q.constrain(Pintor.class);
//            q.descend("edad").constrain(60).greater().and(q.descend("edad").constrain(80).smaller());
//            
//                    
//            ObjectSet<Pintor> resultPintor = q.execute();
//            resultPintor.forEach((pintor)->{
//                System.out.println(pintor.toString());
//            });


            /**
             * 5 Consulta que busca pinturas por el estilo o fecha de creacion
             * estilo : Surrealismo - fecha : 1889
             */
//            Query q = db.query();
//            q.constrain(Pinturas.class);
//            q.descend("estilo").constrain("Surrealismo").or(q.descend("fecha").constrain(1889));
//            
//            
//            ObjectSet<Pinturas> resultPintura = q.execute();
//            resultPintura.forEach((pintura)->{
//                System.out.println(pintura.toString());


//            });
            /**
             * 6 Consulta que busca pintura las cuales su nombre no comience con
             * La
             */
//            Query q=db.query();
//            q.constrain(Pinturas.class);
//            q.descend("nombre").constrain("La").like().not();
//
//            ObjectSet<Pinturas> resultPintura = q.execute();
//            resultPintura.forEach((pintura) -> {
//                System.out.println(pintura.toString());
//            });
            /**
             * 7 Consulta que ordena pintor de forma ascendente dependiendo de
             * la edad
             */
//            Query q=db.query();
//            q.constrain(Pintor.class);
//            q.descend("edad").orderAscending();
//            
//            ObjectSet<Pintor> resultPintor = q.execute();
//            resultPintor.forEach((pintor) ->  {
//                System.out.println("Nombre: "+ pintor.getNombre() +"\nEdad: "+ pintor.getEdad());
//            });

            /**
             * 8 Ordenar por el numero de pinturas de forma ascendente de los
             * pintores usando comparator, sin permitir valores null
             */
//            Comparator<Pintor>cmp = (Pintor p1, Pintor p2) -> p1.getPinturas().size() -p2.getPinturas().size();
//            
//            
//            Query q=db.query();
//            q.constrain(Pintor.class);
//            q.descend("pinturas").constrain(null).not();
//            q.sortBy(cmp);
//            
//            ObjectSet<Pintor> resultPintor = q.execute();
//            resultPintor.forEach((pintor) ->  {
//                 System.out.println(pintor.toString());
//            });


            /**
             * 9 Consulta busca todos los objetos 
             */

            Query q = db.query();
            q.constrain(Object.class);
            
            
            ObjectSet<Object> result = q.execute();
                  result.forEach((pint) -> {
                      if (pint.getClass().equals(Pintor.class)) {
                          System.out.println(pint.toString());
                      }
                      if (pint.getClass().equals(Pinturas.class)) {
                          System.out.println(pint.toString());
                      }
            });

            
            
          
        } catch (DatabaseClosedException | DatabaseFileLockedException | DatabaseReadOnlyException | Db4oIOException | IncompatibleFileFormatException | OldFormatException e) {
            System.out.println(e);
            System.out.println("HOUSTON, tenemos un problema");
        } finally {
            f.delete();
            if (db != null) {
                db.close();
            }

        }
    }

    public static void inserts() {

        //INSTANCION PINTURAS
        Pinturas pintura1 = new Pinturas(1, "La noche estrellada", "Postimpresionismo", 1889);
        Pinturas pintura2 = new Pinturas(2, "Los girasoles", "Posimpresionismo", 1962);
        Pinturas pintura3 = new Pinturas(3, "Lirios", "Posimpresionismo", 1889);
        Pinturas pintura4 = new Pinturas(4, "Trigal con cuervos", "Impresionismo", 1890);
        Pinturas pintura5 = new Pinturas(5, "Autorretrato", "Posimpresionismo", 1889);

        Collection<Pinturas> pinturaC1 = new ArrayList<>();
        pinturaC1.add(pintura1);
        pinturaC1.add(pintura2);
        pinturaC1.add(pintura3);
        pinturaC1.add(pintura4);
        pinturaC1.add(pintura5);

        Pinturas pintura6 = new Pinturas(6, "Guernica", "Cubismo", 1937);
        Pinturas pintura7 = new Pinturas(7, "Las señoritas de Avignon", "Cubismo", 1907);
        Pinturas pintura8 = new Pinturas(8, "El viejo guitarrista ciego", "Expresionismo", 1904);
        Pinturas pintura9 = new Pinturas(9, "La mujer que llora", "Cubismo", 1937);
        Pinturas pintura10 = new Pinturas(10, "El sueño", "Cubismo", 1932);

        Collection<Pinturas> pinturaC2 = new ArrayList<>();
        pinturaC2.add(pintura6);
        pinturaC2.add(pintura7);
        pinturaC2.add(pintura8);
        pinturaC2.add(pintura9);

        Pinturas pintura11 = new Pinturas(11, "La persistencia de la memoria", "Vanguardismo", 1934);
        Pinturas pintura12 = new Pinturas(12, "Jirafa en llama", "Surrealismo", 1937);
        Pinturas pintura13 = new Pinturas(13, "La metamorfosis", "Surrealismo", 1937);
        Pinturas pintura14 = new Pinturas(14, "La cara de la guerra", "Surrealismo", 1940);
        Pinturas pintura15 = new Pinturas(15, "El gran masturbador", "Surrealismo", 1929);

        Collection<Pinturas> pinturaC3 = new ArrayList<>();
        pinturaC3.add(pintura11);
        pinturaC3.add(pintura12);
        pinturaC3.add(pintura13);

        //AGREGO PINTURAS
        db.store(pintura1);
        db.store(pintura2);
        db.store(pintura3);
        db.store(pintura4);
        db.store(pintura5);
        db.store(pintura6);
        db.store(pintura7);
        db.store(pintura8);
        db.store(pintura9);
        db.store(pintura10);
        db.store(pintura11);
        db.store(pintura12);
        db.store(pintura13);
        db.store(pintura14);
        db.store(pintura15);

        //INSTANCIO PINTORES con pinturas asociadas y las guardo
        Pintor pintor1 = new Pintor(1, "Vicen", "Van Gogh", 37, pinturaC1);
        db.store(pintor1);
        Pintor pintor2 = new Pintor(2, "Pablo", "Picasso", 91, pinturaC2);
        db.store(pintor2);
        Pintor pintor3 = new Pintor(3, "Salvador", "Dali", 84, pinturaC3);
        db.store(pintor3);

        //INSTANCIO PINTORES sin pinturas asociadas
        Pintor pintor4 = new Pintor(4, "Leonador", "Da Vicci", 67);
        db.store(pintor4);
        Pintor pintor5 = new Pintor(5, "Claude", "Monet", 86);
        db.store(pintor5);
        Pintor pintor6 = new Pintor(6, "Diego", "Velasquez", 61);
        db.store(pintor6);
        Pintor pintor7 = new Pintor(7, "Gustav", "Klimt", 56);
        db.store(pintor7);
        Pintor pintor8 = new Pintor(8, "Joan", "Miró", 90);
        db.store(pintor8);
        Pintor pintor9 = new Pintor(9, "Miguel", "Angel", 88);
        db.store(pintor9);
        Pintor pintor10 = new Pintor(10, "Edvard", "Munch", 80);
        db.store(pintor10);

    }
}
