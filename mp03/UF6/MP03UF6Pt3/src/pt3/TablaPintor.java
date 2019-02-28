/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pt3;

/**
 *
 * @author profe
 */
public class TablaPintor {
    
    private int actorId;
    private String firstName;
    private String lastName;

    public TablaPintor(int actor_id, String first_name, String last_name) {
        this.actorId = actor_id;
        this.firstName = first_name;
        this.lastName = last_name;
    }

    public TablaPintor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "TablaPintor{" + "actorId=" + actorId + ", firstName=" + firstName + ", lastName=" + lastName + '}';
    }


    
}
