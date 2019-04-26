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
public class Numeros {
    
    /**
     * Rep un número enter i obté la seua representació en un vector d'enters 
     * @param enter el número del que obtindrem la representació
     * @return un vector que a cada casella conté cada dígit del número
     */
    public static   int[] vectorDigits(int enter) {
        
        boolean negatiu = (enter < 0);
        if (negatiu) {
            enter = enter * -1;
        }
        int[] resultat = new int[("" + enter).length()];
        int i = resultat.length - 1;
        while (i >= 0) {
            resultat[i--] = enter % 10;
            enter = enter / 10;
        }
        if (negatiu) {
            resultat[0] = resultat[0] * -1;
        }
        return resultat;

    }
    
    /**
     * Rep un vector d'enters que representa un número i obté el seu valor
     * @param num el vector d'enters que conté els dígits del número
     * @return el valor del números representat
     */
    public static   int numVector(int[] num){
    
        if(num==null) return 0;
        
        int resultat=0, potencia=1,i=num.length-1;
        while(i>0){
            int v=num[i];
            if(v>9 || v<0) return 0;
            resultat += v*potencia; //resultat = resultat + v*potencia
            potencia *= 10;         //potencia = potencia * 10
            i--;
        }
        if(num[0]>9 || num[0]<-9) return 0;
        if(num[0]<0) resultat=resultat*-1;
        
        resultat += num[0]*potencia;  
            
        return resultat;
    
    }
    
    /**
     * Retorna cert si el número que rep com a paràmetre és primer i fals en cas contrari
     * @param num un número enter qualsevol
     * @return cert si el número que rep com a paràmetre és primer i fals en cas contrari
     */
    public static   boolean esPrimer(int num){
    
        if(num<=1) return false;
        int i=2;
        for (; i <=Math.sqrt(num) ; i++) {
            if(num%i==0) break;
        }
        if(num%i==0 && num!=2) return false;
        else return true;
        //return !(num%i==0 && num!=2);
    }

    
    /**
     * Retorna la longitud de l'enter que rep com a paràmetre
     * @param numero un enter
     * @return la longitud de l'enter que rep com a paràmetre
     */
    public static   int longitudNumero(int numero){
    
        //Solució 1: passem el nº a String i obtenim la seua longitud. 
        //Si és negatiu restem 1
        //int resultat=String.valueOf(numero).length();
        //if(numero<0) return resultat-1;
        //return resultat;
        
        //Solució 2: dividim per 10 el número fins que valgue 0 i comptem 
        //quantes divisions hem pogut fer, valor que retornem com a solució
        //if(numero==0) return 1;
        //int compt=0;
        //while(numero!=0){
        //    numero=numero/10;
        //    compt++;
        //} 
        //return compt;

        //Solució 3: dividim per 10 el número fins que valgue 0 i comptem 
        //quantes divisions hem pogut fer, valor que retornem com a solució
        int compt=0;
        do{
            numero=numero/10;
            compt++;
        }while(numero!=0); 
        return compt;
    }
    
        
    /**
     * Retorna l'enter que rep com a paràmetre en els dígits girats
     * @param numero un enter
     * @return l'enter que rep com a paràmetre en els dígits girats
     */
    public static   int revesNumerov1(int numero){
        //Cas especial: els nºs d'un sol dígit
        if(numero>=-9 && numero<=9) return numero;
        
        int suma=0, exp=longitudNumero(numero)-1;
        do {            
            suma=suma+(int)Math.pow(10, exp--)*(numero%10);
            numero/=10;
        } while (numero!=0);
        return suma;
    }
        
    /**
     * Retorna l'enter que rep com a paràmetre en els dígits girats
     * @param numero un enter
     * @return l'enter que rep com a paràmetre en els dígits girats
     */
    public static   int revesNumerov2(int numero){
        //Cas especial: els nºs d'un sol dígit
        if(numero>=-9 && numero<=9) return numero;
        //2.1
        boolean negatiu=(numero<0);
        if(negatiu) numero=numero*-1;
        int[] vector=vectorDigits(numero);
        //2.2
        int[] copia=new int[vector.length];
        for(int i=0, j=copia.length-1;i<vector.length;i++,j--){
            copia[i]=vector[j];
        }
        //2.3
        int resultat=numVector(copia);
        if(negatiu) resultat=resultat*-1;
        return resultat;
    }

    public static int[] descFact(int num){
    
        // Zona de declaració de variables
        int factor=2;        
        int[] resultat=null;
        boolean negatiu=(num<0);
        
        if(num>=-1 && num<=1) return new int[]{num}; 
        
        if(negatiu) num=num*-1;
        

        resultat=new int[num];
        resultat[0]= 1;
        int i=1;
        while(num!=1){        
            if(num%factor==0){
                resultat[i++]=factor;
                num=num/factor;     //num/=factor;
            } else factor=factor+1; //factor++;        
        }
        if(negatiu) resultat[0]=resultat[0]*-1;

        return resultat;    
    }
    
    public static boolean numeroCapicua(int num){
    
        return num==revesNumerov2(num);
    
    }
    
    /**
     * Calcula el màxim comú divisor d'a i b
     * @param a un enter
     * @param b un enter
     * @return el màxim comú divisor d'a i b. Si a o b són menors o iguals que 0 
     * i són diferents retornem -1
     */
    public static int mcdRecursiu(int a, int b){
        if((a<=0 || b<=0) && a!=b) return -1;
        if(a==b) return a;
        if(a<b) return mcdRecursiu(a, b-a);
        return mcdRecursiu(a-b, b);
        
    }
    
    public static int sumaNaturals(int n){
        if(n<0) return -1;
        if(n==0) return 0;
        return n+ sumaNaturals(n-1);
    
    }
    /**
     * Calculem la potencia de x elevat a la n
     * @param x un número real
     * @param n un número enter
     * @return la potència de x elevat a la n. La potència de 0 elevat a la 0 
     * retorna una indeterminació (Double.NaN) 
     */
    public static double potenciaRec(double x, int n){
        if(n==0 && x==0.0) return Double.NaN;
        if(n==0) return 1.0;
        if(n>0) return x*potenciaRec(x,n-1);
        return 1.0/potenciaRec(x,-n);    
    }
    
    public static int nombreCombinatoriRec(int n, int m){
        if(n<0 || m<0 || n<m) return -1;
        if(n==m || m==0) return 1;
        return nombreCombinatoriRec(n-1,m-1)+nombreCombinatoriRec(n-1,m);
    
    }
    

}
