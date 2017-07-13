
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
                + "\nE - End Game"
                + "\nQ - Back to Main Menu"
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
            case "E":
                this.QuitGame();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }

    private void SelectLocation() {
        this.console.println("SelectLocation called");
        MoveView moveView = new MoveView();
        moveView.display();

    }

    private void PlayerInfo() {
        this.console.println("PlayerInfo function called");
    }

    public void displayMap() {
        Map map = hunt.Hunt.getCurrentGame().getMap();
        Location[][] locations = map.getLocations();
        this.console.println();
        for (int row = 0; row < locations.length; row++) {
            this.console.print(row + " "); // print row numbers to side of map
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
                this.console.print("|"); // start map with a |
                if (locations[row][column].getScene() == null) {
                    // No scene assigned here so use ?? for the symbol
                    this.console.print(leftIndicator + "??" + rightIndicator);
                } else {
                    this.console.print(leftIndicator
                            + locations[row][column].getScene().getMapSymbol()
                            + rightIndicator);
                }
            }
            this.console.println("|");
        }
        this.console.println("You are currently at: " + map.getCurrentScene().getName());
        this.console.println(map.getCurrentScene().getDescription());
    }

    private void HuntScene() {
        HuntSceneView huntSceneView = new HuntSceneView();
        huntSceneView.display();
    }

    private void WeaponStore() {
        WeaponStoreMenuView weaponStoreMenuView = new WeaponStoreMenuView();
        weaponStoreMenuView.display();
    }

    private void QuitGame() {
        QuitGameView quitGameView = new QuitGameView();
        quitGameView.display();
    }

}
