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
public class HuntScene implements Serializable{
    private String animals;
    private String animalName;
    private String sceneType;
    private String description;
    private int animalPoints;

    public HuntScene() {
    }

    
    public String getAnimals() {
        return animals;
    }

    public void setAnimals(String animals) {
        this.animals = animals;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getSceneType() {
        return sceneType;
    }

    public void setSceneType(String sceneType) {
        this.sceneType = sceneType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAnimalPoints() {
        return animalPoints;
    }

    public void setAnimalPoints(int animalPoints) {
        this.animalPoints = animalPoints;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.animals);
        hash = 23 * hash + Objects.hashCode(this.animalName);
        hash = 23 * hash + Objects.hashCode(this.sceneType);
        hash = 23 * hash + Objects.hashCode(this.description);
        hash = 23 * hash + this.animalPoints;
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
        final HuntScene other = (HuntScene) obj;
        if (this.animalPoints != other.animalPoints) {
            return false;
        }
        if (!Objects.equals(this.animals, other.animals)) {
            return false;
        }
        if (!Objects.equals(this.animalName, other.animalName)) {
            return false;
        }
        if (!Objects.equals(this.sceneType, other.sceneType)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HuntScene{" + "animals=" + animals + ", animalName=" + animalName + ", sceneType=" + sceneType + ", description=" + description + ", animalPoints=" + animalPoints + '}';
    }
    
    
    
}
