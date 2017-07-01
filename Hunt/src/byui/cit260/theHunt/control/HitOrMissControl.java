/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.control;

import exceptions.HitControlException;

/**
 *
 * @author Dragon
 */
public class HitOrMissControl {
    public int calcHitOrMiss (int chance, int weather, int jacket) throws HitControlException {
        if (chance < 0 & chance > 100) {
		throw new HitControlException ("Chance has to be between 0 and 100"); }
	if (weather > 0) {
            throw new HitControlException ("Weather can't be greater than 0"); 
        }
	if (jacket < 0 & jacket > 25) {
		throw new HitControlException ("Jacket should be between 0 and 25"); 
                        }

int hitOrMiss = chance + weather + jacket;

if (hitOrMiss > 0 &  hitOrMiss < 70) {
    System.out.println("Miss");
	return 0;
}
if (hitOrMiss >71) {
    System.out.println("Hit");
	return 1;
}
if (hitOrMiss < 0){
    throw new HitControlException ("hitOrMiss has to be above 0"); 
}
return hitOrMiss;
    }
    
}

