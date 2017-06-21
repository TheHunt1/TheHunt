/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import java.util.Scanner;

/**
 *
 * @author Daniel Melo
 */
public class WeaponMenuView extends View{
    
    public WeaponMenuView (){
        super ("\n"
                + "\n-------------------------------"
                + "\n   Weapon Menu                   "
                + "\n-------------------------------"
                + "\n Choose your hunting weapon"
                + "\nS - Sniper"
                + "\nB - Bow and Arrow"
                + "\nR - Rifle"
                + "\nQ - Quit"
                + "\n-------------------------------");
    }
    
   
@Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "S":
                System.out.println("\n You are hunting with a Sniper");
                this.GameMenuView ();
                break;
            case "B":
                System.out.println("\n You are hunting with a bow and a arrow");
            this.GameMenuView ();
            break;
            case "R":
                System.out.println("\n You are hunting with a Rifle");
                this.GameMenuView ();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }

    private void GameMenuView() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }
}
