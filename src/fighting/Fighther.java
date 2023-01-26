package src.fighting;

public class Fighther {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    Fighther(String name,int damage,int health,int weight,int dodge){
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        this.dodge=dodge;
        if(dodge>=0 && dodge<=100){
            this.dodge=dodge;
        }else{
            this.dodge=0;
        }
    }
    int hit(Fighther opponent){
        System.out.println(this.name+" => "+ opponent.name+" " + this.damage + " hasar vurdu.");
        if(isdodge()){
            System.out.println(opponent.name + " gelen hasarı blokladı! ");
            System.out.println("-----------------------");
        }
            if(opponent.health-this.damage<0){

              return 0;
            }
        return opponent.health-this.damage;
    }
    boolean isdodge(){
        double random=Math.random()*100;
        return random<=this.dodge;
    }
}
