/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp06uf1pt2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;


/**
 *
 * @author mirokshi
 */
public class MP06UF1Pt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // pretty print
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

            Staff staff = createStaffObject();

        // Java objects to String
        String json = gson.toJson(staff);

        //System.out.println(json);

        // Java objects to File
        try (FileWriter writer = new FileWriter("staff.json")) {
            gson.toJson(staff, writer);
        } catch (IOException e) {
            System.out.println(e);
        }
        
        try (Reader reader = new FileReader("staff.json")) {

            // Convert JSON File to Java Object
            Staff staff2 = gson.fromJson(reader, Staff.class);
			
			// print staff 
            System.out.println(staff);

        } catch (IOException e) {
            System.out.println(e);
        }

    }

    
    private static Staff createStaffObject() {

        Staff staff = new Staff();
        staff.setName("mkyong");
        staff.setAge(35);
        staff.setPosition(new String[]{"Founder", "CTO", "Writer"});
        staff.setSkills(Arrays.asList("java", "python", "node", "kotlin"));
        return staff;

    }
    
    

}
