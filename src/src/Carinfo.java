package src.src;

public class Carinfo {
    public static void main(String[] args) {
        Car audi=new Car();
        Car opel=new Car();
        Car bmw=new Car();
        Car mercedes=new Car();

        audi.model="a3";
        audi.speed=150;
        audi.type="hatchback";
        audi.color="red";

        opel.color="Gray";
        opel.type="sedan";
        opel.speed=268;
        opel.model="insignia";

       bmw.model="3.20";
       bmw.type="sedan";
       bmw.color="gray";
       bmw.speed=250;

       mercedes.speed=250;
       mercedes.type="sedan";
       mercedes.model="c200d";
       mercedes.color="gray";

        audi.speedincrease(20);
        audi.printspeed();

    }
}
