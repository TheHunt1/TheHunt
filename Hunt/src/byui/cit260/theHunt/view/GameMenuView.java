
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import java.util.Scanner;

/**
 *
 * @author Dragon
 */
public class GameMenuView extends View{
    
    public GameMenuView (){
        super ("\n"
                + "\n-------------------------------"
                + "\n   Game Menu                   "
                + "\n-------------------------------"
                + "\nL - Select the loctaion"
                + "\nD - Display Player Info"
                + "\nQ - Quit"
                + "\n-------------------------------");
    }
    
   
@Override
   public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "L":
                this.SelectLocation();
                break;
            case "D":
            this.PlayerInfo();
            break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }
    
    

    private void SelectLocation() {
        System.out.println("SelectLocation called");
        LocationMenuView locationMenuView = new LocationMenuView();
        locationMenuView.display();
       
    }

    private void PlayerInfo() {
        System.out.println("PlayerInfo function called");
    }
    
}


