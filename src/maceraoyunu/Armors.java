package src.maceraoyunu;

public class Armors {
    private String armor;
    private int id;

    private int block;
    private int money;

    public Armors(String armor, int id, int block, int money) {
        this.armor = armor;
        this.id = id;
        this.block = block;
        this.money = money;
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

}
