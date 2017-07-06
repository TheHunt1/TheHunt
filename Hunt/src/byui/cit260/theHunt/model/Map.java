/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author MW
 */
public class Map implements Serializable{
    
//    private String locationDesciption;    
//    private String locationArea;
//    private String mapChoice;
//    private String animalChoice;
    private int totalRows;
    private int totalColumns;
    private int currentRow = 0;
    private int currentColumn = 0;
    private Scene currentScene;
    private Location[][] locations;
    private Location currentLocation;

    public Map( int totalRows, int totalColums) {
        if (totalRows < 1 || totalColums <1){
            System.out.println("The rows and columes must be >0");
            return;
        }
        
        this.totalRows= totalRows;
        this.totalColumns = totalColums;
        
        this.locations = new Location [totalRows] [totalColums];
        
        for (int row = 0; row < totalRows; row++) {
            for(int column = 0; column < totalColums; column++){
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                
                locations[row][column] = location;
            }
        }
    }
 
    

    public int getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }

    public int getTotalColumns() {
        return totalColumns;
    }

    public void setTotalColumns(int totalColumns) {
        this.totalColumns = totalColumns;
    }

    public int getCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }

    public int getCurrentColumn() {
        return currentColumn;
    }

    public void setCurrentColumn(int currentColumn) {
        this.currentColumn = currentColumn;
    }

    public Scene getCurrentScene() {
        return currentScene;
    }

    public void setCurrentScene(Scene currentScene) {
        this.currentScene = currentScene;
    }


    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

}
