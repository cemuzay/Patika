package src.ObjectOrientedProgramming;

public class Animal  {
    private String name;
    private int age;
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void speak(){
        System.out.println("hayvan konuşuyor.");
    }
    public void getDosage(){
        System.out.println("dozaj verilecek");
    }
    public void getFeedSchedule(){

    }
    class Bird extends Animal{

        public Bird(String name) {
            super(name, age, weight);
        }

        @Override
        public void speak() {
            System.out.println(getName()+" ötüyor...");
        }
    }
    class Horses extends Animal{

        public Horses(String name) {
            super(name, age, weight);
        }
        @Override
        public void speak(){
            System.out.println(getName()+"Kişniyor...");
        }
    }

}
