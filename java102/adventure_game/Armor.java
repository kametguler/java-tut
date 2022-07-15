package adventure_game;

public class Armor {
    private String name;
    private int id, block_value, price;

    public Armor(String name, int id, int block_value, int price) {
        this.name = name;
        this.id = id;
        this.block_value = block_value;
        this.price = price;
    }

    public static Armor[] listArmors() {
        Armor[] armors = new Armor[3];

        armors[0] = new Armor("Slight", 1, 1, 15);
        armors[1] = new Armor("Middle", 2, 3, 25);
        armors[2] = new Armor("Heavy", 3, 5, 40);

        return armors;
    }

    public int getBlock_value() {
        return block_value;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setBlock_value(int block_value) {
        this.block_value = block_value;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void print() {
        System.out.println(
                "Name: " + this.name + "\tId: " + this.id + "\tBlock Value: " + this.block_value + "\tPrice: "
                        + this.price);
    }

}
