/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author MW
 */
public enum Actor implements Serializable {
    Predator ("This animal kills you"),
    Alligator ("Found in the swamps"),
    Deer ("Found everywhere"),
    Rabbit ("Easy animal to hunt"),
    Pheasant ("A bird");
    
    private final Point coordinates;
    private final String animal;

    Actor(String animal) {
        this.animal = animal;
        coordinates = new Point (1,1);
    }

    public Point getCoordinates (){
        return coordinates;
    }    

    public String getAnimal() {
        return animal;
    }
     
}
