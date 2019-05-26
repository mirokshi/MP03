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

    public String[] getKeysDocument(Document getDoc){
        Set<String> llista = getDoc.keySet();

        ArrayList<String> arrKeys = new ArrayList<String>();

        llista.forEach((s) -> {
            arrKeys.add(s);
        });
        
        String[] keys = new String[arrKeys.size()];
        Object[] objArr = arrKeys.toArray();
        
        int i = 0;
        
        for (Object obj : objArr) {
            keys[i++] = (String)obj;
        }
        
        return keys;
        
    }

    public void insertDocument(String doc){
        // Afegim un document a partir de la seua representació Json (podem rebre una //org.bson.json.JsonParseException)
        try{
        col.insertOne(Document.parse(doc));
        }catch(org.bson.json.JsonParseException e){
            System.out.println(e);
}

    }
    
    public void deleteDocumuent(String doc){
        try {
            col.deleteOne(Document.parse(doc));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void updateDocument(Document doc,String newDoc){
        try {
            col.updateOne(doc,Document.parse(newDoc));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void deleteKey(Document doc,String key){
        try {
            doc.remove(key);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
}

