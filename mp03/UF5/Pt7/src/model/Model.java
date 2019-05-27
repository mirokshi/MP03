/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;


/**
 *
 * @author profe
 */
public class Model {

    private Collection<Extinguisher> data;
    private File f;
    final Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .excludeFieldsWithoutExposeAnnotation()
            .create();
    

    public Model() throws IOException, FileNotFoundException, ClassNotFoundException {
        this(null);
    }
    
    public Model(String fileName) throws IOException, FileNotFoundException, ClassNotFoundException {
        setFile(fileName);
        loadData();
    }

    public void loadData() throws FileNotFoundException, IOException, ClassNotFoundException {

        data = new ArrayList<Extinguisher>();
        if (f.exists()) {
             try(Reader reader = new FileReader(f)) {
                JsonReader jr = new JsonReader(reader);
                jr.beginArray();
                 while (jr.hasNext()) {
                     data.add(gson.fromJson(jr, Extinguisher.class));
                 }
            } catch (Exception e) {
                System.out.println("Error al leer");
                 System.out.println(e);
            }
        }
    }

    public void setFile(String nom) {
        nom = nom == null || nom.isEmpty()? "data.json" : nom;
        f = new File(nom);
    }

    public void saveData() throws FileNotFoundException, IOException {
          try(FileWriter writer = new FileWriter(f)) {
                gson.toJson(data,writer);
                System.out.println(gson.toJson(data));
                System.out.println(data);
        } catch (Exception e) {
              System.out.println("Error al escribir");
              System.out.println(e);
        }

    }

    public void addData(String model,String type, String size) {
        Extinguisher b=new Extinguisher(model,type,size);
        data.add(b);


    }

    public void modifyData(Object obj,String modelName,String type, String size) {
       
        Extinguisher b=(Extinguisher)obj;
        b.set_1_ModelName(modelName);
        b.set_2_Type(type);
        b.set_3_Size(size);
    }

    public void removeData(Object obj) {
       
        Extinguisher b=(Extinguisher)obj;
        data.remove(b);
    }

    public Collection<Extinguisher> getData() {
        return data;
    }
    
    

}

