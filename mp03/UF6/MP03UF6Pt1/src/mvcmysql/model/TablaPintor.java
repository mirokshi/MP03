/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mvcmysql.model;

/**
 *
 * @author profe
 */
public class TablaPintor {
    
    private int _1_actorId;
    private String _2_firstName;
    private String _3_lastName;

    public TablaPintor(int actor_id, String first_name, String last_name) {
        this._1_actorId = actor_id;
        this._2_firstName = first_name;
        this._3_lastName = last_name;
    }

  
    public TablaPintor(String first_name, String last_name) {
        this._2_firstName = first_name;
        this._3_lastName = last_name;
    }

    public int get1_actorId() {
        return _1_actorId;
    }

    public void set1_actorId(int _1_actorId) {
        this._1_actorId = _1_actorId;
    }

    public String get2_firstName() {
        return _2_firstName;
    }

    public void set2_firstName(String _2_firstName) {
        this._2_firstName = _2_firstName;
    }

    public String get3_lastName() {
        return _3_lastName;
    }

    public void set3_lastName(String _3_lastName) {
        this._3_lastName = _3_lastName;
    }


    
    
}
