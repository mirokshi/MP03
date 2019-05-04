/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodes;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author profe
 */
public class CadenesTest {
    
    public CadenesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * @group Profe
     * Test of mostraMissatgeSanti method, of class Cadenes.
     */
    @Test
    public void testMostraMissatgeSanti() {
        System.out.println("mostraMissatgeSanti -> Cadena vacia");
        String missatge = "";
        Cadenes.mostraMissatgeSanti(missatge);
        
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
    /**
    * @group Mirokshi
    * Test of mostraMissatgeSanti method, of class Cadenes.
    */
    @Test
    public void testMostraMissatgeSantiParemeterCorrect() {
        System.out.println("mostraMissatgeSanti -> Valor String");
        String missatge = "Hola";
        Cadenes.mostraMissatgeSanti(missatge);
        
    }
    
    /**
    * @group Mirokshi
    * Test of mostraMissatgeSanti method, of class Cadenes.
    */
    @Test
    public void testMostraMissatgeSantiParameterNull() {
        System.out.println("mostraMissatgeSanti -> Valor null");
        String missatge = null;
        Cadenes.mostraMissatgeSanti(missatge);
    }

    /**
     * @group Profe
     * Test of buscaCadena method, of class Cadenes.
     */
    @Test
    public void testBuscaCadena() {
        System.out.println("buscaCadena");
        String cadena1 = "";
        String cadena2 = "";
        int num = 0;
        int expResult = 0;
        int result = Cadenes.buscaCadena(cadena1, cadena2, num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
    /**
     * @group Mirokshi
     * Test of buscaCadena method, of class Cadenes.
     */
    @Test
    public void testBuscaCadenaTwoParametersNull(){
        System.out.println("testBuscaCadenaTwoParametersNull");
        System.out.println("-> si los dos o algunos de los strings son null = -1 ");
        String cadena1= null;
        String cadena2 = null;
        int num = 0;
        //Resultado
        int expResult = -1;
        int result =  Cadenes.buscaCadena(cadena1, cadena2, num);
        assertEquals(expResult, result);
    }

    /**
     * @group Mirokshi
     * Test of buscaCadena method, of class Cadenes.
     */
    @Test
    public void testBuscaCadenaOneParameterNull(){
        System.out.println("testBuscaCadenaOneParameterNull");
        System.out.println("-> si un string es null = -1");
        String cadena1= null;
        String cadena2 = "subcadena";
        int num = 0;
        //Resultado
        int expResult = -1;
        int result =  Cadenes.buscaCadena(cadena1, cadena2, num);
        assertEquals(expResult, result);
    }
    
    /**
     * @group Mirokshi
     * Test of buscaCadena method, of class Cadenes.
     */
    @Test
    public void testBuscaCadenaNumberNegative(){
        System.out.println("testBuscaCadenaNumberNegative");
        System.out.println("-> si el numero es negativo = 0");
        String cadena1= "textex";
        String cadena2 = "";
        int num = -10;
        //Resultado
        int expResult = 0;
        int result =  Cadenes.buscaCadena(cadena1, cadena2, num);
        assertEquals(expResult, result);
    }
    
    /**
     * @group Mirokshi
     * Test of buscaCadena method, of class Cadenes.
     */
    @Test
    public void testBuscaCadenaSecondParameterEmpty(){
        System.out.println("testBuscaCadenaSecondParameterEmpty");
        System.out.println("-> si el segundo string es vacio retornará el valor menor entre el numero y la"
                + "longitud del primer string");
        String cadena1= "textex";
        String cadena2 = "";
        int num = 2;
        //Resultado
        int expResult = 2;
        int result =  Cadenes.buscaCadena(cadena1, cadena2, num);
        assertEquals(expResult, result);
    }
    
    /**
     * @group Mirokshi
     * Test of buscaCadena method, of class Cadenes.
     */
    @Test
    public void testBuscaCadenaNumberExceedsLength(){
        System.out.println("testBuscaCadenaNumberExceedsLength");
        System.out.println("Si el numero es superior o igual a la longitud del primer string = -1");
        String cadena1= "textex";
        String cadena2 = "ex";
        //Resultado
        int expResult = -1;
        int result =  Cadenes.buscaCadena(cadena1, cadena2, cadena1.length());
        assertEquals(expResult, result);
    }
    
    /**
     * @group Mirokshi
     * Test of buscaCadena method, of class Cadenes.
     */
    @Test
    public void testBuscaCadenaOK(){
        System.out.println("testBuscaCadenaOK");
        System.out.println("Prueba de la ejecución correcta del metodo");
        String cadena1= "textex";
        String cadena2 = "";
        int num = 20;
        //Resultado
        int expResult = 6;
        int result =  Cadenes.buscaCadena(cadena1, cadena2, num);
        assertEquals(expResult, result);
    }
    
    /**
     * @group Mirokshi
     * Test of buscaCadena method, of class Cadenes.
     */
    @Test(timeout=1000)
    public void testBuscaCadenawithTimeout(){
        System.out.println("testBuscaCadenaWithTimeout");
        String cadena1= "textex";
        String cadena2 = "";
        int num = cadena1.length()+10;
        //Resultado
        int expResult = 6;
        int result =  Cadenes.buscaCadena(cadena1, cadena2, num);
        assertEquals(expResult, result);
    }
    
    /**
     * @group Mirokshi
     * Test of buscaCadena method, of class Cadenes.
     */
    @Test(expected=RuntimeException.class)
    public void testBuscaCadenaWithException(){
        System.out.println("testBuscaCadenaWithException");
        System.out.println("Expected error -> RuntimeException");
        String cadena1= "textex";
        String cadena2 = "";
        int num = cadena1.length()+10;
        //Resultado
        int expResult = 6;
        int result =  Cadenes.buscaCadena(cadena1, 2, num);
        assertEquals(expResult, result);
    }
    
    /**
     * @group Mirokshi
     * Test of buscaCadena method, of class Cadenes.
     */
    @Ignore
    @Test()
    public void IgnoreTestBuscaCadena(){
        System.out.println("IgnoreTestBuscaCadena");
        System.out.println("Expected error -> RuntimeException");
        String cadena1= "textex";
        String cadena2 = "";
        int num = cadena1.length()+10;
        //Resultado
        int expResult = 6;
        int result =  Cadenes.buscaCadena(cadena1, cadena2, num);
        assertEquals(expResult, result);
    }
    /**
     * @group Profe
     * Test of buscaParaula method, of class Cadenes.
     */
    @Test
    public void testBuscaParaula() {
        System.out.println("buscaParaula");
        String cadena1 = "";
        String cadena2 = "";
        int num = 0;
        int expResult = 0;
        int result = Cadenes.buscaParaula(cadena1, cadena2, num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

     /**
     * @group Mirokshi
     * Test of buscaParaula method, of class Cadenes.
     */
    @Test
    public void testBuscaParaulaParametersNull() {
        System.out.println("testBuscaParaulaParametersNull");
        System.out.println("Si los dos string son null = -1");
        String cadena1 = null;
        String cadena2 = null;
        int num = 0;
        //Result
        int expResult = -1;
        int result = Cadenes.buscaParaula(cadena1, cadena2, num);
        assertEquals(expResult, result);
    }
    
    /**
     * @group Mirokshi
     * Test of buscaParaula method, of class Cadenes.
     */
    @Test
    public void testBuscaParaulaOneParameterNull() {
        System.out.println("testBuscaParaulaOneParameterNull");
        System.out.println("Si un string es null = -1");
        String cadena1 = null;
        String cadena2 = "";
        int num = 0;
        //Result
        int expResult = -1;
        int result = Cadenes.buscaParaula(cadena1, cadena2, num);
        assertEquals(expResult, result);
    }

     /**
     * @group Mirokshi
     * Test of buscaParaula method, of class Cadenes.
     */
    @Test
    public void testBuscaParaulaNumberNeghative() {
        System.out.println("testBuscaParaulaNumberNeghative");
        System.out.println("Si el numero es negativo = 0");
        String cadena1 = null;
        String cadena2 = "";
        int num = 0;
        //Result
        int expResult = -1;
        int result = Cadenes.buscaParaula(cadena1, cadena2, num);
        assertEquals(expResult, result);
    }

    /**
     * @group Mirokshi
     * Test of buscaParaula method, of class Cadenes.
     */
    @Test
    public void testBuscaParaulaSecondParameterEmpty() {
        System.out.println("testBuscaParaulaSecondParameterEmpty");
        System.out.println("Si el segundo string es vacio retornará la longitud menor entre la primera cadena y "
                + "el numero");
        String cadena1 = "la lova lava la lana";
        String cadena2 = "";
        int num = 2;
        //Result
        int expResult = 2;
        int result = Cadenes.buscaParaula(cadena1, cadena2, num);
        assertEquals(expResult, result);
    }

    /**
     * @group Mirokshi
     * Test of buscaParaula method, of class Cadenes.
     */
    @Test
    public void testBuscaParaulaNumberHigher() {
        System.out.println("testBuscaParaulaNumberHigher");
        System.out.println("Si el numero es mayor que la longitud que el primer string  = -1");
        String cadena1 = "la lova lava la lana";
        String cadena2 = "la";
        //Result
        int expResult = -1;
        int result = Cadenes.buscaParaula(cadena1, cadena2, cadena1.length()+5);
        assertEquals(expResult, result);
    }
    
    /**
     * @group Mirokshi
     * Test of buscaParaula method, of class Cadenes.
     */
    @Test
    public void testBuscaParaulaOK() {
        System.out.println("testBuscaParaulaOK");
        System.out.println("Prueba correcta del metodo");
        String cadena1 = "la lova lava la lana";
        String cadena2 = "la";
        int num = 1;
        //Result
        int expResult = 13;
        int result = Cadenes.buscaParaula(cadena1, cadena2, num);
        assertEquals(expResult, result);
    }
    
    /**
     * @group Mirokshi
     * Test of buscaParaula method, of class Cadenes.
     */
    @Test(timeout=500)
    public void testBuscaParaulaWithTimeout() {
        System.out.println("testBuscaParaulaWithTimeout");
        System.out.println("Timeout =  500 ms");
        String cadena1 = "la lova lava la lana";
        String cadena2 = "la";
        int num = 1;
        //Result
        int expResult = 13;
        int result = Cadenes.buscaParaula(cadena1, cadena2, num);
        assertEquals(expResult, result);
    }
    
}
