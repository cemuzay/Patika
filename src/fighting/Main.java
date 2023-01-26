package src.fighting;

public class Main {
    public static void main(String[] args) {
        Fighther f1=new Fighther("a",10,120,100,30);
        Fighther f2=new Fighther("b",20,85,85,40);
        Match match=new Match(f1,f2,85,100);
        match.run();
    }

}
