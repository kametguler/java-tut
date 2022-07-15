package adventure_game;

public class Monster {
    private String name;
    private int id, damage, health, money;

    public Monster(String name, int id, int damage, int health) {
        this.name = name;
        this.id = id;
        this.damage = damage;
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public int getId() {
        return id;
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setName(String name) {
        this.name = name;
    }
}
