/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import view.vista;

/**
 *
 * @author mirokshi
 */
public class controlador {
    vista v = new vista();
    MongoClient mongoClient;
    MongoDatabase database;
    MongoCollection<Document> col;
    
    public controlador(){  
    }
    
    public void listBd(){
        mongoClient = new MongoClient();
     for(String s:mongoClient.listDatabaseNames()){        
            System.out.println(s); 
     }

    }
    
    public void connectBd(String bd){
         database = mongoClient.getDatabase(bd);
        for(String s2:database.listCollectionNames()){
            System.out.println(s2);
        }
    }
  
    public void connectCollection(String collection){
         col=database.getCollection(collection);
        for (Document cur : col.find()) {
            System.out.println(cur.toJson());
            
        } 
        
    }
    

    
}
