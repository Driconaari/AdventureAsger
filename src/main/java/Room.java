import java.util.ArrayList;
import java.util.List;

public class Room {
    private String name;
    private String description;
    private Room north;
    private Room east;
    private Room south;
    private Room west;

    private String item;

    public Room(String name, String description, String item) {
        this.name = name;
        this.description = description;
        this.item = item;
    }
    public Room (String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Room getNorth() {
        return north;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public Room getEast() {
        return east;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public Room getSouth() {
        return south;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public Room getWest() {
        return west;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public void addItem(Item sword) {
        // Implement item handling in the room
    }

    public void removeItem(Item item) {
        // Implement item removal in the room
    }

    public Item getItemByName(String itemName) {
        // Implement item retrieval by name in the room
        return null;
    }
}