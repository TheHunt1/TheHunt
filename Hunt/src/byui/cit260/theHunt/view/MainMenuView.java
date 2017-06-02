/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import byui.cit260.theHunt.control.GameControl;
import hunt.Hunt;

/**
 *
 * @author Dragon
 */
public class MainMenuView {
    private String menu;
    
    public MainMenuView (){
        this.menu= "\n"
                + "\n-------------------------------"
                + "\n   Main Menu                   "
                + "\n-------------------------------"
                + "\nN - Start new game"
                + "\nG - Get and start saved game"
                + "\nH - Get help on how to play"
                + "\nS - Save game"
                + "\nQ - Quit"
                + "\n-------------------------------";
    }
    void displayMainMenuView() {
        boolean done = false; //set flag to not done
       do {
           //prompt for and get player's name
           String menuOption = this.getmenuOption();
           if(menuOption.toUpperCase().equals("Q"))
               return;
           
           done = this.doAction(menuOption);
       }
       while (!done);
    }

    private String getmenuOption() {
        System.out.println("\n GetMenuOption called");
        return "N";
    }

    private boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "N":
                this.startNewGame();
                break;
            case "G":
            this.startExistingGame();
            break;
            case "H":
                this.displayHelpMenu();
                break;
            case "S":
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
    }

    private void startNewGame() {
       GameControl.createNewGame(Hunt.getPlayer());
       
       GameMenuView gameMenu = new GameMenuView();
       gameMenu.displayMenu();
    }

    private void startExistingGame() {
     System.out.println("\n startExistingGame called");   
    }

    private void displayHelpMenu() {
      System.out.println("\n displayHelpMenu called");  
    }

    private void saveGame() {
     System.out.println("\n saveGame called");   
    }
    
}
