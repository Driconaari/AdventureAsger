public class Adventure {
    private Room currentRoom;
    private Map map;
    private Player player; // Add a player field

    public Adventure(Map map, Player player) {
        this.map = map;
        this.player = player; // Initialize the player field
        currentRoom = map.getStartingRoom(); // Use the map instance to build the game map
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room room) {
        currentRoom = room;
    }

    public Room getStartingRoom() {
        return map.getStartingRoom(); // Return the starting room from the map
    }
}
