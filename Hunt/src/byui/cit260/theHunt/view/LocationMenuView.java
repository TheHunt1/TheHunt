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
public class LocationMenuView extends View{
    
    public LocationMenuView (){
        super ("\n"
                + "\n-------------------------------"
                + "\n   Location Menu                   "
                + "\n-------------------------------"
                + "\n Choose your hunting terrain"
                + "\nR - The Rockies"
                + "\nF - Florida Swamps"
                + "\nW - Western Plains"
                + "\nJ - Jungle"
                + "\nQ - Quit"
                + "\n-------------------------------");
    }
    
   
@Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        switch (value) {
            case "R":
                System.out.println("\n You are hunting in the Rockies");
                this.AnimalMenuView ();
                break;
            case "F":
                System.out.println("\n You are hunting in the Florida Swamps");
            this.AnimalMenuView ();
            break;
            case "W":
                System.out.println("\n You are hunting in the Western Plains");
                this.AnimalMenuView ();
                break;
            case "J":
                System.out.println("\n You are hunting in the jungle");
                this.AnimalMenuView ();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }

    private void AnimalMenuView() {
        AnimalMenuView animalMenuView = new AnimalMenuView();
        animalMenuView.display();
    }
    
}
