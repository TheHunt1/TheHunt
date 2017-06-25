/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.control;

import byui.cit260.theHunt.model.Game;
import byui.cit260.theHunt.model.Inventory;
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
        
        game.setPlayer(player);
        
        Inventory[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.moveActorsToStartingLocation(map);
        
    }
     
    public static void quitGame(){
        System.out.println("We hope to see you soon!");
        System.exit(0);
    }

    public static Inventory[] createInventoryList() {
        System.out.println("*** Called createInventoryList() in GameControl ***");
        return null;
    }
}
