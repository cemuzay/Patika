package src.fighting;

public class Main {
    public static void main(String[] args) {
        Fighther f1=new Fighther("player1",20,120,90,30);
        Fighther f2=new Fighther("player2",10,85,60,20);
        Match match=new Match(f1,f2,60,100);
        match.run();
    }

}
