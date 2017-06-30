/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.control;

import byui.cit260.theHunt.control.MapControl.SceneType;
import byui.cit260.theHunt.model.Game;
import byui.cit260.theHunt.model.Location;
import byui.cit260.theHunt.model.Map;
import byui.cit260.theHunt.model.Player;
import byui.cit260.theHunt.model.Scene;
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
        game.setInventoryList(inventoryList);
        
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

    public static void assignSceneToLocations(Map map, Scene[] scenes) {
        Location [] [] locations = map.getLocations();
        locations [0] [0].setScene(scenes[SceneType.bush.ordinal()]);
        locations [0] [1].setScene(scenes[SceneType.start.ordinal()]);
        locations [0] [2].setScene(scenes[SceneType.ammo.ordinal()]);
        locations [0] [3].setScene(scenes[SceneType.bush.ordinal()]);
        locations [0] [4].setScene(scenes[SceneType.bush.ordinal()]);
        locations [0] [5].setScene(scenes[SceneType.food.ordinal()]);
        locations [1] [0].setScene(scenes[SceneType.bush.ordinal()]);
        locations [1] [1].setScene(scenes[SceneType.bush.ordinal()]);
        locations [1] [2].setScene(scenes[SceneType.bush.ordinal()]);
        locations [1] [3].setScene(scenes[SceneType.food.ordinal()]);
        locations [1] [4].setScene(scenes[SceneType.bush.ordinal()]);
        locations [1] [5].setScene(scenes[SceneType.bush.ordinal()]);
        locations [2] [0].setScene(scenes[SceneType.animal.ordinal()]);
        locations [2] [1].setScene(scenes[SceneType.bush.ordinal()]);
        locations [2] [2].setScene(scenes[SceneType.bush.ordinal()]);
        locations [2] [3].setScene(scenes[SceneType.predator.ordinal()]);
        locations [2] [4].setScene(scenes[SceneType.bush.ordinal()]);
        locations [2] [5].setScene(scenes[SceneType.bush.ordinal()]);
        locations [3] [0].setScene(scenes[SceneType.bush.ordinal()]);
        locations [3] [1].setScene(scenes[SceneType.bush.ordinal()]);
        locations [3] [2].setScene(scenes[SceneType.predator.ordinal()]);
        locations [3] [3].setScene(scenes[SceneType.bush.ordinal()]);
        locations [3] [4].setScene(scenes[SceneType.bush.ordinal()]);
        locations [3] [5].setScene(scenes[SceneType.bush.ordinal()]);
        locations [4] [0].setScene(scenes[SceneType.bush.ordinal()]);
        locations [4] [1].setScene(scenes[SceneType.bush.ordinal()]);
        locations [4] [2].setScene(scenes[SceneType.predator.ordinal()]);
        locations [4] [3].setScene(scenes[SceneType.animal.ordinal()]);
        locations [4] [4].setScene(scenes[SceneType.bush.ordinal()]);
        locations [4] [5].setScene(scenes[SceneType.bush.ordinal()]);
        locations [5] [0].setScene(scenes[SceneType.bush.ordinal()]);
        locations [5] [1].setScene(scenes[SceneType.ammo.ordinal()]);
        locations [5] [2].setScene(scenes[SceneType.bush.ordinal()]);
        locations [5] [3].setScene(scenes[SceneType.bush.ordinal()]);
        locations [5] [4].setScene(scenes[SceneType.bush.ordinal()]);
        locations [5] [5].setScene(scenes[SceneType.finish.ordinal()]);
        
    }

    public static class InventoryItem {

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
