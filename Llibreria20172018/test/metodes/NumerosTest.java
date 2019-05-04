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
     * @group  profe
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
     * @group  mirokshi
     * Test of esPrimer method, of class Numeros.
     */
    
    @Test
    public void testEsPrimerNumberIcorrect() {
        System.out.println("testEsPrimerNumberIcorrect");
        System.out.println("Si el numero es igual a 1 o menor = false");
        int num = 1;
        int num2 =-2;
        boolean result = Numeros.esPrimer(num);
      
        assertFalse(result);
        assertFalse(Numeros.esPrimer(num2));
        
    }

    /**
     * @group  mirokshi
     * Test of esPrimer method, of class Numeros.
     */
    
    @Test
    public void testEsPrimerNumberCorrect() {
        System.out.println("testEsPrimerReturnFalseBecauseNumberIcorect");
        System.out.println("Prueba correcta del metodo");
        int num = 3;
        int num2 =11;
        boolean result = Numeros.esPrimer(num);
      
        assertTrue(result);
        assertTrue(Numeros.esPrimer(num2));
        assertTrue(Numeros.esPrimer(7));
        
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

    /**
     * Test of numeroCapicua method, of class Numeros
     */
    @Test
    public void testNumeroCapicua(){
        System.out.println("testNumeroCapicua");
        int num= 232;
        int num2 = 1234;
        
        assertTrue(Numeros.numeroCapicua(num));
        assertFalse(Numeros.numeroCapicua(num2));
        
    }
    
    /**
     * Test of numeroCapicua method, of class Numeros
     */
    @Test(expected=RuntimeException.class)
    public void testNumeroCapicuaException(){
        System.out.println("testNumeroCapicua");
        double num= 232;
        int num2 = 1234;
        
        assertTrue(Numeros.numeroCapicua(num));
        assertFalse(Numeros.numeroCapicua(num2));
        
    }
}
