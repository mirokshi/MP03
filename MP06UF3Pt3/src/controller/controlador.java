/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import java.util.ArrayList;
import org.bson.Document;
import view.vista;


/**
 *
 * @author mirokshi
 */
public class controlador {
//    vista v = new vista();
    MongoClient mongoClient;
    MongoDatabase database;
    MongoCollection<Document> col;
    
    
    public controlador(){
        
    }

     public String[] listBd(){
        mongoClient = new MongoClient();
        MongoIterable<String> itdatabase = mongoClient.listDatabaseNames();
        ArrayList<String> listDatabase = new ArrayList<String>();
        for( String s:itdatabase){
            listDatabase.add(s);
        }
        
        String  str[] = new String[listDatabase.size()];
        Object[] objArr =  listDatabase.toArray();
        
        int i = 0;
        
        for (Object obj: objArr) {
            str[i++] = (String)obj;
            
        }
        return str;
     
    }
     
       
    public String[] connectBd(String bd){
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

    public void insertDocument(String collection){
        
    }
    
    public void deleteDocumuent(String collection){
        
    }
    
}
