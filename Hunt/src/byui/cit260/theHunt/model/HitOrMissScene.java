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
public class HitOrMissScene implements Serializable{
    private String hitOrMiss;
    private String animal;
    private int points;

    public HitOrMissScene() {
    }

    
    public String getHitOrMiss() {
        return hitOrMiss;
    }

    public void setHitOrMiss(String hitOrMiss) {
        this.hitOrMiss = hitOrMiss;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.hitOrMiss);
        hash = 67 * hash + Objects.hashCode(this.animal);
        hash = 67 * hash + this.points;
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
        final HitOrMissScene other = (HitOrMissScene) obj;
        if (this.points != other.points) {
            return false;
        }
        if (!Objects.equals(this.hitOrMiss, other.hitOrMiss)) {
            return false;
        }
        if (!Objects.equals(this.animal, other.animal)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HitOrMissScene{" + "hitOrMiss=" + hitOrMiss + ", animal=" + animal + ", points=" + points + '}';
    }
    
    
    
}
