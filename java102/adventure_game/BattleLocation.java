package adventure_game;

import java.util.Random;

public class BattleLocation extends Location {

    private Monster monster;
    private String award;
    private int max_monster;

    public BattleLocation(Player player, String name, Monster monster, String award, int max_monster) {
        super(player, name);
        this.monster = monster;
        this.award = award;
        this.max_monster = max_monster;
    }

    public int getMonsterCount() {
        Random random = new Random();

        int monster_count = random.nextInt(max_monster) + 1;

        return monster_count;

    }

    @Override
    public boolean onLocation() {
        int monster_count = this.getMonsterCount();
        System.out.println("Now you are here : " + this.getName());
        System.out
                .println("Watch out ! " + monster_count + " " + this.getMonster().getName() + " lives here!");

        return this.fight(monster_count);

    }

    public boolean fight(int monster_count) {
        for (int i = 0; i < monster_count; i++) {
            this.getMonster().setHealth(Monster.getDefault_health());
            getPlayer().playerStats();
            getMonster().monsterStats();
            while (this.getPlayer().getCharacters().getHealth() > 0 && this.getMonster().getHealth() > 0) {
                System.out.print("\nDo you wanna hit ? (Y or N) : ");
                String choice = input.nextLine().toUpperCase();
                if (choice.equals("Y")) {
                    System.out.println("\nYou hit!");
                    this.getMonster()
                            .setHealth(this.monster.getHealth() - this.getPlayer().getCharacters().getNew_damage());
                    afterHit();
                } else {
                    System.out.println("You escaped the fight!");
                    return true;
                }
            }
        }
        if (this.getPlayer().getCharacters().getHealth() > 0) {
            if (this.getMonster().getHealth() <= 0) {
                updateMoney(getPlayer(), getMonster());
                System.out.println(
                        "\nYou killed the monsters\n\nYou got : " + this.getMonster().getAward() + "money");
            }
            return true;
        } else {
            return false;
        }
    }

    public void updateMoney(Player player, Monster monster) {
        int new_money = player.getCharacters().getMoney() + monster.getAward();
        player.getCharacters().setMoney(new_money);
    }

    public void afterHit() {
        if (this.getPlayer().getCharacters().getHealth() > 0) {
            int blocked_damage = this.getMonster().getDamage()
                    - this.getPlayer().getInventory().getArmor().getBlock_value();
            if (blocked_damage < 0) {
                blocked_damage = 0;
            }
            int new_health = this.getPlayer().getCharacters().getHealth() - blocked_damage;

            System.out.println("\nMonster hit!");
            this.getPlayer().getCharacters().setHealth(new_health);
        }
        System.out.println("\nYour health : " + this.getPlayer().getCharacters().getHealth());
        System.out.println(this.getMonster().getName() + "'s health : " + this.getMonster().getHealth());
    }

    public int getMax_monster() {
        return max_monster;
    }

    public void setMax_monster(int max_monster) {
        this.max_monster = max_monster;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

}
