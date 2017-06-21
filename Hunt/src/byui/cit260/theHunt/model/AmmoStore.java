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
public class AmmoStore implements Serializable{
    private int ammoPrices;
    private int ammoQuanity;
    private int playermoney;

    public AmmoStore() {
    }

    
    public int getAmmoPrices() {
        return ammoPrices;
    }

    public void setAmmoPrices(int ammoPrices) {
        this.ammoPrices = ammoPrices;
    }

    public int getAmmoQuanity() {
        return ammoQuanity;
    }

    public void setAmmoQuanity(int ammoQuanity) {
        this.ammoQuanity = ammoQuanity;
    }

    public int getPlayermoney() {
        return playermoney;
    }

    public void setPlayermoney(int playermoney) {
        this.playermoney = playermoney;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.ammoPrices;
        hash = 67 * hash + this.ammoQuanity;
        hash = 67 * hash + this.playermoney;
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
        final AmmoStore other = (AmmoStore) obj;
        if (this.ammoPrices != other.ammoPrices) {
            return false;
        }
        if (this.ammoQuanity != other.ammoQuanity) {
            return false;
        }
        if (this.playermoney != other.playermoney) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AmmoStore{" + "ammoPrices=" + ammoPrices + ", ammoQuanity=" + ammoQuanity + ", playermoney=" + playermoney + '}';
    }
    
    
    
}
