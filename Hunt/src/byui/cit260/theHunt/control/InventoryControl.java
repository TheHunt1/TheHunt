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
   
   public int calcEnergyUsed(int start, int used) {
       if (start < 0) {
            return -1;
       }
       if (used < 0) {
            return -1;
       }
       
       int energyLevel = start - used;
       
       if (energyLevel < 0) {
            return 0;
       }
       if (energyLevel > 100) {
            return 100;
       }
               
    return energyLevel;
   }
	public double purchaseWeapon(double cash, boolean available, double price){
	   if(cash < price){
		   return -1;
	   }else if(cash == 0){
		   return -1;
	   }else if(available == false){
		   return -1;
	   }else{
		   cash = cash - price;
		   return cash;
	   }
    }
}

