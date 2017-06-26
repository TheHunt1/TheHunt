/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hunt;
import byui.cit260.theHunt.model.Actor;
import byui.cit260.theHunt.model.AmmoStore;
import byui.cit260.theHunt.model.Animal;
import byui.cit260.theHunt.model.Game;
import byui.cit260.theHunt.model.HitOrMissScene;
import byui.cit260.theHunt.model.HuntScene;
import byui.cit260.theHunt.model.Inventory;
import byui.cit260.theHunt.model.Location;
import byui.cit260.theHunt.model.Map;
import byui.cit260.theHunt.model.Player;
import byui.cit260.theHunt.model.PlayerStatus;
import byui.cit260.theHunt.model.WeaponStore;
import byui.cit260.theHunt.view.StartProgramView;
/**
 *
 * @author Dragon
 */
public class Hunt {

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Hunt.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Hunt.player = player;
    }
private static Game currentGame = null;
private static Player player = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       StartProgramView startProgramView = new StartProgramView ();
       startProgramView.displayStartProgramView();
       
        
        
        
    }
    
}
