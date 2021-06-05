/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f3andrewnauzetbeltranperez;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrew
 */
public class ContactoTest {

//    public ContactoTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    @Test
//    public void testGetNombre() {
//    }
//
//    @Test
//    public void testGetNumero() {
//    }
    @Test
    public void testCompareTo() {
        Contacto contacto1 = new Contacto("Andrew", "626");
        Contacto contacto2 = new Contacto("Andrew", "626");
        assertEquals(0, contacto2.compareTo(contacto1));
    }

}
