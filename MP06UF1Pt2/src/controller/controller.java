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
import model.Staff;
import view.view;

/**
 *
 * @author mirokshi
 */
public class controller {
    view v;
    personal p;
    
   public controller(view v,  Staff s){
       this.v = v;
       this.p = s;
       
   }
   
   public writeFile(){
              // pretty print
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // Java objects to String
        String json = gson.toJson(staff);

        //System.out.println(json);

        // Java objects to File
        try (FileWriter writer = new FileWriter("staff.json")) {
            gson.toJson(staff, writer);
        } catch (IOException e) {
            System.out.println(e);
        }
   }
}
