/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodes;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author mirokshi
 */
public class NumerosNGTest {
    
    public NumerosNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
//        System.out.println("Start test class numeros");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
//        System.out.println("End test class numeros");
    }

    
    @BeforeMethod
    public void setUpMethod() throws Exception {
//        System.out.println("Start test method ");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
//        System.out.println("end test method");
    }



    /**
     * Test of esPrimer method, of class Numeros.
     */
    @Test(priority = 1)
    public void testEsPrimer() {
        System.out.println("esPrimer");
        int num = 12;
        boolean expResult = false;
        boolean result = Numeros.esPrimer(num);
         assertThat(expResult,is(equalTo(result)));        
    }

    /**
     * Test of longitudNumero method, of class Numeros.
     */
    @Test(priority = 0)
    public void testLongitudNumero() {
        System.out.println("longitudNumero");
        int numero = 486468486;
        int expResult = 9;
        int result = Numeros.longitudNumero(numero);
         assertThat(expResult,is(equalTo(result)));
    }

    
    @Test(groups={"grupo1"})
    public void testRevesNumerov1() {
        System.out.println("revesNumerov1");
        int numero = 151;
        int expResult = 151;
        int result = Numeros.revesNumerov1(numero);
         assertThat(expResult,is(equalTo(result)));

    }    
    @Test(groups={"grupo1"})
    public void testMcdRecursiu(){
        System.out.println("mcdRecursiu");
        int a =23;
        int b =13;
        int expResult = 1;
        int result = Numeros.mcdRecursiu(a, b);
         assertThat(expResult,is(equalTo(result)));
    }
    
    /**
     *
     */
    @Test(timeOut = 10)  
    @SuppressWarnings("empty-statement")
    public void method1()
    {  
        for (int i = 0; i < 9999; i++) {
            
        }
    }
    
    @Test(expectedExceptions = ArithmeticException.class)  
    public void divideByZero()
    {  
        int i = 1/0;
    }	
    
    

}
