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
        System.out.println("Now you are here : " + this.getName());
        System.out
                .println("Watch out ! " + this.getMonsterCount() + " " + this.getMonster().getName() + " lives here!");
        return true;
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
