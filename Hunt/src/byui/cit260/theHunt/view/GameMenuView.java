
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import byui.cit260.theHunt.model.Location;
import byui.cit260.theHunt.model.Map;
import java.util.Scanner;

/**
 *
 * @author Dragon
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
                + "\n-------------------------------"
                + "\n   Game Menu                   "
                + "\n-------------------------------"
                + "\nL - Select the loctaion"
                + "\nD - Display Player Info"
                + "\nM - View Map"
                + "\nH - Hunt Scene" //Tempory placement
                + "\nW - Weapon Store"
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
            case "M":
                this.displayMap();
                break;
            case "H":
                this.HuntScene();
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

    private void SelectLocation() {
        System.out.println("SelectLocation called");
        MoveView moveView = new MoveView();
        moveView.display();

    }

    private void PlayerInfo() {
        System.out.println("PlayerInfo function called");
    }

    public void displayMap() {
        Map map = hunt.Hunt.getCurrentGame().getMap();
        Location[][] locations = map.getLocations();
        System.out.println();
        for (int row = 0; row < locations.length; row++) {
            System.out.print(row + " "); // print row numbers to side of map
            for (int column = 0; column < locations.length; column++) {
                // set default indicators as blanks
                String leftIndicator = " ";
                String rightIndicator = " ";
                if (locations[row][column] == map.getCurrentLocation()) {
                    // Set star indicators to show this is the current location.
                    leftIndicator = "*";
                    rightIndicator = "*";
                } else if (locations[row][column].isVisited()) {
                    // Set < > indicators to show this location has been visited.
                    leftIndicator = ">"; // can be stars or whatever these are indicators showing visited
                    rightIndicator = "<"; // same as above
                }
                System.out.print("|"); // start map with a |
                if (locations[row][column].getScene() == null) {
                    // No scene assigned here so use ?? for the symbol
                    System.out.print(leftIndicator + "??" + rightIndicator);
                } else {
                    System.out.print(leftIndicator
                            + locations[row][column].getScene().getMapSymbol()
                            + rightIndicator);
                }
            }
            System.out.println("|");
        }
        System.out.println("You are currently at: " + map.getCurrentScene().getName());
        System.out.println(map.getCurrentScene().getDescription());
    }

    private void HuntScene() {
        HuntSceneView huntSceneView = new HuntSceneView();
        huntSceneView.display();
    }

    private void WeaponStore() {
        WeaponStoreMenuView weaponStoreMenuView = new WeaponStoreMenuView();
        weaponStoreMenuView.display();
    }

}
