/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import byui.cit260.theHunt.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author daniel.freitas
 */
public class QuitGameView extends View{
    
    public QuitGameView(){
       super( "-------------------------------\n"
                  + "         ***Quit Game***       \n"
                  + "-------------------------------\n"
                  + "Are you sure you want to quit the game?\nY - Yes\nN - No\n"
                  + "-------------------------------");
    }
   
    @Override
    public boolean doAction(String choice) {
       
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "Y":
                GameControl.quitGame();
            case "N":
            new MainMenuView().display();
            break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }
}
