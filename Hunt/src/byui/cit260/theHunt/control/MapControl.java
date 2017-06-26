/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.control;

import byui.cit260.theHunt.model.Map;
import byui.cit260.theHunt.model.Scene;

/**
 *
 * @author MW
 */
public class MapControl {
  static Map createMap (){
      Map map = new Map (20, 20);
      
      Scene [] scenes = createScenes ();
      
      GameControl.assignSceneToLocations (map, scenes);
      return map;
  }  

    private static Scene[] createScenes() {
        Scene [] scenes = new Scene[SceneType.values().length];
        return scenes;
    }
}
