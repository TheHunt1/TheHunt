/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.control;

import byui.cit260.theHunt.model.Game;
import byui.cit260.theHunt.model.Map;
import byui.cit260.theHunt.model.Player;
import hunt.Hunt;
import java.util.Scanner;

/**
 *
 * @author MW
 */
public class GameControl {

    public static Player createPlayer(String name) {
        if (name== null){
            return null;
        }
        Player player = new Player();
        player.setName(name);
        
        Hunt.setPlayer(player);
        return player;
    }

    public static void createNewGame(Player player) {
        Game game = new Game(); 
        Hunt.setCurrentGame(game);
        
        Game.setPlayer(player);
        
        InventoryItem[] inventoryList = GameControl.createInventoryList ();
        game.setInventory(inventoryList);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        MapControl.moveActorsToStartingLocation(map);
    }
     
    public static void quitGame(){
        System.out.println("We hope to see you soon!");
        System.exit(0);
    }

    public static InventoryItem [] createInventoryList (){
        InventoryItem [] inventory = new InventoryItem [12];
        
        InventoryItem ammo = new InventoryItem ();
        ammo.setDescription("Ammo");
        ammo.setQuantityInStock(5);
        inventory[0] = ammo;
        
        InventoryItem  weapon= new InventoryItem ();
        weapon.setDescription("Weapon");
        weapon.setQuantityInStock(0);
        inventory[1] = weapon;
        
        InventoryItem food = new InventoryItem ();
        food.setDescription("Food");
        food.setQuantityInStock(0);
        inventory[2] = food;
        
        InventoryItem jacket = new InventoryItem ();
        jacket.setDescription("Jacket");
        jacket.setQuantityInStock(0);
        inventory[3] = jacket;
        
        
        return inventory;
       
    }

    private static class InventoryItem {

        public InventoryItem() {
        }

        private void setDescription(String ammo) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setQuantityInStock(int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
