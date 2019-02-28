/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import model.Entinguisher.Type;
import model.Entinguisher.Size;

/**
 *
 * @author profe
 */
public class Model {

    private Collection<Entinguisher> data;
    private File f;

    public Model() throws IOException, FileNotFoundException, ClassNotFoundException {
        this(null);
    }
    
    public Model(String fileName) throws IOException, FileNotFoundException, ClassNotFoundException {
        setFile(fileName);
        loadData();
    }

    public void loadData() throws FileNotFoundException, IOException, ClassNotFoundException {

        data = new ArrayList<Entinguisher>();
        if (f.exists()) {
            try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)))) {

                while (true) {
                    Entinguisher b=(Entinguisher) in.readObject();
                    if(b!=null) data.add(b);
                }

            } catch (EOFException e) {
            };
        }
    }

    public void setFile(String nom) {
        nom = nom == null || nom.isEmpty()? "data.dat" : nom;
        f = new File(nom);
    }

    public void saveData() throws FileNotFoundException, IOException {

        
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f))) {
            Iterator<Entinguisher> it = data.iterator();
            while (it.hasNext()) {
                out.writeObject(it.next());
            }
        }

    }

    public void addData(String model,Object type, Object size) {
        Entinguisher b=new Entinguisher(model,(Entinguisher.Type)type,(Entinguisher.Size)size);
        data.add(b);


    }

    public void modifyData(Object obj,String modelName,Object type, Object size) {
       
        Entinguisher b=(Entinguisher)obj;
        b.set_1_ModelName(modelName);
        b.set_2_Type((Entinguisher.Type)type);
        b.set_3_Size((Entinguisher.Size)size);
    }

    public void removeData(Object obj) {
       
        Entinguisher b=(Entinguisher)obj;
        data.remove(b);
    }

    public Collection<Entinguisher> getData() {
        return data;
    }
    
    

}

