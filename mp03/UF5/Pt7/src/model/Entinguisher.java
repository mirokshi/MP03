/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author profe
 */
public class Entinguisher implements Serializable{
    
    public enum Type { WATER, POWDER, CO2, SPECIAL};
    public enum Size { SMALL, MEDIUM, BIG, VERYBIG};

    
    private Type _2_type;
    private Size _3_size;
    private String _1_modelName;
    
    public Entinguisher(String _1_modelName, Type _2_type, Size _3_size) {
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

    public Type get_2_Type() {
        return _2_type;
    }

    public void set_2_Type(Type type) {
        this._2_type = type;
    }

    public Size get_3_Size() {
        return _3_size;
    }

    public void set_3_Size(Size size) {
        this._3_size = size;
    }
    
    
    
}
