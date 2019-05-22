/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import controller.controlador;
import java.util.Set;
import model.modelo;
import org.bson.Document;
import view.vista;

/**
 *
 * @author mirokshi
 */
public class Pt3 {

    Document document;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            vista v = new vista();
            modelo m = new modelo();
            controlador c = new controlador(v,m);  
//MongoClient mongoClient = new MongoClient();
//
//for(String s:mongoClient.listDatabaseNames()){        
//            System.out.println(s);        
//}
//        System.out.println("2");
//MongoDatabase database = mongoClient.getDatabase("consultes");
//
//for(String s:database.listCollectionNames()){
//            System.out.println(s);
//}
//        System.out.println("3");
//MongoCollection<Document> col=database.getCollection("users");
//        for (Document document : col.find()) {
//            System.out.println(document.toJson());
//        }
//        System.out.println("4");
//        
        
        
    }
    
}
