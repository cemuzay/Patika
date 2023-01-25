package src.src;

public class Car {

    String type;
    String model;
    String color;
    int speed;

    public  int speedincrease(int increment){
        if(speed<180){
            speed+=increment;
        }
        return speed;
    }
    public int decreasespeed(int decrement){
        if(speed>0){
            speed-=decrement;
        }
        return speed;
    }
    public void printspeed(){
        System.out.println("hızınız "+speed);
    }
    public static void main(String[] args) {
        Car car=new Car();
        car.speed=10;
        car.type="sedan";
        car.color="gray";
        car.model="insignia";
        car.speedincrease(10);
        car.printspeed();

    }
}

