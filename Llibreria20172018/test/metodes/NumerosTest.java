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
public class NumerosTest {
    
    public NumerosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of vectorDigits method, of class Numeros.
     */
    @Ignore
    @Test
    public void testVectorDigits() {
        System.out.println("vectorDigits");
        int enter = 0;
        int[] expResult = null;
        int[] result = Numeros.vectorDigits(enter);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of numVector method, of class Numeros.
     */
    @Ignore
    @Test
    public void testNumVector() {
        System.out.println("numVector");
        int[] num = null;
        int expResult = 0;
        int result = Numeros.numVector(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esPrimer method, of class Numeros.
     */
    @Ignore
    @Test
    public void testEsPrimer() {
        System.out.println("esPrimer");
        int num = 0;
        boolean expResult = false;
        boolean result = Numeros.esPrimer(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of longitudNumero method, of class Numeros.
     */
    @Ignore
    @Test
    public void testLongitudNumero() {
        System.out.println("longitudNumero");
        int numero = 0;
        int expResult = 0;
        int result = Numeros.longitudNumero(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of revesNumerov1 method, of class Numeros.
     */
    @Ignore
    @Test
    public void testRevesNumerov1() {
        System.out.println("revesNumerov1");
        int numero = 0;
        int expResult = 0;
        int result = Numeros.revesNumerov1(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of revesNumerov2 method, of class Numeros.
     */
    @Ignore
    @Test
    public void testRevesNumerov2() {
        System.out.println("revesNumerov2");
        int numero = 0;
        int expResult = 0;
        int result = Numeros.revesNumerov2(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of descFact method, of class Numeros.
     */
    @Test
    public void testDescFact() {
        System.out.println("descFact");
        assertArrayEquals(new int[]{0}, Numeros.descFact(0));
        assertArrayEquals(new int[]{-1}, Numeros.descFact(-1));
        assertArrayEquals(new int[]{1}, Numeros.descFact(1));
        assertArrayEquals(new int[]{1,2,2,3,0,0,0,0,0,0,0,0}, Numeros.descFact(12));
        assertArrayEquals(new int[]{-1,2,2,3,0,0,0,0,0,0,0,0}, Numeros.descFact(-12));
    }
    
}
