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
public class InventoryControl {
   public int calcAmmo (int start, int used, int pickUp) {
       if (start < 0) { //is start negative
		return -1;
         }
	if (used > 0) { // is used positive
		return -1; 
        }
	if (pickUp < 0) { // is pickUp negative
            return -1; 
        } 
        
        int available = start + used + pickUp;
        
        if (available < 0) { //available cannot be negative
            return 0;
        }
    return available;

   }
}
