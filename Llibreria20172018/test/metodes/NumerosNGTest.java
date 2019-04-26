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
public class NumerosNGTest {
    
    public NumerosNGTest() {
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
     * Test of vectorDigits method, of class Numeros.
     */
    @Test
    public void testVectorDigits() {
        System.out.println("vectorDigits");
        int enter = 0;
        int[] expResult = new int[]{0};
        int[] result = Numeros.vectorDigits(enter);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of numVector method, of class Numeros.
     */
    @Test
    public void testNumVector() {
        System.out.println("numVector");
        int[] num = null;
        int expResult = 0;
        int result = Numeros.numVector(num);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of esPrimer method, of class Numeros.
     */
    @Test
    public void testEsPrimer() {
        System.out.println("esPrimer");
        int num = 0;
        boolean expResult = false;
        boolean result = Numeros.esPrimer(num);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of longitudNumero method, of class Numeros.
     */
    @Test
    public void testLongitudNumero() {
        System.out.println("longitudNumero");
        int numero = 0;
        int expResult = 1;
        int result = Numeros.longitudNumero(numero);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of revesNumerov1 method, of class Numeros.
     */
    @Test
    public void testRevesNumerov1() {
        System.out.println("revesNumerov1");
        int numero = 0;
        int expResult = 0;
        int result = Numeros.revesNumerov1(numero);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of revesNumerov2 method, of class Numeros.
     */
    @Test
    public void testRevesNumerov2() {
        System.out.println("revesNumerov2");
        int numero = 0;
        int expResult = 0;
        int result = Numeros.revesNumerov2(numero);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of descFact method, of class Numeros.
     */
    @Test
    public void testDescFact() {
        System.out.println("descFact");
           assertEquals(new int[]{0}, Numeros.descFact(0));
        assertEquals(new int[]{-1}, Numeros.descFact(-1));
        assertEquals(new int[]{1}, Numeros.descFact(1));
        assertEquals(new int[]{1,2,2,3,0,0,0,0,0,0,0,0}, Numeros.descFact(12));
        assertEquals(new int[]{-1,2,2,3,0,0,0,0,0,0,0,0}, Numeros.descFact(-12));
}
    
}
