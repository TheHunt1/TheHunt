/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dragon
 */
public class HitOrMissControlTest {
    
    public HitOrMissControlTest() {
    }

    /**
     * Test of calcHitOrMiss method, of class HitOrMissControl.
     */
    @Test
    public void testCalcHitOrMiss() {
        System.out.println("calcHitOrMiss");
        /* Test case #1*/
        System.out.println("/tTest Case #1");
        int chance = 80;
        int weather = -4;
        int jacket = 14;
        HitOrMissControl instance = new HitOrMissControl();
        int expResult = 1;
        int result = instance.calcHitOrMiss(chance, weather, jacket);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /* Test case #2*/
        System.out.println("/tTest Case #2");
        chance = -1;
        weather = -4;
        jacket = 5;
       
        expResult = 0;
        result = instance.calcHitOrMiss(chance, weather, jacket);
        assertEquals(expResult, result);
        
        /* Test case #3*/
        System.out.println("/tTest Case #3");
        chance = 0;
        weather = -4;
        jacket = 26;
       
        expResult = 0;
        result = instance.calcHitOrMiss(chance, weather, jacket);
        assertEquals(expResult, result);
        
        /* Test case #4*/
        System.out.println("/tTest Case #4");
        chance = 105;
        weather = 100;
        jacket = 25;
       
        expResult = -1;
        result = instance.calcHitOrMiss(chance, weather, jacket);
        assertEquals(expResult, result);
        
        /* Test case #5*/
        System.out.println("/tTest Case #5");
        chance = 0;
        weather = 0;
        jacket = 0;
       
        expResult = 0;
        result = instance.calcHitOrMiss(chance, weather, jacket);
        assertEquals(expResult, result);
        
        /* Test case #6*/
        System.out.println("/tTest Case #6");
        chance = 100;
        weather = -100;
        jacket = 25;
       
        expResult = 0;
        result = instance.calcHitOrMiss(chance, weather, jacket);
        assertEquals(expResult, result);
        
        /* Test case #7*/
        System.out.println("/tTest Case #7");
        chance = 1;
        weather = -1;
        jacket = 1;
       
        expResult = 0;
        result = instance.calcHitOrMiss(chance, weather, jacket);
        assertEquals(expResult, result);
    }
    
}
