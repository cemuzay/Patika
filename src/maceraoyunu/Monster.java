package src.maceraoyunu;

public class Monster {

    private String name;
    private int id;
    private int damage;
    private int health;
    private int award;
    private  int orjhealth;

    public Monster(int id, String name, int damage, int health, int award, int orjhealth) {
        this.id = id;
        this.name=name;
        this.damage = damage;
        this.health = health;
        this.award=award;
        this.orjhealth = orjhealth;
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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health
    ) {
        if(health<0){
            health=0;
        }
        this.health = health;
    }

    public int getAward() {
        return award;
    }

    public int getOrjhealth() {
        return orjhealth;
    }

    public void setOrjhealth(int orjhealth) {
        this.orjhealth = orjhealth;
    }

    public void setAward(int award) {
        this.award = award;
    }

}
