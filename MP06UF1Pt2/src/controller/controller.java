/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import model.person;
import view.view;

/**
 *
 * @author mirokshi
 */
public class controller {
    view v;
    person p;
    
   public controller(view v,  person p){
       this.v = v;
       this.p = p;
       
   }
   
   public void writeFile(){
              // pretty print
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // Java objects to String
        String json = gson.toJson(p);

        //System.out.println(json);

        // Java objects to File
        try (FileWriter writer = new FileWriter("persons.json")) {
            gson.toJson(p, writer);
        } catch (IOException e) {
            System.out.println(e);
        }
   }
   
   public person createPerson(){
       p.setName("Mirokshi");
       p.setSurname("Rojas");
       p.setAge(20);
       p.setPhone(656445154);       
       return p;
       
   }
}
