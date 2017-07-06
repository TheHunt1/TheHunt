/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.control;

import byui.cit260.theHunt.model.SceneType;
import byui.cit260.theHunt.model.Game;
import byui.cit260.theHunt.model.Inventory;
import byui.cit260.theHunt.model.Location;
import byui.cit260.theHunt.model.Map;
import byui.cit260.theHunt.model.Player;
import byui.cit260.theHunt.model.Scene;
import exceptions.MapControlException;
import hunt.Hunt;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        
        game.setPlayer(player);
        
        Inventory[] inventoryList = GameControl.createInventoryList ();
        game.setInventory(inventoryList);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        try {
            MapControl.movePlayerToStartingLocation(map);
        } catch (MapControlException ex) {
            Logger.getLogger(GameControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    public static void quitGame(){
        System.out.println("We hope to see you soon!");
        System.exit(0);
    }

    public static Inventory[] createInventoryList (){
        Inventory[] inventory = new Inventory[12];
        
        Inventory ammo = new Inventory ();
        ammo.setDescription("Ammo");
        ammo.setQuantityInStock(5);
        inventory[0] = ammo;
        
        Inventory  weapon= new Inventory ();
        weapon.setDescription("Weapon");
        weapon.setQuantityInStock(0);
        inventory[1] = weapon;
        
        Inventory food = new Inventory ();
        food.setDescription("Food");
        food.setQuantityInStock(0);
        inventory[2] = food;
        
        Inventory jacket = new Inventory ();
        jacket.setDescription("Jacket");
        jacket.setQuantityInStock(0);
        inventory[3] = jacket;
        
        
        return inventory;
       
    }

    public static void assignSceneToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        locations[0][0].setScene(scenes[SceneType.crystallake.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.blackriver.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.wetlands.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.watershed.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.whitewaterbend.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.rapidfalls.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.morningwetland.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.thousandstreams.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.poopfalls.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.whiteridge.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.burntforest.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.blackwoods.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.yellowvalley.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.treeline.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.skyrim.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.triplepeaks.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.windygap.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.coppercanyon.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.cloudpeak.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.agnewmeadow.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.madronamarsh.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.chantryflats.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.highdesert.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.grasslands.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.petrifiedforest.ordinal()]);
         
    }
    
}
