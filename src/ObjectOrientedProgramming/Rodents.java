package src.ObjectOrientedProgramming;

public class Rodents extends Animal{
    public Rodents(String name, int age, double weight) {
        super(name, age, weight);
    }

    class Hamster extends Rodents{

        public Hamster(String name, int age, double weight) {
            super(name,age, weight);
        }
        @Override
        public void speak(){
            System.out.println(getName()+" Cıvıldıyor...");
        }
    }
    class rat extends Rodents{

        public rat(String name, int age, double weight) {
            super(name, age, weight);
        }
        @Override
        public void speak(){
            System.out.println(getName()+"cıvıldıyor...");
        }
    }
}
