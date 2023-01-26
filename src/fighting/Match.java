package src.fighting;

public class Match {
    Fighther f1;
    Fighther f2;
    int minweight;
    int maxweight;
    Match(Fighther f1,Fighther f2,int minweight,int maxweight){
        this.f1=f1;
        this.f2=f2;
        this.minweight=minweight;
        this.maxweight=maxweight;
    }
    public  void run(){
        System.out.println("yeni round");
        if(isCheck()){
        while (this.f1.health>0 && this.f2.health>0){
        f2.health= this.f1.hit(this.f2);
           if(iswin()){
               break;
           }
        this.f1.health=this.f2.hit(this.f1);
           if(iswin()){
               break;
           }
            System.out.println(this.f1.name + " sağlık : "+ this.f1.health);
            System.out.println(this.f2.name + " sağlık : "+ this.f2.health);

        }
        }else{
            System.out.println("Sporcuları sikletleri uymuyor. ");
        }
    }
    boolean isCheck(){
        return (this.f1.weight>=minweight && this.f1.weight<=maxweight) && (this.f2.weight>=minweight && this.f2.weight<=maxweight);
    }
    boolean iswin(){
        if(this.f1.health==0){
            System.out.println( f2.name + " kazandı. ");
            return true;
        }if(this.f2.health==0){
            System.out.println( f1.name + " kazandı.");
            return true;
        }
        return false;
    }
}

