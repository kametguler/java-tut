package adventure_game;

public class Weapon {
    private String name;
    private int id, damage, price;

    public Weapon(String name, int id, int damage, int price) {
        this.name = name;
        this.id = id;
        this.damage = damage;
        this.price = price;
    }

    public static Weapon[] weaponList() {
        Weapon[] weapons = new Weapon[3];
        weapons[0] = new Weapon("Pistol", 1, 2, 25);
        weapons[1] = new Weapon("Sword", 2, 3, 35);
        weapons[2] = new Weapon("Riffle", 3, 7, 45);

        return weapons;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void print() {
        System.out.println(
                "Name: " + this.name + "\tId: " + this.id + "\tDamage: " + this.damage + "\tPrice: " + this.price);
    }
}
