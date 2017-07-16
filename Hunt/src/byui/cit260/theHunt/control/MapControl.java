/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.control;

import byui.cit260.theHunt.model.Actor;
import byui.cit260.theHunt.model.Animal;
import byui.cit260.theHunt.model.Map;
import byui.cit260.theHunt.model.Scene;
import byui.cit260.theHunt.model.SceneType;
import exceptions.MapControlException;
import hunt.Hunt;
import java.awt.Point;

/**
 *
 * @author MW
 */
public class MapControl {

    static Map createMap() {
        Map map = new Map(5, 5);

        Scene[] scenes = createScenes();

        GameControl.assignSceneToLocations(map, scenes);
        return map;
    }

    private static Scene[] createScenes() {
        Scene[] scenes = new Scene[SceneType.values().length];

        Scene newScene = new Scene();

        newScene = new Scene();
        newScene.setName("Crystal Lake");
        newScene.setDescription("Shores of the crystal clear lake.");
        newScene.setMapSymbol("CL");
        newScene.setAnimal(Animal.Predator);
        scenes[SceneType.crystallake.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName("Black River");
        newScene.setDescription("Black bottom river");
        newScene.setMapSymbol("BR");
        scenes[SceneType.blackriver.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName("Wetlands");
        newScene.setDescription("Soggy marsh land");
        newScene.setMapSymbol("WL");
        scenes[SceneType.wetlands.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName("Watershed");
        newScene.setDescription("Marsh at a river mouth");
        newScene.setMapSymbol("WS");
        scenes[SceneType.watershed.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName("White Water Bend");
        newScene.setDescription("Rapids at a river bend");
        newScene.setAnimal(Animal.Predator);
        newScene.setMapSymbol("WW");
        scenes[SceneType.whitewaterbend.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName("Rapid Falls");
        newScene.setDescription("Water fall down a narrow chute");
        newScene.setMapSymbol("RF");
        scenes[SceneType.rapidfalls.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName("Morning Wetland");
        newScene.setDescription("Heavy mist covers this wetland in the morning");
        newScene.setAnimal(Animal.Alligator);
        newScene.setMapSymbol("MW");
        scenes[SceneType.morningwetland.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName("Thousand Streams");
        newScene.setDescription("Many small stream meet here");
        newScene.setMapSymbol("TS");
        scenes[SceneType.thousandstreams.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName("Poop Falls");
        newScene.setDescription("Animals tend to poop near these falls");
        newScene.setAnimal(Animal.Rabbit);
        newScene.setMapSymbol("PF");
        scenes[SceneType.poopfalls.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName("White Ridge");
        newScene.setDescription("This ridge glows white a first sunlight");
        newScene.setAnimal(Animal.Predator);
        newScene.setMapSymbol("WR");
        scenes[SceneType.whiteridge.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName("Burnt Forest");
        newScene.setDescription("This forest is the scene of many lightning fires");
        newScene.setMapSymbol("BF");
        scenes[SceneType.burntforest.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName("Black Woods");
        newScene.setDescription("Very little light penetrates these dense woods");
        newScene.setMapSymbol("BW");
        scenes[SceneType.blackwoods.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName("Yellow Valley");
        newScene.setDescription("Golden yellow valley");
        newScene.setMapSymbol("YV");
        scenes[SceneType.yellowvalley.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName("Tree Line");
        newScene.setDescription("11,000 ft elevation where trees no longer grow");
        newScene.setMapSymbol("TL");
        scenes[SceneType.treeline.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName("Sky Rim");
        newScene.setDescription("Get the upper hand from a elevated vantage point");
        newScene.setMapSymbol("SR");
        scenes[SceneType.skyrim.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName("Triple peaks");
        newScene.setDescription("Best backdrop of three peaks");
        newScene.setMapSymbol("TP");
        scenes[SceneType.triplepeaks.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName("Windy Gap");
        newScene.setDescription("Strong winds through this pass");
        newScene.setMapSymbol("WG");
        scenes[SceneType.windygap.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName("Copper Canyon");
        newScene.setDescription("Copper colored walls in this canyon");
        newScene.setMapSymbol("CC");
        scenes[SceneType.coppercanyon.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName("Cloud Peak");
        newScene.setDescription("Cloud cover can make visibility a problem");
        newScene.setMapSymbol("CP");
        scenes[SceneType.cloudpeak.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName("Agnew Meadow");
        newScene.setDescription("Beautiful tall green grass  meadow");
        newScene.setMapSymbol("AM");
        scenes[SceneType.agnewmeadow.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName("Madrona Marsh");
        newScene.setDescription("Dry marsh land");
        newScene.setMapSymbol("MM");
        scenes[SceneType.madronamarsh.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName("Chantry Flats");
        newScene.setDescription("Elevated flats surrounded by hills and valleys");
        newScene.setMapSymbol("CF");
        scenes[SceneType.chantryflats.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName("High Desert");
        newScene.setDescription("Elevated desert land");
        newScene.setMapSymbol("HD");
        scenes[SceneType.highdesert.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName("Grass Lands");
        newScene.setDescription("Grassy meadow");
        newScene.setMapSymbol("GL");
        scenes[SceneType.grasslands.ordinal()] = newScene;

        newScene = new Scene();
        newScene.setName("Petrified Forest");
        newScene.setDescription("Skeleton looking tree forest");
        newScene.setMapSymbol("PF");
        scenes[SceneType.petrifiedforest.ordinal()] = newScene;

        return scenes;
    }

    public static void movePlayerToStartingLocation(Map map) throws MapControlException {
        // If starting location is not supposed to be 0,0 then use the correct values here.
        movePlayer(map, 0, 0); // or instead of 0,0 you can select a different starting location
        
    }

    public static void movePlayer(Map map, int row, int column) throws MapControlException {
        if (map == null)
            throw new MapControlException("error map is not initialized");
        
        if(row<0 || row>=map.getTotalRows())
            throw new MapControlException("invalid row");
        
        if(column<0 || column>=map.getTotalColumns())
            throw new MapControlException("invalid column");
        
        map.setCurrentLocation(map.getLocations()[row][column]);
        map.getCurrentLocation().setVisited(true);
        map.setCurrentRow(row);
        map.setCurrentColumn(column);
        map.setCurrentScene(map.getCurrentLocation().getScene());
    }

}
