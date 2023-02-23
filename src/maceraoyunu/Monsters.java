package src.maceraoyunu;

public class Monsters {


    private String monster;
    private int id;
    private int damage;
    private int health;
    private int money;

    public Monsters(String monster, int id, int damage, int health, int money) {
        this.monster = monster;
        this.id = id;
        this.damage = damage;
        this.health = health;
        this.money = money;
    }
    public String getMonster() {
        return monster;
    }

    public void setMonster(String monster) {
        this.monster = monster;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }







}
