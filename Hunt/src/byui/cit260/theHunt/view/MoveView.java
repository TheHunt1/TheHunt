/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import byui.cit260.theHunt.control.MapControl;
import byui.cit260.theHunt.model.Game;
import byui.cit260.theHunt.model.Location;
import byui.cit260.theHunt.model.Map;
import exceptions.MapControlException;

/**
 *
 * @author MW
 */
public class MoveView extends View {
//private final String map;
private String promptMessage;

public MoveView() {
     super("\n"
     + "\n------------------------------------------"
     + "\n Enter symbol for you desired location "
     + "\n------------------------------------------");
}
  @Override
  public boolean doAction(String mapOption) {
     mapOption = mapOption.toUpperCase();
     Game game = hunt.Hunt.getCurrentGame(); // retreive the game
     Map map = game.getMap(); // retreive the map from game
     Location[][] locations = map.getLocations(); // retreive the locations from map
     for (int row = 0; row < locations.length; row++) {
          for (int column = 0; column < locations[row].length; column++) {
               if (locations[row][column].getScene() != null) {               
                    if (mapOption.equals(locations[row][column].getScene().getMapSymbol())) {
                        try{ 
                        MapControl.movePlayer(map, row, column);
                        }
                        catch(MapControlException me){
                            System.out.println(me.getMessage());
                        }
                         return true;
                    }
                 }
            }
     }
     this.console.println("\n*** Invalid selection *** Try Again later");
     return false;
   }
}
