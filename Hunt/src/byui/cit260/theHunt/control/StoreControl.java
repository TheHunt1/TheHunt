/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.control;

import exceptions.StoreControlException;

/**
 *
 * @author MW
 */
public class StoreControl {
    
    public double purchaseAmmo(double cash, boolean available, double price) throws StoreControlException {
        if (cash < price) {
            throw new StoreControlException("Insuficient amount of money");
        } else if (cash == 0) {
            throw new StoreControlException("Insuficient amount of money");
        } else if (available == false) {
            throw new StoreControlException("Ammo not available");
        } else {
            cash = cash - price;
            return cash;
        }
    }
}
