/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodes;

/**
 *
 * @author profe
 */
public class Cadenes {

    /**
     * Mostra el missatge passat junt en el meu nom
     *
     * @param missatge el text que volem mostrar
     * @return 
     */
    public static String mostraMissatgeSanti(String missatge) {

//        System.out.println(missatge + " Santi");
       return missatge + " Santi";

    }
    
    public static void salutation(String message){
        message = "Hi"+ message;
        System.out.println(message);
        
    }

    public static int buscaCadena(String cadena1, String cadena2, int num) {

        //Casos especials
        if (cadena1 == null || cadena2 == null) {
            return 0;
        }
        if (num < 0) {
            num = 0;
        }
        if (cadena2.isEmpty()) {
            if (num < cadena1.length()) {
                return num;
            } else {
                return cadena1.length();
            }

            //return (num<cadena1.length() ? num : cadena1.length());
        }
        if (num >= cadena1.length()) {
            return -1;
        }

        //A buscar cadena2 dins de cadena1!!
        boolean trobat = false;
        int i;
        for (i = num; i < cadena1.length() && !trobat; i++) {
            //Comparem la lletra actual de cadena1 en la primera de cadena2, i si coincidixen continuem la búsqueda
            if (cadena1.charAt(i) == cadena2.charAt(0)) {
                int j;
                for (j = 0; j < cadena2.length() && i + j < cadena1.length() && cadena1.charAt(i + j) == cadena2.charAt(j); j++);
                if (j == cadena2.length()) {
                    trobat = true;
                }
                //trobat=(j == cadena2.length());
            }
        }
        if (trobat) {
            return i - 1;
        } else {
            return -1;
        }
    }

        public static int buscaParaulavDissenyModular(String text, String paraula, int posicio) {
        
        //Variables locals
        String separadors = "'-;: .,\n";
        int index;
        boolean trobat;
        
        //inicialitzarVariables();
        //Casos especials
        if (text == null || paraula == null) {
            return -1;
        }
        if (posicio < 0) {
            posicio = 0;
        }
        if (paraula.isEmpty()) {
            if (posicio < text.length()) {
                return posicio;
            } else {
                return text.length();
            }
        }
        if (posicio >= text.length()) {
            return -1;
        }
        //inicialitzo variables locals
        trobat = false;
        index = posicio;

        //tractarPrimerElement();
        //Busquem la primera aparició de la subcadena dins del text
        index=buscaCadena(text, paraula, posicio);
        //Si s'ha trobat la paraula
        if(index!=-1){
            //Comprovem si és una paraula aillada o no
            trobat = (index==0 || separadors.contains(String.valueOf(text.charAt(index-1)))) && separadors.contains(String.valueOf(text.charAt(index+paraula.length())));
        }

        //while (!elementFinal() && !trobat()) {
        while (index!=-1 && !trobat) {
            //tractarElement();
            //Busquem la següent aparició de la subcadena dins del text
            index=buscaCadena(text, paraula, index+1);
            //Si s'ha trobat
            if(index!=-1){
                //Comprovem si és una paraula aillada o no
                trobat = (index==0 || separadors.contains(String.valueOf(text.charAt(index-1)))) && separadors.contains(String.valueOf(text.charAt(index+paraula.length())));
            }
        }
        //if(trobat())
        if(trobat)
            //tractamentTrobat();
            return index;
        else 
            //tractamentNoTrobat();
            return -1;
    }

       
    public static int buscaParaula(String cadena1, String cadena2, int num) {
        String separadors = "'-;: .,\n";
        
        //Casos especials
        if (cadena1 == null || cadena2 == null) {
            return -1;
        }
        if (num < 0) {
            num = 0;
        }
        if (cadena2.isEmpty()) {
            if (num < cadena1.length()) {
                return num;
            } else {
                return cadena1.length();
            }
        }
        if (num >= cadena1.length()) {
            return -1;
        }

        //A buscar cadena2 dins de cadena1 COM A PARAULA!!
        boolean trobat = false;
        int i;
        for (i = num; i < cadena1.length() && !trobat; i++) {
            //Comparem la lletra actual de cadena1 en la primera de cadena2, i si coincidixen continuem la búsqueda
            if (cadena1.charAt(i) == cadena2.charAt(0)) {
                int j;
                for (j = 0; j < cadena2.length() && i + j < cadena1.length() && cadena1.charAt(i + j) == cadena2.charAt(j); j++);
                if (j == cadena2.length()) {
                    trobat = (i==0 || separadors.contains(String.valueOf(cadena1.charAt(i-1)))) && separadors.contains(String.valueOf(cadena1.charAt(i+cadena2.length())));
                }
                //trobat=(j == cadena2.length());
            }
        }
        i--;
        if (trobat) {
            return i;
        } else {
            return -1;
        }
    }

    
    /**
     *
     * @param text
     * @param paraula
     * @param posicio
     * @return
     */
    public static int buscaParaula20162017(String text, String paraula, int posicio) {
        boolean trobat;
        int aparicio;
        String separadors = "' .,\n";

        //public static void inicialitzarVariables(){
        trobat = false;
        //}
        do {
            //public static void tractarParaula(){
            aparicio = buscaCadena(text, paraula, posicio);
            if (aparicio >= 0) {
                //Hem trobat la paraula si l'aparició està al principi del text o si està pel mig i el caràcter anterior és un separador
                //i si l'aparició acaba al final del text o acaba pel mig i a continuació ve un caràcter separador
                trobat = ((aparicio == 0 || separadors.contains(String.valueOf(text.charAt(aparicio - 1))))
                        && (aparicio + paraula.length() == text.length() || separadors.contains(String.valueOf(text.charAt(aparicio + paraula.length())))));
                //Preparem posicio per, si cal, fer la següent búsqueda
                posicio = aparicio + 1;
            }
            //}
        } while (//!paraulaFinal() 
                !(aparicio < 0)
                && !trobat);
        //if (trobat) //public static void tractamentTrobat(){
        //{
        return aparicio;
        //} //}
        //else //public static void tractamentNoTrobat(){
        //{
        //    return aparicio;
        //}
        //}
    }

    /**
     * Retorna la subcadena de cadena des de la posició primer a segon menys 1
     * @param cadena
     * @param primer
     * @param segon
     * @return 
     */
    public static String subcadena(String cadena, int primer, int segon){
        //Casos especials
        if(cadena==null) return null;
        if(primer<0) primer=0;
        if(segon<=0 || primer>=cadena.length() || primer>=segon) return "";
        if(segon>cadena.length()) segon=cadena.length();
        
        //Tractament del cas normal
        String resultat="";
        for (int i = primer; i < segon; i++) {
            resultat=resultat+cadena.charAt(i);            
        }

        return resultat;
        //return cadena.substring(primer, segon);
    }

}
