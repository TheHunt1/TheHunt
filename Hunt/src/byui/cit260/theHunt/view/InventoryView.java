/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import byui.cit260.theHunt.model.Game;
import byui.cit260.theHunt.model.Location;
import byui.cit260.theHunt.model.Map;
import hunt.Hunt;

/**
 *
 * @author Dragon
 */
public class InventoryView extends View{
    public InventoryView (){
        //Enter code here
    }
    
    @Override
   public boolean doAction(String choice){
   choice = choice.toUpperCase();
   char choice = choice.charAt(0);
   
   switch (choice) {
       case 'V':
           this.displayMap();
           break;
       case 'I':
       this.viewInventory();
       break;
       default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
       
       
   }
       
   return true;
   }
   
   private void viewInventory (){
       StringBuilder line;
       
       Game game = Hunt.getCurrentGame();
       InventoryItem[] inventory = game.getInventory();
       
       
       System.out.println("\n           LIST OF INVENTORY");
       line= new StringBuilder("                                  ");
       line.insert(0, "DESCRIPTION");
       line.insert(20, "IN STOCK");
       System.out.println(line.toString());
       
       for (InventoryItem item: inventory) {
           line = new StringBuilder ("                                ");
           line.insert(0, item.getDescription());
           line.insert(20, item.getQuantityInStock());
           
           System.out.println(line.toString());
       }
       
   }

    private void displayMap() {
        System.out.println("                Hunting Ground           ");
        String leftIndicator;
        String rightIndicator;

  Game game = Hunt.getCurrentGame(); // retreive the game
  Map map = game.getMap(); // retreive the map from game
  Location[][] locations = map.getLocations(); // retreive the locations from map
    // Build the heading of the map
    System.out.print("  |");
    for( int column = 0; column < locations[0].length; column++){
      // print col numbers to side of map
      System.out.print("  " + column + " |"); 
    }
    }
}
