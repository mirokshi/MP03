/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodes;

import java.io.FileNotFoundException;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author mirokshi
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
     * Test of buscaCadena method, of class Cadenes.
     */
    @Test(priority = 2)
    public void testBuscaCadena() {
        System.out.println("buscaCadena");
        String cadena1 = "tres tristes tigres tragaban trigo en un trigal";
        String cadena2 = "tr";
        int num = 2;
        int expResult = 5;
        int result = Cadenes.buscaCadena(cadena1, cadena2, num);
        
        /**/
        assertThat(expResult,is(equalTo(result)));
        
    }
    
    /**
     * Test of buscaCadena method, of class Cadenes.
     */
    @Test(priority = 0)
    public void testBuscaCadenaNot() {
        System.out.println("buscaCadena");
        String cadena1 = "tres tristes tigres tragaban trigo en un trigal";
        String cadena2 = "tr";
        int num = 2;
        int expResult = 6;
        int result = Cadenes.buscaCadena(cadena1, cadena2, num);
        
        /**/
        assertThat(expResult,is(not(result)));
        
    }
    @Test(enabled=false)
    public void TestWithException()
    {  
        System.out.println("Soy ignorado :( ");
    }
    
    @Test(dependsOnMethods = { "testEnviroment" })
    public void testMostraMissatgeSanti(){
        System.out.println("mostraMissatgeSanti");
        String missatge="Hola";
        String expResult="Hola Santi";
        String result= Cadenes.mostraMissatgeSanti(missatge);
        
        assertThat(expResult,is(not(result)));
    }
    
    @Test
    public void testEnviroment(){
        System.out.println("This is enviroment");
    }
    
}
