
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import byui.cit260.theHunt.control.GameControl;
import hunt.Hunt;
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
                + "\nN - Start new game"
                + "\nL - Select the loctaion"
                + "\nD - Display Player Info"
                + "\nH - Hunt Scene" //Tempory placement
                + "\nW - Weapon Store"
                + "\nQ - Quit"
                + "\n-------------------------------");
    }
    
   
@Override
   public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "N":
                this.startNewGame();
                break;
            case "L":
                this.SelectLocation();
                break;
            case "D":
            this.PlayerInfo();
            break;
            case "H":
                this.HuntScene ();
                break;
            case "W":
                this.WeaponStore();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }
    
    
    private void startNewGame() {
       GameControl.createNewGame(Hunt.getPlayer());
    }

    private void SelectLocation() {
        System.out.println("SelectLocation called");
        LocationMenuView locationMenuView = new LocationMenuView();
        locationMenuView.display();
       
    }

    private void PlayerInfo() {
        System.out.println("PlayerInfo function called");
    }

    private void HuntScene() {
        HuntSceneView huntSceneView = new HuntSceneView ();
        huntSceneView.display();
    }
    private void WeaponStore() {
        WeaponStoreMenuView weaponStoreMenuView = new WeaponStoreMenuView ();
        weaponStoreMenuView.display();
    }
    
}


