/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.control;

import exceptions.InventoryControlException;

/**
 *
 * @author Dragon
 */
public class InventoryControl {

    public int calcAmmo(int start, int used, int pickUp) throws InventoryControlException {

        if (start < 0) { //is start negative
            throw new InventoryControlException("Start is negative");
        }

        if (used > 0) { // is used positive
            throw new InventoryControlException("Used is positive");
        }
        if (pickUp < 0) { // is pickUp negative
            throw new InventoryControlException("Pickup cannot be negative");
        }

        int available = start + used + pickUp;

        if (available < 0) { //available cannot be negative
            throw new InventoryControlException("Available cannot be negative");
        }
        return available;

    }

    public int calcEnergyUsed(int start, int used) throws InventoryControlException {
        if (start < 0) {
            throw new InventoryControlException("Start cannot be negative");
        }
        if (used < 0) {
            throw new InventoryControlException("Used cannot be negative");
        }

        int energyLevel = start - used;

        if (energyLevel < 0) {
            throw new InventoryControlException("Energy level cannot be negative");
        }
        if (energyLevel > 100) {
            throw new InventoryControlException("Energy level cannot be more than 100");
        }

        return energyLevel;
    }

    public double purchaseWeapon(double cash, boolean available, double price) throws InventoryControlException {
        if (cash < price) {
            throw new InventoryControlException("Insuficient amount of money");
        } else if (cash == 0) {
            throw new InventoryControlException("Insuficient amount of money");
        } else if (available == false) {
            throw new InventoryControlException("Weapon not available");
        } else {
            cash = cash - price;
            return cash;
        }
    }
}
