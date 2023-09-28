    public class Main {
        public static void main(String[] args) {
            Map map = new Map(); // Create the map
            Player player = new Player(map.getStartingRoom()); // Create the player
            Adventure adventure = new Adventure(map, player); // Pass the map and player to the Adventure
            UserInterface ui = new UserInterface(adventure, player); // Pass the player to the UserInterface
            ui.startGame();
        }

    }
