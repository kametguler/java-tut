package adventure_game;

public abstract class Characters {
    private String name;
    private int id, damage, health, money, new_damage, default_health;

    public Characters(int id, int damage, int health, int money, String name) {
        this.id = id;
        this.damage = damage;
        this.health = health;
        this.money = money;
        this.name = name;
        default_health = health;
        this.new_damage = damage;
    }

    public int getDefault_health() {
        return default_health;
    }

    public void setDefault_health(int default_health) {
        this.default_health = default_health;
    }

    public int getNew_damage() {
        return new_damage;
    }

    public void setNew_damage(int new_damage) {
        this.new_damage = new_damage;
    }

    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return this.money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
