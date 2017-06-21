/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import java.util.Scanner;

/**
 *
 * @author MW
 */
public class WeaponStoreMenuView extends View {
    
    public WeaponStoreMenuView () {
        super ("\n"
                + "\n---------------------------------"
                + "\n      Weapons Store              "
                + "\n---------------------------------"
                + "\nW - Weapons list (including cost)"
                + "\nP - Purchase weapon"
                + "\nB - Back");   
    }
    
    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "W":
                System.out.println("\n*** Display list of available weapons"
                + "\nincluding the price. ***");
                break;
            case "P":
                System.out.println("\n*** Use the money you earned from your kills "
                + "\nto purchase a weapons. Here you will select and purchase "
                + "\nweapons. ***");
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
    
}
