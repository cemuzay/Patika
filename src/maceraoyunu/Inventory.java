package src.maceraoyunu;

public class Inventory {
    private Weapon weapon;
    private Armor armor;
    private Award award;

    private boolean water = false;

    private  boolean food = false;
    private boolean firewood = false;

    public Inventory(boolean water, boolean food, boolean firewood) {
        this.water = water;
        this.food = food;
        this.firewood = firewood;
    }
    public Inventory() {
      this.weapon=new Weapon("yumruk",-1,0,0);
      this.armor=new Armor(-1,"paçavra",0,0);
      this.award=new Award(1," yok ");

    }
    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isFirewood() {
        return firewood;
    }

    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }


    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Award getAward() {
        return award;
    }

    public void setAward(Award award) {
        this.award = award;
    }
}
