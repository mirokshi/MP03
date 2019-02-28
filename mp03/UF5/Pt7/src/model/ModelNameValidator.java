/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author mirokshi
 * Es una clase que con expresion regular verifica si es correcta o no
 */
public class ModelNameValidator {

    private Pattern pattern;
    private Matcher matcher;

    //La expresion regular sera correcta cuando el nombre del modelo este conformado por una palabra y una serie de numeros
    private static final String MODELNAME_PATTERN = "([A-z]\\w+[0-9])";

    
    public ModelNameValidator() {
        pattern = Pattern.compile(MODELNAME_PATTERN);
    }

    /**
     * Metodo Validate
     * @param name (String)
     * Al String que se pasa le hace un matcher que valida si es corecto dependiendo la expresion regular
     * @return true o false 
     */ 
    public boolean validate(String name) {

        matcher = pattern.matcher(name);
        return matcher.matches();

    }
}
