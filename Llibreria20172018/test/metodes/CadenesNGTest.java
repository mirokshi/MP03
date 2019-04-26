/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodes;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author profe
 */
public class CadenesNGTest {
    
    public CadenesNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
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
        assertEquals(result, expResult);
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
        assertEquals(result, expResult);
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
        assertEquals(result, expResult);
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
        assertEquals(result, expResult);
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
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
