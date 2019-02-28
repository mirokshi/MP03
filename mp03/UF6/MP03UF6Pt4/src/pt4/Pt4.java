/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt4;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Predicate;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import pt4.Pintor;

/**
 *
 * @author mirokshi
 */
public class Pt4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        File f = new File("cn.yap");
        f.delete();

        ObjectContainer db = null;
        try {
            db = Db4oEmbedded.openFile("cn.yap");

            //De la clase pintura instancio los elementos que contiene 
            Pinturas tpinturas = new Pinturas();
            tpinturas.setPictureId(1);
            tpinturas.setPictureName("La noche estrellada");
            tpinturas.setPictureStyle("Postimpresionismo");
            tpinturas.setPictureDate(1889);

            Pinturas tpintura2 = new Pinturas();
            tpintura2.setPictureId(2);
            tpintura2.setPictureName("Lirios");
            tpintura2.setPictureStyle("Postimpresionismo");
            tpintura2.setPictureDate(1889);

            Pinturas tpintura3 = new Pinturas();
            tpintura3.setPictureId(3);
            tpintura3.setPictureName("Los Girasoles");
            tpintura3.setPictureStyle("Postimpresionismo");
            tpintura3.setPictureDate(1888);

            Pinturas tpintura4 = new Pinturas();
            tpintura4.setPictureId(4);
            tpintura4.setPictureName("La persistencia de la memoria");
            tpintura4.setPictureStyle("Surrealismo");
            tpintura4.setPictureDate(1934);

            //Las pinturas instanciadas la paso a un arrayList
            Collection<Pinturas> pinturaC = new ArrayList<>();
            pinturaC.add(tpinturas);
            pinturaC.add(tpintura2);
            pinturaC.add(tpintura3);

            //AÑADO VARIOS PINTORES 
            db.store(new Pintor(1, "Vicen", "Van Gogh", 37, pinturaC));            //ESTE PINTOR TIENE ASOCIADO 3 PINTURAS

            //INSTACION UN NUEVO PINTOR --> Hago esto para despues poder asignar un pintor a una pintura
            Pintor tpintor = new Pintor();
            tpintor.setPintorId(2);
            tpintor.setFirstName("Pablo");
            tpintor.setLastName("Picasso");
            tpintor.setEdad(91);
            //Lo añado a la BD
            db.store(tpintor);

            db.store(new Pintor(3, "Salvador", "Dali", 84));
            db.store(new Pintor(4, "Leonador", "Da Vicci", 67));
            db.store(new Pintor(5, "Claude", "Monet", 86));
            db.store(new Pintor(6, "Diego", "Velasquez", 61));
            db.store(new Pintor(7, "Gustav", "Klimt", 56));

            //AÑADO VARIAS PINTURAS
            db.store(new Pinturas(5, "La gioconda", 1503, "Renacimiento", tpintor)); //Esta pintura lo asocio un pintor
            db.store(new Pinturas(6, "Guernica", 1937, "Surrealismo"));
            db.store(new Pinturas(7, "El beso", 1907, "Modernismo"));
            db.store(new Pinturas(8, "Jirafa en llamas", 1937, "Surrealismo"));
            db.store(new Pinturas(9, "Los amantes", 1928, "Surrealismo"));

            //Comparator
            Comparator<Pintor> cmpPintor = new Comparator<Pintor>() {
                public int compare(Pintor p1, Pintor p2) {
                    return p1.getFirstName().compareTo(p2.getFirstName());  //Ordeno por orden alfabetico la lista por nombres 
                }
            };

            /**
             * PINTORES
             */
            System.out.println("PINTORES----------------------------");
            ObjectSet<Pintor> pintores = db.query(new Predicate<Pintor>() {

                public boolean match(Pintor pintores) {   
                    return true ; 
                }
            });

//            System.out.println("En la clase PINTOR: si hay pinturas asociadas a esta se mostrarán y si no tiene ninguna asociada se mostrará como NULL"
//                    + "\nAl realizar un 'db.store' a un pintor asociando una pintura, la pintura se creará en la clase PINTURA");


//            for (Pintor p : pintores) {
//                System.out.println(p.toString());
//            }

                System.out.println(pintores);       
            System.out.println("\nPINTURAS----------------------------");
            /**
             * PINTURAS
             */
            ObjectSet<Pinturas> pinturas = db.query(new Predicate<Pinturas>() {

                public boolean match(Pinturas pinturas) {
                    return true;
//                    return pinturas.getPictureDate() > 1930 && pinturas.getPictureStyle().toString() == "Surrealismo";     //Busca las pinturas que se hayan creado despues de 1930 y que sean de estilo "surrealista" 
//                      return pinturas.getPictureName().toString() == "La gioconda"; //Busco la pintura que tenga el nombre "La giconda"

                }
            });
//            System.out.println("\nEn la clase PINTURA:si la pintura esta asociada al pintor se mostrará el pintor y si no se mostrará NULL"
//                    + "\nAl hacer un 'db.store' inserta la pintura a la clase misma, pero no a la clase pintores");
//            
          System.out.println(pinturas);
          
          
          
          

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("HOUSTON, tenemos un problema");
        } finally {

            if (db != null) {
                db.close();
            }

        }

    }

}
