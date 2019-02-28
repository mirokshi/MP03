/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt3;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

/**
 *
 * @author mirokshi
 */
public class Pt3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ObjectContainer db = null;
        try {
            db = Db4oEmbedded.openFile("qbe.yap");
////INSERT'S            
//            //PINTORES
//            db.store(new TablaPintor(1,"Leonardo","Da Vinci"));
//            db.store(new TablaPintor(2,"Pablo","Piccaso"));
//            db.store(new TablaPintor(3,"Salvador","Dali"));

//            //PINTURAS
//            db.store(new TablaPinturas(1,"La Gioconda",1519,"Renacimiento"));
//            db.store(new TablaPinturas(2,"La Ultima cena",1498,"Renacimiento"));
//            db.store(new TablaPinturas(3,"Guernica",1937,"Cubismo"));
//            db.store(new TablaPinturas(4,"La Persistencia de la memoria",1931,"Surrealismo"));
//            db.store(new TablaPinturas(5,"El grito",1893,"Expresionismo"));


//            //ESCULTURA
//            TablaEscultura Escultura = new TablaEscultura();
//            Escultura.setEsculturaID(1); 
//            Escultura.setNombre("El pensador");
//            Escultura.setFecha(1882);
//            Escultura.setDescripcion("Escultura más famosa de Auguste Rodin");
//              db.store(Escultura);
              
                     

//SELECT
            //BUSCA POR UN CAMPO DE UNA DE LAS CLASES
            TablaPintor  pintor= new TablaPintor("Pablo", null);
            
            //BUSCA POR MAS DE UN CAMPO DE LAS CLASES
//            TablaPinturas pintura=new TablaPinturas("La Gioconda",0,"Renacimiento");
            

            //BUSCA TODOS LOS OBJETOS DE LA BD
//            TablaPintor pintor=new TablaPintor(null, null); //TablaPintores
//            TablaPinturas pintura=new TablaPinturas(null,0, null); //TablaPinturas
//            TablaEscultura escultura=new TablaEscultura(); //TablaEscultura
//            escultura.setDescripcion(null);
            
            
            //BUSCA TODOS LOS OBJETOS DE UNA CLASSE
//            TablaPintor pintor=new TablaPintor(null, null);               
               

            ObjectSet resultadoPintor = db.queryByExample(pintor); //TablaPintores
//            ObjectSet resultadoPintura = db.queryByExample(pintura); //TablaPinturas
//            ObjectSet resultadoEscultura = db.queryByExample(escultura); //TablaEscultura

            System.out.println("+--------------------+");
            System.out.println("PINTORES");
            System.out.println("+--------------------+");
            while (resultadoPintor.hasNext()) {
                System.out.println((TablaPintor) resultadoPintor.next());
            }
            
//            System.out.println("+--------------------+");
//            System.out.println("PINTURAS");
//            System.out.println("+--------------------+");
//            while (resultadoPintura.hasNext()) {
//                System.out.println((TablaPinturas)resultadoPintura.next());
//            }

//            System.out.println("+--------------------+");
//            System.out.println("ESCULTURAS");
//            System.out.println("+--------------------+");
//            while (resultadoEscultura.hasNext()) {
//                System.out.println((TablaEscultura)resultadoEscultura.next());
//            }


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
