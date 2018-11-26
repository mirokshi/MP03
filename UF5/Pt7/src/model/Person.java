/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author mirokshi
 */
public class Person implements Serializable{
     
    
    public enum Gender {MALE, FEMALE, OTHER};

    private String _2_dni;
    private Gender _3_gender;
    private String _1_personName;
    
    public Person(String _1_personName, String _2_dni, Gender _3_gender) {
        this._1_personName = _1_personName;
        this._2_dni = _2_dni;
        this._3_gender = _3_gender;
    }
    
    
    public String get_1_PersonaName() {
        return _1_personName;
    }

    public void set_1_PersonName(String personName) {
        this._1_personName = personName;
    }

    public String get_2_Dni() {
        return _2_dni;
    }

    public void set_2_Dni(String dni) {
        this._2_dni = dni;
    }

    public Gender get_3_Gender() {
        return _3_gender;
    }

    public void set_3_Gender(Gender gender) {
        this._3_gender = gender;
    }
}
