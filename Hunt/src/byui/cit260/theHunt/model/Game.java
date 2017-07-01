/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.model;

import byui.cit260.theHunt.control.GameControl;
import byui.cit260.theHunt.model.Game.locations;
import java.io.Serializable;
import java.util.Objects;
import byui.cit260.theHunt.model.Map;

/**
 *
 * @author MW
 */
public class Game implements Serializable {

    public static void setPlayer(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Player player;
    private String mapSelect;
    private String addPlayer;
    private Map map; 

private Inventory[] inventory;
private Actor[] actor;
    private Object[] locations;

    public String getMapSelect() {
        return mapSelect;
    }

    public String getAddPlayer() {
        return addPlayer;
    }

    public void setAddPlayer(String addPlayer) {
        this.addPlayer = addPlayer;
    }

    public Game() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.mapSelect);
        hash = 47 * hash + Objects.hashCode(this.addPlayer);
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.mapSelect, other.mapSelect)) {
            return false;
        }
        if (!Objects.equals(this.addPlayer, other.addPlayer)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "mapSelect=" + mapSelect + ", addPlayer=" + addPlayer + '}';
    }

    public void setMap(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setInventoryList(GameControl.InventoryItem[] inventoryList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Map getMap() {
        System.out.println();
    for( int row = 0; row < locations.length; row++){
     System.out.print(row + " "); // print row numbers to side of map
      for( int column = 0; column < locations.length; column++){
         // set default indicators as blanks
         String leftIndicator = " ";
         String rightIndicator = " ";
        if(locations[row][column] == map.getCurrentLocation()){
          // Set star indicators to show this is the current location.
          leftIndicator = "*"; 
          rightIndicator = "*"; 
        } 
        else if(locations[row][column].isVisited()){
           // Set < > indicators to show this location has been visited.
           leftIndicator = ">"; // can be stars or whatever these are indicators showing visited
           rightIndicator = "<"; // same as above
        }
       System.out.print("|"); // start map with a |
        if(locations[row][column].getScene() == null)
        {
             // No scene assigned here so use ?? for the symbol
             System.out.print(leftIndicator + "??" + rightIndicator);
        }
        else
          System.out.print(leftIndicator
             + locations[row][column].getScene().getMapSymbol()
             + rightIndicator);
      }
     System.out.println("|");
    }
    }

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

    public static class locations {

        private static int length;

        public locations() {
        }
    }
    
}
