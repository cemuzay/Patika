package src.ObjectOrientedProgramming;

public class Main {
    public static void main(String[] args) {
        Animal animal=new Animal("asf",124,140);
       felines felines=new felines("cem",10,20);

        System.out.println(" ismi " +felines.getName()+" yaşı  "+felines.getAge()+" kilosu "+ felines.getWeight() );
        felines.speak();
    }
}
