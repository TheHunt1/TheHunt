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
    
    private String locationDesciption;    
    private String locationArea;
    private String mapChoice;
    private String animalChoice;
    private int totalRows;
    private int totalColumns;
    private int currentRow;
    private int currentColumn;
    private String currentScene;
    private Game[] game;

    public Map() {
    }
    
    

    public String getLocationDesciption() {
        return locationDesciption;
    }

    public void setLocationDesciption(String locationDesciption) {
        this.locationDesciption = locationDesciption;
    }

    public String getLocationArea() {
        return locationArea;
    }

    public void setLocationArea(String locationArea) {
        this.locationArea = locationArea;
    }

    public String getMapChoice() {
        return mapChoice;
    }

    public void setMapChoice(String mapChoice) {
        this.mapChoice = mapChoice;
    }

    public String getAnimalChoice() {
        return animalChoice;
    }

    public void setAnimalChoice(String animalChoice) {
        this.animalChoice = animalChoice;
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

    public String getCurrentScene() {
        return currentScene;
    }

    public void setCurrentScene(String currentScene) {
        this.currentScene = currentScene;
    }

    public Game[] getGame() {
        return game;
    }

    public void setGame(Game[] game) {
        this.game = game;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.locationDesciption);
        hash = 71 * hash + Objects.hashCode(this.locationArea);
        hash = 71 * hash + Objects.hashCode(this.mapChoice);
        hash = 71 * hash + Objects.hashCode(this.animalChoice);
        hash = 71 * hash + this.totalRows;
        hash = 71 * hash + this.totalColumns;
        hash = 71 * hash + this.currentRow;
        hash = 71 * hash + this.currentColumn;
        hash = 71 * hash + Objects.hashCode(this.currentScene);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (this.totalRows != other.totalRows) {
            return false;
        }
        if (this.totalColumns != other.totalColumns) {
            return false;
        }
        if (this.currentRow != other.currentRow) {
            return false;
        }
        if (this.currentColumn != other.currentColumn) {
            return false;
        }
        if (!Objects.equals(this.locationDesciption, other.locationDesciption)) {
            return false;
        }
        if (!Objects.equals(this.locationArea, other.locationArea)) {
            return false;
        }
        if (!Objects.equals(this.mapChoice, other.mapChoice)) {
            return false;
        }
        if (!Objects.equals(this.animalChoice, other.animalChoice)) {
            return false;
        }
        if (!Objects.equals(this.currentScene, other.currentScene)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "locationDesciption=" + locationDesciption + ", locationArea=" + locationArea + ", mapChoice=" + mapChoice + ", animalChoice=" + animalChoice + ", totalRows=" + totalRows + ", totalColumns=" + totalColumns + ", currentRow=" + currentRow + ", currentColumn=" + currentColumn + ", currentScene=" + currentScene + '}';
    }
    
    
    
}
