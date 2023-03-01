package src.maceraoyunu;

import java.util.Random;

public abstract class BattleLoc extends Location {
    private Monster monster;
    private String award;
    private int maxobstacle;
    private int chance;
    public BattleLoc(Player player, String name, Monster monster, String award, int maxobstacle,int chance) {
        super(player, name);
        this.monster=monster;
        this.award=award;
        this.maxobstacle=maxobstacle;
        this.chance=chance;
    }
    @Override
    public boolean onLocation() {
        int obsNumber=this.randomObstacleNumber();
        System.out.println("Şuan buradasınız : "+ this.getName());
        System.out.println("Dikkatli Ol Burada ! "+obsNumber + " tane " + this.getMonster().getName()+ " yaşıyor");
        System.out.println("<S>avaş veya <K>aç : ");
        String selectCase=input.next();
        selectCase=selectCase.toUpperCase();
        if(selectCase.equals("S") && combat(obsNumber)){
                System.out.println(this.getName()+"tüm düşmanları yendiniz !");

                return true;
            }
         if(this.getPlayer().getHealth()<=0){
             System.out.println("öldünüz");
            return false;
        }
        return true;
    }
    public boolean combat(int obsNumber){
        for(int i=1;i<obsNumber;i++){
            this.getMonster().setHealth(this.getMonster().getOrjhealth());
            playerStats();
            ObstacleStats(i);
            while (this.getPlayer().getHealth()>0 && this.getMonster().getHealth()>0 ){
                System.out.println("<V>ur veya <K>aç : ");
                String selectcombat=input.next().toUpperCase();

               // randomhit();

                if(selectcombat.equals("V")){
                    System.out.println("Siz vurdunuz !");
                    monster.setHealth(this.monster.getHealth()-this.getPlayer().getTotaldamage());
                    afterHit();
                    if(this.getMonster().getHealth()>0){
                        System.out.println();
                        System.out.println("Canavar size vurdu !");
                        int obstacledamge=this.getMonster().getDamage()-this.getPlayer().getInventory().getArmor().getBlock();
                        if(obstacledamge<0){
                            obstacledamge=0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth()- obstacledamge);
                        afterHit();

                    }
                    }
                else {
                    return false;
                }
            }   if(this.getMonster().getHealth()<this.getPlayer().getHealth()){
                System.out.println( " Düşmanı yendiniz ");
                System.out.println(this.getMonster().getAward()+ " para kazandız !");
                this.getPlayer().setMoney(this.player().getMoney()+this.monster.getAward());
                System.out.println("Güncel Paranız : "+this.getPlayer().getMoney());
            }else {
                return false;
            }

        }
        return true;

    }
    public void ObstacleStats(int i){
        System.out.println(i+"."+this.getMonster().getName() + " değerleri ");
        System.out.println("------------");
        System.out.println("sağlık : "+ this.getMonster().getHealth());
        System.out.println("hasar : "+this.getMonster().getDamage());
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
  /*  public int randomhit(){
        Random r=new Random();
        return r.nextInt(this.getChance()+101);
    }*/

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

    public int getMaxobstacle() {
        return maxobstacle;
    }

    public void setMaxobstacle(int maxobstacle) {
        this.maxobstacle = maxobstacle;
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }
}
