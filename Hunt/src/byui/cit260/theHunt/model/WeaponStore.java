/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.model;

import java.io.Serializable;

/**
 *
 * @author Dragon
 */
public class WeaponStore implements Serializable{
    private int weaponPrice;
    private int playerMoney;

    public WeaponStore() {
    }

    public int getWeaponPrice() {
        return weaponPrice;
    }

    public void setWeaponPrice(int weaponPrice) {
        this.weaponPrice = weaponPrice;
    }

    public int getPlayerMoney() {
        return playerMoney;
    }

    public void setPlayerMoney(int playerMoney) {
        this.playerMoney = playerMoney;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.weaponPrice;
        hash = 47 * hash + this.playerMoney;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final WeaponStore other = (WeaponStore) obj;
        if (this.weaponPrice != other.weaponPrice) {
            return false;
        }
        if (this.playerMoney != other.playerMoney) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "WeaponStore{" + "weaponPrices=" + weaponPrice + ", playerMoney=" + playerMoney + '}';
    }
    
    
    
}
