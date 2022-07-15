package adventure_game;

public class Monster {
    private String name;
    private int id, damage, health, award;
    private static int default_health;

    public Monster(String name, int id, int damage, int health, int award) {
        this.name = name;
        this.id = id;
        this.damage = damage;
        this.health = health;
        this.award = award;
        default_health = health;
    }

    public static int getDefault_health() {
        return default_health;
    }

    public static void setDefault_health(int default_health) {
        Monster.default_health = default_health;
    }

    public int getAward() {
        return award;
    }

    public void setAward(int award) {
        this.award = award;
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

    public void setName(String name) {
        this.name = name;
    }

    public void monsterStats() {
        System.out.println("\nMonster Status");
        System.out.println("----------------------");
        System.out.println(
                "Damage : " + this.getDamage()
                        + "\nHealth : " + this.getHealth()
                        + "\nAward : " + this.getAward());
    }

}
