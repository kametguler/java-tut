package adventure_game;

public class ToolStore extends NormalLoc {

    public ToolStore(Player player) {
        super(player, "Tool Store");
    }

    @Override
    public boolean onLocation() {
        System.out.println("\nWelcome to the Tool Store");
        System.out.print("\n1 - Weapons\n2 - Armors\n3 - Quit\n\nSelection: ");
        int selection = input.nextInt();

        getPlayer().printCharInfo();

        while ((selection < 1) || (selection > 3)) {
            System.out.print("Invalid choice!");
            selection = input.nextInt();
        }

        switch (selection) {
            case 1:
                this.printWeapons();
                this.doPurchaseForWeapon();
                break;
            case 2:
                this.printArmors();
                this.doPurchaseForArmor();
                break;
            case 3:
                System.out.print("You are leaving from the Tool Store");
                return true;
        }
        return true;
    }

    public void printWeapons() {
        System.out.println("\n\nWeapons\n");
        for (Weapon weapon : Weapon.weaponList()) {
            weapon.print();
        }
    }

    public void printArmors() {
        System.out.println("\n\nArmors\n");
        for (Armor armor : Armor.listArmors()) {
            armor.print();
        }
    }

    public void doPurchaseForWeapon() {
        System.out.print("\nPlease write ID of item that you want to buy (for quit -1): ");
        int selected_item_id = input.nextInt();
        if (selected_item_id > 0 && selected_item_id <= Weapon.weaponList().length) {
            // DEBUG
            System.out.println("\nİLK PARAM: " + getPlayer().getCharacters().getMoney());
            System.out.println("\nİLK ITEMIM: " + getPlayer().getInventory().getWeapon().getName());
            this.getPlayer().buyWeapon(Weapon.weaponList()[selected_item_id - 1]);
            // DEBUG
            System.out.println("\nSONRAKI PARAM: " + getPlayer().getCharacters().getMoney());
            System.out.println("\nSONRAKI ITEMIM: " + getPlayer().getInventory().getWeapon().getName());

        } else if (selected_item_id == -1) {
            System.out.print("");
        } else {
            System.out.println("Please select valid item !");
            doPurchaseForWeapon();
        }
    }

    public void doPurchaseForArmor() {
        System.out.print("\nPlease write ID of item that you want to buy: ");
        int selected_item_id = input.nextInt();
        if (selected_item_id > 0 && selected_item_id <= Armor.listArmors().length) {
            // DEBUG
            System.out.println("\nİLK PARAM: " + getPlayer().getCharacters().getMoney());
            System.out.println("\nİLK ARMORUM: " + getPlayer().getInventory().getArmor().getName());
            this.getPlayer().buyArmor(Armor.listArmors()[selected_item_id - 1]);
            // DEBUG
            System.out.println("\nSONRAKI PARAM: " + getPlayer().getCharacters().getMoney());
            System.out.println("\nSONRAKI ARMORUM: " + getPlayer().getInventory().getArmor().getName());

        } else if (selected_item_id == -1) {
            System.out.print("");
        } else {
            System.out.println("Please select valid item !");
            doPurchaseForArmor();
        }
    }
}
