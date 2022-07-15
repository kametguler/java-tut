package adventure_game;

import java.util.Scanner;
import java.lang.System;

public class Player {
    private Location location;
    private Inventory inventory;
    private Characters characters;
    private String name;
    private Scanner input = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectChar() {

        Characters[] characters = { new Samurai(), new Archer(), new Knight() };

        for (int i = 0; i < characters.length; i++) {
            System.out.print(
                    "\n" + i + "- Character: " + characters[i].getName() + "\t Damage: " + characters[i].getNew_damage()
                            + "\t Health: "
                            + characters[i].getHealth()
                            + "\t Money: " + characters[i].getMoney());
        }

        System.out.print("\n\nYour choice: ");
        int selected_char = input.nextInt();
        if ((selected_char >= 0) && (selected_char <= (characters.length - 1))) {
            this.setCharacters(characters[selected_char]);

            System.out.println("\nThe " + this.getCharacters().getName() + " character was chosen!");
        } else {
            System.out.println("\nPlease make a valid choice !");
            this.selectChar();
        }

    }

    public void selectLocation() {
        Location[] locations = { new SafeHouse(this), new ToolStore(this), new Cave(this), new Forest(this),
                new River(this) };
        for (int i = 0; i < locations.length; i++) {
            System.out.print(
                    "\n" + i + "- " + locations[i].getName());
        }
        System.out.print("\n\nYour choice (to quit the game -1): ");
        int selected_loc = input.nextInt();
        if ((selected_loc >= 0) && (selected_loc <= (locations.length - 1))) {
            this.setLocation(locations[selected_loc]);

            System.out.println("\n\nThe " + this.getLocation().getName() + " location was chosen!");
        } else {
            if (selected_loc == -1) {
                System.exit(0);
            }
            this.location = locations[0];
            System.out.println("\n\nYou've made the incorrect choice. You have been returned to the Safe House");
        }
    }

    public void buyWeapon(Weapon weapon) {
        if (this.characters.getMoney() > weapon.getPrice()) {
            int new_money = this.characters.getMoney() - weapon.getPrice();
            this.characters.setMoney(new_money);
            this.inventory.setWeapon(weapon);
            int new_damage = this.characters.getDamage() + weapon.getDamage();
            this.characters.setNew_damage(new_damage);
        } else {
            System.out.println("You do not have enough money to buy!");
        }
    }

    public void buyArmor(Armor armor) {
        if (this.characters.getMoney() > armor.getPrice()) {
            int new_money = this.characters.getMoney() - armor.getPrice();
            this.characters.setMoney(new_money);
            this.inventory.setArmor(armor);
        } else {
            System.out.println("You do not have enough money to buy!");
        }
    }

    public Inventory getInventory() {
        return this.inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Characters getCharacters() {
        return characters;
    }

    public void setCharacters(Characters characters) {
        this.characters = characters;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void printCharInfo() {
        System.out.println("\nYour weapon : " + this.getInventory().getWeapon().getName() + " , Your armor : "
                + this.getInventory().getArmor().getName() + " , Block : "
                + this.getInventory().getArmor().getBlock_value()
                + " , Your damage : "
                + this.getCharacters().getNew_damage() + " , Health : " + this.getCharacters().getHealth()
                + " , Money : "
                + this.characters.getMoney());
    }
}
