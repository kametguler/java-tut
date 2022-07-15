package adventure_game;

import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);
    private Player player;

    public void start() {
        System.out.println("****************** Welcome to the Adventure Game ******************");
        System.out.print("Please enter your name: ");
        String playerName = this.input.nextLine();

        this.player = new Player(playerName);

        System.out.println("\n\n******************" + player.getName() + " Welcome ! ******************\n\n");
        System.out.print(player.getName() + " please select your character!\n\n");
        player.selectChar();
        System.out.print("\n\n" + player.getName() + " Please select your location!\n\n");
        while (true) {
            player.selectLocation();
            if (!player.getLocation().onLocation()) {
                System.out.println("Game Over");
            }

        }
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

}
