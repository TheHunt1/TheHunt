/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.control;

/**
 *
 * @author Dragon
 */
public class HitOrMissControl {
    public int calcHitOrMiss (int chance, int weather, int jacket) {
        if (chance < 0 & chance > 100) {
		return -1; }
	if (weather > 0) {
            return -1;
        }
	if (jacket < 0 & jacket > 25) {
		return -1; 
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
return hitOrMiss;
    }
    
}

