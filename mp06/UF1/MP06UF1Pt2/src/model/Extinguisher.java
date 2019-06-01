/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Mirokshi
 */
public class Extinguisher implements Serializable{
    
    
    private String _2_type;
    private String _3_size;
    private String _1_modelName;
    
    
    public Extinguisher(String _1_modelName, String _2_type, String _3_size) {
        this._1_modelName = _1_modelName;
        this._2_type = _2_type;
        this._3_size = _3_size;
    }
    
    
    public String get_1_ModelName() {
        return _1_modelName;
    }

    public void set_1_ModelName(String modelName) {
        this._1_modelName = modelName;
    }

    public String get_2_Type() {
        return _2_type;
    }

    public void set_2_Type(String type) {
        this._2_type = type;
    }

    public String get_3_Size() {
        return _3_size;
    }

    public void set_3_Size(String size) {
        this._3_size = size;
    }

    @Override
    public String toString() {
        return "Extinguisher{" + "_2_type=" + _2_type + ", _3_size=" + _3_size + ", _1_modelName=" + _1_modelName + '}';
    }
        
}
