/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.bson.Document;

/**
 *
 * @author mirokshi
 */
public class modelo {
    MongoClient mongoClient;
    MongoDatabase database;
    MongoCollection<Document> col;
    Document document;
    
       public String[] getBd(){
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
     
       
    public String[] getCollection(String bd){
         database = mongoClient.getDatabase(bd);
            ArrayList<String> listCollection = new ArrayList<String>();
            
        for(String collection:database.listCollectionNames()){
            listCollection.add(collection);
        }
        String collections[] = new String[listCollection.size()];
        Object[] objArr = listCollection.toArray();
        
        int i = 0;
        
         for (Object obj : objArr) {
            collections[i++] = (String)obj;
            
        }
         return collections;
    }
    
    
    public List<Document> getDocument(String collection){
        col = database.getCollection(collection);
        List<Document> documents = new ArrayList();
        
        for (Document doc : col.find()) {
            documents.add(doc);
        }
        return documents;
    }

    public String[] getKeysDocument(){
        Set<String> llista = document.keySet();

        ArrayList<String> keys = new ArrayList<String>();

        llista.forEach((s) -> {
            keys.add(s);
        });
        
        String[] keysNoms = new String[keys.size()];
        Object[] objArr = keys.toArray();
        
        int i = 0;
        
        for (Object obj : objArr) {
            keysNoms[i++] = (String)obj;
        }
        
        return keysNoms;
        
    }
    
    public Collection<Object> getValuesDocument(){
        Collection<Object> llistaValors=document.values();
          return llistaValors;
    }
    
    public void insertDocument(String collection){
        
    }
    
    public void deleteDocumuent(String collection){
        
    }
    
}
