/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.model;

import byui.cit260.theHunt.control.GameControl;
import byui.cit260.theHunt.model.Location;
import java.io.Serializable;
import java.util.Objects;
import byui.cit260.theHunt.model.Map;

/**
 *
 * @author MW
 */
public class Game implements Serializable {

  
    private Player player;
    private String mapSelect;
    //private String addPlayer;
    private Map map; 

    private Inventory[] inventory;
    private Actor[] actor;
    //private Location[][] locations;

    
    
    public Game() {
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getMapSelect() {
        return mapSelect;
    }

    public void setMapSelect(String mapSelect) {
        this.mapSelect = mapSelect;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

//    public Location[][] getLocations() {
//        return locations;
//    }
//
//    public void setLocations(Location[][] locations) {
//        this.locations = locations;
//    }
    

    public Inventory[] getInventory() {
        return inventory;
    }

    public void setInventory(Inventory[] inventory) {
        this.inventory = inventory;
    }  

    public Actor[] getActor() {
        return actor;
    }

    public void setActor(Actor[] actor) {
        this.actor = actor;
    }
    
}
