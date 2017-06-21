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
public class AnimalMenuView extends View {

    
    public AnimalMenuView (){
        super ("\n"
                + "\n-------------------------------"
                + "\n   Animal Menu                   "
                + "\n-------------------------------"
                + "\n Choose what animal you want to"
                + "\n hunt."
                + "\nA - Alligator"
                + "\nD - Deer"
                + "\nR - Rabbit"
                + "\nP - Pheasant"
                + "\nQ - Quit"
                + "\n-------------------------------");
    }
    
    
@Override
   public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "A":
                System.out.println("\n You chose to hunt an alligator");
                this.MapView();
                break;
            case "D":
            System.out.println("\n You chose to hunt a deer");
            this.MapView();
            break;
            case "R":
                System.out.println("\n You chose to hunt a rabbit");
                this.MapView();
                break;
                
            case "P":
                System.out.println("\n You chose to hunt a pheasant");
                this.MapView();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }

    private void MapView() {
        System.out.println("\n MapView function called"); //This will become another view where player chooses the size of the map
    }
  
}
