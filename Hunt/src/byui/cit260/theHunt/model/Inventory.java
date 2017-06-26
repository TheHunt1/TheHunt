/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Dragon
 */
public class Inventory implements Serializable{
   private String food; 
   private String gear;
   private int ammo;
   private String ammoStore;

    public Inventory() {
    }

   
    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public String getAmmoStore() {
        return ammoStore;
    }

    public void setAmmoStore(String ammoStore) {
        this.ammoStore = ammoStore;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.food);
        hash = 59 * hash + Objects.hashCode(this.gear);
        hash = 59 * hash + this.ammo;
        hash = 59 * hash + Objects.hashCode(this.ammoStore);
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
        final Inventory other = (Inventory) obj;
        if (this.ammo != other.ammo) {
            return false;
        }
        if (!Objects.equals(this.food, other.food)) {
            return false;
        }
        if (!Objects.equals(this.gear, other.gear)) {
            return false;
        }
        if (!Objects.equals(this.ammoStore, other.ammoStore)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventory{" + "food=" + food + ", gear=" + gear + ", ammo=" + ammo + ", ammoStore=" + ammoStore + '}';
    }
   
    
   
}
