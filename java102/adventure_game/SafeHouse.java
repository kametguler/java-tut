package adventure_game;

public class SafeHouse extends NormalLoc {

    public SafeHouse(Player player) {
        super(player, "Safe House");
    }

    @Override
    public boolean onLocation() {
        System.out.println("\nYou are at Safe House. Your health has been renewed");
        return true;
    }
}
