/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.model;

import java.io.Serializable;
import java.util.ArrayList;
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
    
    public static ArrayList<Animal> listAnimals(){
        ArrayList<Animal> animals = new ArrayList<>();
        
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        Animal animal3 = new Animal();
        Animal animal4 = new Animal();
        
        animal1.setName("Alligator");
        animal1.setDifficulty(10);
        animal1.setWeight(350);
        animal1.setPoints(100);
        animal1.setType("Reptile");
        
        animals.add(animal1);
        
        animal2.setName("Deer");
        animal2.setDifficulty(15);
        animal2.setWeight(400);
        animal2.setPoints(150);
        animal2.setType("Herbivorous");
        
        animals.add(animal2);
        
        animal3.setName("Rabbit");
        animal3.setDifficulty(5);
        animal3.setWeight(40);
        animal3.setPoints(50);
        animal3.setType("mammal");
        
        animals.add(animal3);
        
        animal4.setName("Pheasant");
        animal4.setDifficulty(10);
        animal4.setWeight(60);
        animal4.setPoints(70);
        animal4.setType("Oviparous");
        
        animals.add(animal4);
        
        return animals;
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
