/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fonction;

import org.json.JSONArray;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author itu
 */
public class ListeTest {
    
    public ListeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of listeDoc method, of class Liste.
     */
   /* @Test
    public void testListeDoc() {
        System.out.println("listeDoc");
        String nom = "NOMDOC";
        String rech = "RAVO";
        JSONArray expResult = {"2":"RAVO"};
        JSONArray result = Liste.listeDoc(nom, rech);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of nom method, of class Liste.
     */
    @Test
    public void testNom() {
        System.out.println("nom");
        String id = "2";
        Liste instance = new Liste();
        String expResult = "RAVO";
        String result = instance.nom(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of contact method, of class Liste.
     */
    @Test
    public void testContact() {
        System.out.println("contact");
        String id = "2";
        Liste instance = new Liste();
        String expResult = "0331234567";
        String result = instance.contact(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
