package src.maceraoyunu;

import java.util.Random;

public abstract class BattleLoc extends Location {
    Random random=new Random();
    private Monster monster;
    private String prize;
    private int maxobstacle;


    private boolean isAllEneymiesClear;
    public BattleLoc(Player player, String name, Monster monster, String prize, int maxobstacle) {
        super(player, name);
        this.monster=monster;
        this.prize=prize;
        this.maxobstacle=maxobstacle;
        this.isAllEneymiesClear=false;
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
            }   if(this.getMonster().getHealth()<this.getPlayer().getHealth()){
                System.out.println( " Düşmanı yendiniz ");
                System.out.println(this.getMonster().getAward()+ " para kazandız !");
                this.getPlayer().setMoney(this.player().getMoney()+this.monster.getAward());
                System.out.println("ödülünüz "+this.getMonster().getPrize());
                System.out.println("Güncel Paranız : "+this.getPlayer().getMoney());
            }else {
                return false;
            }

        }
        setAllEneymiesClear(true);
        System.out.println("tüm düşmanları yendiniz oyun bitti.");
        return true;

    }
    public void ObstacleStats(int i){
        System.out.println(i+"."+this.getMonster().getName() + " değerleri ");
        System.out.println("------------");
        System.out.println("sağlık : "+ this.getMonster().getHealth());
        System.out.println("hasar : "+this.getMonster().getDamage());
        System.out.println("yılanın rastgele hasarı " +this.getMonster().getMaxdamage());
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
    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }

    public boolean isAllEneymiesClear() {
        return isAllEneymiesClear;
    }

    public void setAllEneymiesClear(boolean allEneymiesClear) {
        isAllEneymiesClear = allEneymiesClear;
    }
}
