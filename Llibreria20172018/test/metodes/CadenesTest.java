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
     * Test of mostraMissatgeSanti method, of class Cadenes.
     */
    @Test
    public void testMostraMissatgeSanti() {
        System.out.println("mostraMissatgeSanti");
        String missatge = "";
        Cadenes.mostraMissatgeSanti(missatge);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
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
     * Test of buscaParaulavDissenyModular method, of class Cadenes.
     */
    @Test
    public void testBuscaParaulavDissenyModular() {
        System.out.println("buscaParaulavDissenyModular");
        String text = "";
        String paraula = "";
        int posicio = 0;
        int expResult = 0;
        int result = Cadenes.buscaParaulavDissenyModular(text, paraula, posicio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
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
     * Test of buscaParaula20162017 method, of class Cadenes.
     */
    @Test
    public void testBuscaParaula20162017() {
        System.out.println("buscaParaula20162017");
        String text = "";
        String paraula = "";
        int posicio = 0;
        int expResult = 0;
        int result = Cadenes.buscaParaula20162017(text, paraula, posicio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of subcadena method, of class Cadenes.
     */
    @Test
    public void testSubcadena() {
        System.out.println("subcadena");
        String cadena = "";
        int primer = 0;
        int segon = 0;
        String expResult = "";
        String result = Cadenes.subcadena(cadena, primer, segon);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
