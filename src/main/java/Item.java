public class Item {
    private String name;
    private String description;

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return name;
    }
}


//name og description
//player inventory 'arraylist' af items som playeren har
//room skal indeholde items, som man kan finde 'arraylist'
//map- læg items i rum. Definer rum og læg items i rum
//brugerinterface. håndter nye kommandoer 'take item' og 'drop item' til og fra inventory list. Vis inventory


