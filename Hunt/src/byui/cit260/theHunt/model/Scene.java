/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.model;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Dragon
 */
public class Scene {

   private String name;
   private String mapSymbol;
   private String description;
   private ArrayList<Inventory> inventoryList;
   private Animal animal;

    public Scene(String name, String mapSymbol, String description, ArrayList<Inventory> inventoryList, Animal animal) {
        this.name = name;
        this.mapSymbol = mapSymbol;
        this.description = description;
        this.inventoryList = inventoryList;
        this.animal = animal;
    }

    public Scene() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Inventory> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(ArrayList<Inventory> inventoryList) {
        this.inventoryList = inventoryList;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + Objects.hashCode(this.mapSymbol);
        hash = 53 * hash + Objects.hashCode(this.description);
        hash = 53 * hash + Objects.hashCode(this.inventoryList);
        hash = 53 * hash + Objects.hashCode(this.animal);
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.mapSymbol, other.mapSymbol)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.inventoryList, other.inventoryList)) {
            return false;
        }
        if (!Objects.equals(this.animal, other.animal)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "name=" + name + ", mapSymbol=" + mapSymbol + ", description=" + description + '}';
    }

    public void setAnimal(Actor actor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   
}
