/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author Dragon
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of calcAmmo method, of class InventoryControl.
     */
    @Test
    public void testCalcAmmo() {
        System.out.println("calcAmmo");
        
        /* Test case #1*/
        System.out.println("/tTest Case #1");
        int start = 10;
        int used = -4;
        int pickUp = 5;
        InventoryControl instance = new InventoryControl();
        int expResult = 11;
        int result = instance.calcAmmo(start, used, pickUp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /* Test case #2*/
        System.out.println("/tTest Case #2");
        start = -1;
        used = -4;
        pickUp = 5;
        
        expResult = -1;
        result = instance.calcAmmo(start, used, pickUp);
        assertEquals(expResult, result);
        
        /* Test case #3*/
        System.out.println("/tTest Case #3");
        start = 0;
        used = -4;
        pickUp = -1;
        
        expResult = -1;
        result = instance.calcAmmo(start, used, pickUp);
        assertEquals(expResult, result);
        
        /* Test case #4*/
        System.out.println("/tTest Case #4");
        start = 10;
        used = 4;
        pickUp = 0;
        
        expResult = -1;
        result = instance.calcAmmo(start, used, pickUp);
        assertEquals(expResult, result);
        
        /* Test case #5*/
        System.out.println("/tTest Case #5");
        start = 0;
        used = 0;
        pickUp = 0;
        
        expResult = 0;
        result = instance.calcAmmo(start, used, pickUp);
        assertEquals(expResult, result);
        
        /* Test case #6*/
        System.out.println("/tTest Case #6");
        start = 10;
        used = 0;
        pickUp = 10;
        
        expResult = 20;
        result = instance.calcAmmo(start, used, pickUp);
        assertEquals(expResult, result);
        
        /* Test case #7*/
        System.out.println("/tTest Case #7");
        start = 1;
        used = -1;
        pickUp = 1;
        
        expResult = 1;
        result = instance.calcAmmo(start, used, pickUp);
        assertEquals(expResult, result);
    }

    /**
     * Test of calcEnergyUsed method, of class InventoryControl.
     */
    @Test
    public void testCalcEnergyUsed() {
        System.out.println("calcEnergyUsed");
        
        System.out.println("/tTest Case #1");
        int start = 94;
        int used = 23;
        InventoryControl instance = new InventoryControl();
        int expResult = 71;
        int result = instance.calcEnergyUsed(start, used);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
        System.out.println("/tTest Case #2");
        start = 32;
        used = 40;
      
        expResult = 0;
        result = instance.calcEnergyUsed(start, used);
        assertEquals(expResult, result); 
        
        System.out.println("/tTest Case #3");
        start = 92;
        used = -14;
      
        expResult = -1;
        result = instance.calcEnergyUsed(start, used);
        assertEquals(expResult, result); 
        
        System.out.println("/tTest Case #4");
        start = -3;
        used = 5;
      
        expResult = -1;
        result = instance.calcEnergyUsed(start, used);
        assertEquals(expResult, result); 
        
        System.out.println("/tTest Case #5");
        start = 0;
        used = 0;
      
        expResult = 0;
        result = instance.calcEnergyUsed(start, used);
        assertEquals(expResult, result); 
        
        System.out.println("/tTest Case #6");
        start = 100;
        used = 0;
      
        expResult = 100;
        result = instance.calcEnergyUsed(start, used);
        assertEquals(expResult, result); 
        
        System.out.println("/tTest Case #7");
        start = 75;
        used = 74;
      
        expResult = 1;
        result = instance.calcEnergyUsed(start, used);
        assertEquals(expResult, result); 
    }
    
}
