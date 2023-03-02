package src.maceraoyunu;

public class Inventory {
    private Weapon weapon;
    private Armor armor;
    private Award award;

    public Inventory() {
      this.weapon=new Weapon("yumruk",-1,0,0);
      this.armor=new Armor(-1,"paçavra",0,0);
      this.award=new Award(1,"yok ");

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
