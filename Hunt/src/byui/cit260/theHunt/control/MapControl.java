/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.control;

import byui.cit260.theHunt.model.Actor;
import byui.cit260.theHunt.model.Map;
import byui.cit260.theHunt.model.Scene;
import exceptions.MapControlException;
import hunt.Hunt;


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
        
        Scene startingScene = new Scene ();
        startingScene.setDescription ( "You have enter the hunting field"
        + "you will be able to hunt and get points from your "
        + "kills. Watch out for predators!");
        startingScene.setMapSymbol (" ST ");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription ( "You have completed the hunt");
        finishScene.setMapSymbol (" FN ");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        scenes[SceneType.finish.ordinal()] = finishScene;
        
        Scene ammoScene = new Scene();
        ammoScene.setDescription ( "You found ammo");
        ammoScene.setMapSymbol (" AS ");
        ammoScene.setBlocked(false);
        ammoScene.setTravelTime(600);
        scenes[SceneType.ammo.ordinal()] = ammoScene;
        
        Scene animalScene = new Scene();
        animalScene.setDescription ( "An animal appered");
        animalScene.setMapSymbol (" AN ");
        animalScene.setBlocked(false);
        animalScene.setTravelTime(600);
        scenes[SceneType.animal.ordinal()] = animalScene;
        
        Scene predatorScene = new Scene();
        predatorScene.setDescription ( "You found ammo");
        predatorScene.setMapSymbol (" AP ");
        predatorScene.setBlocked(false);
        predatorScene.setTravelTime(600);
        scenes[SceneType.predator.ordinal()] = predatorScene;
        
        Scene foodScene = new Scene();
        foodScene.setDescription ( "You found ammo");
        foodScene.setMapSymbol (" AF ");
        foodScene.setBlocked(false);
        foodScene.setTravelTime(600);
        scenes[SceneType.food.ordinal()] = foodScene;
        
        Scene bushScene = new Scene();
        bushScene.setDescription ( "You found ammo");
        bushScene.setMapSymbol (" AS ");
        bushScene.setBlocked(false);
        bushScene.setTravelTime(600);
        scenes[SceneType.bush.ordinal()] = bushScene;
        
        
        return scenes;
    }


    public static void moveActorsToStartingLocation(Map map) throws MapControlException{
        Actor [] actors = Actor.values();
        
        for (Actor actor : actors) {
            Point coordinates = actor.getCoordinates();
            MapControl.moveActorToLocation(actor, coordinates);
            
        }
   
    }
    
    public enum SceneType {
    
    start,
    animal,
    predator,
    bush,
    food,
    ammo,
    finish;
    }
    
    public static void moveActorToLocation (Actor actor, Point coordinates) throws MapControlException {
        Map map = Hunt.getCurrentGame().getMap();
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        
        if (newRow < 0 || newRow >= map.getTotalRows() || newColumn <0 || newColumn >= map.getTotalColumns()){
            throw new MapControlException ("Can't move actor to location " 
            + coordinates.x + ", " + coordinates.y + 
                    "because location is outside the bounds of the map");
        }
       
    }
   
}
