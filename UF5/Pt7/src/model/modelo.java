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
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import model.Person.Gender;

/**
 *
 * @author mirokshi
 */
public class modelo {
  private Collection<Person> data;
    private File f;

    public modelo() throws IOException, FileNotFoundException, ClassNotFoundException {
        this(null);
    }
    
    public modelo(String fileName) throws IOException, FileNotFoundException, ClassNotFoundException {
        setFile(fileName);
        loadData();
    }

    public void loadData() throws FileNotFoundException, IOException, ClassNotFoundException {

        data = new ArrayList<Person>();
        if (f.exists()) {
            try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)))) {

                while (true) {
                    Person b=(Person) in.readObject();
                    if(b!=null) data.add(b);
                }

            } catch (EOFException e) {
            };
        }
    }

    public void setFile(String nom) {
        //Si passen un nom incorrecte o buit li poso data.dat
        nom = nom == null || nom.isEmpty()? "data.dat" : nom;
        f = new File(nom);
    }

    public void saveData() throws FileNotFoundException, IOException {

        
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f))) {
            Iterator<Person> it = data.iterator();
            while (it.hasNext()) {
                out.writeObject(it.next());
            }
        }

    }

    public void addData(String name,String dni, Object gender) {
        Person p=new Person(name,dni,(Person.Gender)gender);
        data.add(p);

    }

    public void modifyData(Object obj,String personName,String dni, Object gender) {
        //Per modificar la bicicleta la passem des del controlador junt en els 
        //nous valors a prendre. Com és un objecte s'actualitzarà automàticament
        //dins l'ArrayList
        Person p=(Person)obj;
        p.set_1_PersonName(personName);
        p.set_2_Dni(dni);
        p.set_3_Gender((Person.Gender)gender);
    }

    public void removeData(Object obj) {
        //Per borrar la bicicleta la passem des del controlador 
        Person b=(Person)obj;
        data.remove(b);
    }

    public Collection<Person> getData() {
        return data;
    }
    
    
   
}
