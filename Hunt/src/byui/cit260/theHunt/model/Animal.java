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
 * @author MW
 */
public class Animal implements Serializable {
    
    private String name;
    private String type;
    private String description;
    private int points;
    private int difficulty;
    private int weight;
    private String ammoNeeded;

    public Animal() {
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getAmmoNeeded() {
        return ammoNeeded;
    }

    public void setAmmoNeeded(String ammoNeeded) {
        this.ammoNeeded = ammoNeeded;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.name);
        hash = 19 * hash + Objects.hashCode(this.type);
        hash = 19 * hash + Objects.hashCode(this.description);
        hash = 19 * hash + this.points;
        hash = 19 * hash + this.difficulty;
        hash = 19 * hash + this.weight;
        hash = 19 * hash + Objects.hashCode(this.ammoNeeded);
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
        final Animal other = (Animal) obj;
        if (this.points != other.points) {
            return false;
        }
        if (this.difficulty != other.difficulty) {
            return false;
        }
        if (this.weight != other.weight) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.ammoNeeded, other.ammoNeeded)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", type=" + type + ", description=" + description + ", points=" + points + ", difficulty=" + difficulty + ", weight=" + weight + ", ammoNeeded=" + ammoNeeded + '}';
    }
    
    
    
}
