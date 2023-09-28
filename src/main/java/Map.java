import java.util.ArrayList;
import java.util.List;

public class Map {
    public Room buildMap() {
        // Create room objects and build the game map
        Room room1 = new Room("Room 1", "A room with no distinct features, except two doors.");
        Room room2 = new Room("Room 2", "A dimly lit room with a musty smell.");
        Room room3 = new Room("Room 3", "A large room with a high ceiling.");
        Room room4 = new Room("Room 4", "A mysterious room filled with strange artifacts.");
        Room room5 = new Room("Room 5", "A hidden chamber with a single exit to the east.");
        Room room6 = new Room("Room 6", "A narrow corridor with flickering torches.");
        Room room7 = new Room("Room 7", "An underground cave with a shimmering pool.");
        Room room8 = new Room("Room 8", "A dusty library with rows of ancient books.");
        Room room9 = new Room("Room 9", "A secret chamber containing a treasure chest.");

        // Connect rooms according to your descriptions
        room1.setNorth(room3);
        room1.setEast(room2);
        room1.setSouth(room4);
        room1.setWest(room6);

        room2.setWest(room1);
        room2.setSouth(room5);

        room3.setSouth(room1);
        room3.setEast(room4);
        room3.setWest(room7);

        room4.setNorth(room1);
        room4.setWest(room3);
        room4.setSouth(room7);
        room4.setEast(room8);

        room5.setNorth(room2);
        room5.setEast(room9);

        room6.setEast(room1);
        room6.setSouth(room9);

        room7.setEast(room8);
        room7.setSouth(room9);

        room8.setWest(room4);
        room8.setWest(room7);

        room9.setNorth(room6);
        room9.setEast(room5);

        // Create items
        Item sword = new Item("Sword", "A sharp and shiny sword.");
        Item dagger = new Item("Dagger", "A small, sharp dagger.");

        // Add items to rooms
        room1.addItem(sword);
        room2.addItem(dagger);

        // Create the starting room
        Room startingRoom = new Room("Starting Room", "This is where your adventure begins.");

        // Connect the starting room to the rest of the map
        startingRoom.setEast(room1);

        return startingRoom;
    }

    public Room getStartingRoom() {
        return buildMap();
    }
}
