package src.maceraoyunu;

import java.util.Random;

public abstract class BattleLoc extends Location {
    Random random=new Random();
    private Monster monster;
    private String item;
    private int maxobstacle;
    private int chance;

    public int getChance2() {
        return chance2;
    }

    public void setChance2(int chance2) {
        this.chance2 = chance2;
    }

    private int chance2;

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    private String type;

    Inventory inventory;

    private boolean isAllEneymiesClear;
    public BattleLoc(Player player, String name, Monster monster, String item, int maxobstacle,String type) {
        super(player, name);
        this.monster=monster;
        this.item =item;
        this.maxobstacle=maxobstacle;
        this.isAllEneymiesClear=false;
        this.type=type;
    }
    @Override
    public boolean onLocation() {
        if (!isAllEneymiesClear()){
            int obsNumber=this.randomObstacleNumber();
            System.out.println("Şuan buradasınız : "+ this.getName());
            System.out.println("Dikkatli Ol Burada ! "+obsNumber + " tane " + this.getMonster().getName()+ " yaşıyor");
            System.out.println("<S>avaş veya <K>aç : ");
            String selectCase=input.next();
            selectCase=selectCase.toUpperCase();
            if(selectCase.equals("S") && combat(obsNumber)){
                if(isAllEneymiesClear()){
                    System.out.println(this.getName()+"tüm düşmanları yendiniz !");
                }
                return true;
            }
            if(this.getPlayer().getHealth()<=0){
                System.out.println("öldünüz");
                return false;
            }
        }
        else
            System.out.println("Zaten Burayi temizlediniz. Tekrar giremezsiniz!");

        return true;
    }
    public boolean combat(int obsNumber){
        for(int i=1;i<=obsNumber;i++){
            this.getMonster().setHealth(this.getMonster().getOrjhealth());
            playerStats();
            ObstacleStats(i);
            while (this.getPlayer().getHealth()>0 && this.getMonster().getHealth()>0 ) {
                int shoot = random.nextInt(2);
                switch (shoot) {
                    case 0:
                        System.out.println("Vurmak icin v'ye basiniz kaçmak için k ye basın");
                        String selectcase = input.next();
                        selectcase = selectcase.toUpperCase();
                        if (selectcase.equals("K")) {
                            System.out.println("kaçıyorsunuz...");
                            return true;
                        } else if (selectcase.equals("V")) {
                            System.out.println("Siz vurdunuz !");
                            monster.setHealth(this.monster.getHealth() - this.getPlayer().getTotaldamage());
                            afterHit();
                        }
                        else{
                            return false;
                        }
                    case 1:
                        if (this.getMonster().getHealth() > 0) {
                            System.out.println();
                            System.out.println("Canavar size vurdu !");
                            int obstacledamge = this.getMonster().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                            if (obstacledamge < 0) {
                                obstacledamge = 0;
                            }
                            this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacledamge);
                            afterHit();
                        }

                }
            }
            if(this.getMonster().getHealth()<this.getPlayer().getHealth()){
                System.out.println( " Düşmanı yendiniz ");
                System.out.println(this.getMonster().getAward()+ " para kazandız !");
                if(getType().equals("coal")){

                setChance(getRandomNumberUsingInts(0,100));
              if(chance>=0 && chance<15){
                  setChance2(getRandomNumberUsingInts(0,100));
                  if(chance2>=0 && chance2<20){
                      Weapon.getweaponobjbyid(3);
                      System.out.println("şansınıza tüfek düştü");
                  }else if(chance2>=20 && chance2<50){
                      Weapon.getweaponobjbyid(2);
                      System.out.println("şansınıza kılıç düştü");

                  }else if(chance2>=50 && chance2<=100){
                      Weapon.getweaponobjbyid(1);
                      System.out.println("şansınıza tabanca düştü");
                  }
              }else if(chance>=15 && chance<30){
                  setChance2(getRandomNumberUsingInts(0,100));
                  if(chance2>=0 && chance2<20){
                    Armor.getArmorobjbyid(3);
                      System.out.println("şansınıza ağır zırh düştü");
                  }else if(chance2>=20 && chance2<50){
                      Armor.getArmorobjbyid(2);
                      System.out.println("şansınıza orta zırh düştü");
                  }else if(chance2>=50 && chance2<=100){
                      Armor.getArmorobjbyid(1);
                      System.out.println("şansınıza hafif zırh düştü");

                  }
              }else if(chance>=30 && chance<55){
                  setChance2(getRandomNumberUsingInts(0,100));
                  if(chance2>=0 && chance2<20){
                      this.getPlayer().setMoney(this.player().getMoney()+ 10);
                      System.out.println("şansınıza 10 lira düştü");
                  }else if(chance2>=20 && chance2<50){
                      this.getPlayer().setMoney(this.player().getMoney()+ 5);
                      System.out.println("şansınıza 5 lira düştü");
                  }else if(chance2>=50 && chance2<=100){
                      this.getPlayer().setMoney(this.player().getMoney()+ 1);
                      System.out.println("şansınıza 1 lira düştü");
                  }


              }else{
                  System.out.println("hiç öldül kazanamadınız . ");
              }
                }
                this.getPlayer().setMoney(this.player().getMoney()+this.monster.getAward());
                System.out.println("ödülünüz "+this.getMonster().getPrize());
                System.out.println("Güncel Paranız : "+this.getPlayer().getMoney());
            }
            else {
                return false;

            }

        }
        setAllEneymiesClear(true);

        switch (type){
            case "cave":
                player().getInventory().setFood(true);
                break;
            case "forest":
                player().getInventory().setFirewood(true);
                break;
            case "river":
                player().getInventory().setWater(true);
                break;
            case "coal":
                break;
        }
        System.out.println("tüm düşmanları yendiniz oyun bitti.");
        return true;

    }
    public void ObstacleStats(int i){
        System.out.println(i+"."+this.getMonster().getName() + " değerleri ");
        System.out.println("------------");
        System.out.println("sağlık : "+ this.getMonster().getHealth());
        System.out.println("hasar : "+this.getMonster().getDamage());
        System.out.println("yılanın rastgele hasarı " + this.getMonster().getMaxdamage());
        System.out.println("ödül : "+this.getMonster().getAward());
    }
    public void playerStats(){
        System.out.println("Oyuncu değerleri ");
        System.out.println("----------------");
        System.out.println("sağlık   : "+ this.getPlayer().getHealth());
        System.out.println("silah    : "+ this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("zırh     : "+ this.getPlayer().getInventory().getArmor().getName());
        System.out.println("bloklama : "+ this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("hasar    : "+ this.getPlayer().getDamage());
        System.out.println("Para     : "+this.getPlayer().getMoney());

    }
    public void afterHit(){
        System.out.println(" Canınız : "+ this.getPlayer().getHealth());
        System.out.println(this.getMonster().getName()+"Canı : "+this.getMonster().getHealth());
        System.out.println();
    }
    public int randomObstacleNumber(){
        Random r=new Random();
        return  r.nextInt(this.getMaxobstacle())+1;
    }
    public int getRandomNumberUsingInts(int min, int max) {
        Random random = new Random();
        return random.ints(min, max)
                .findFirst()
                .getAsInt();
    }


    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public int getMaxobstacle() {
        return maxobstacle;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public void setMaxobstacle(int maxobstacle) {
        this.maxobstacle = maxobstacle;
    }
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public boolean isAllEneymiesClear() {
        return isAllEneymiesClear;
    }

    public void setAllEneymiesClear(boolean allEneymiesClear) {
        isAllEneymiesClear = allEneymiesClear;
    }

}
