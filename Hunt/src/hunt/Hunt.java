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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
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

private static PrintWriter outFile = null;
private static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        Hunt.logFile = logFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        Hunt.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        Hunt.inFile = inFile;
    }
private static BufferedReader inFile = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       StartProgramView startProgramView = new StartProgramView ();
       startProgramView.displayStartProgramView();
       
        try {
            Hunt.inFile = new BufferedReader(new InputStreamReader (System.in));
            Hunt.outFile = new PrintWriter(System.out, true);
            
            String filePath ="log.txt";
            Hunt.logFile = new PrintWriter (filePath);
            startProgramView.displayStartProgramView();
            
        }
        catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.displayStartProgramView();
        }
        finally {
           try {
               if(Hunt.inFile != null) 
                 Hunt.inFile.close(); 
               
               if(Hunt.outFile != null) 
                  Hunt.outFile.close(); 
               
               if(Hunt.logFile != null) 
                  Hunt.logFile.close(); 
               
               
           } catch (IOException ex) {
               System.out.println("Error Closing files");
               return;
           }
            
        }
        
        
    }
    
}
