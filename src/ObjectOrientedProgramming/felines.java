package src.ObjectOrientedProgramming;

public class felines extends Animal{
    public felines(String name,int age,double weight) {
        super(name, age, weight);
    }

    class Cat extends Animal{

        public Cat(String name, int age, double weight) {
            super(name, age, weight);
        }
        @Override
        public void speak(){
            System.out.println(getName()+"miyavlıyor...");
        }
    }
    class  Tiger extends Animal{

        public Tiger(String name, int age, double weight) {
            super(name, age, weight);
        }
        @Override
        public  void speak(){
            System.out.println(getName()+" Kükrüyor ");
        }
    }
}
