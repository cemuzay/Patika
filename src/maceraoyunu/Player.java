package src.maceraoyunu;

import java.util.Scanner;

public class Player {
    private String name;
    private String Character;
    private int damage;
    private int health;
    private int money;
    private Inventory inventory;
    private int orjhealth;
    private Scanner input = new Scanner(System.in);

    public Player(String name, String character, int damage, int health, int money) {
        this.name = name;
        this.Character = character;
        this.damage = damage;
        this.health = health;
        this.money = money;

    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Player(String name) {
        this.name = name;
        this.inventory=new Inventory();
    }

    public Player() {

    }

    public void selectChar() {
        Samurai samurai = new Samurai();
        Knight knight = new Knight();
        Archer archer = new Archer();

        GameChar[] charlist = {new Samurai(), new Archer(), new Knight()};
        System.out.println("Karakterler");
        System.out.println("--------------------");
        for (GameChar gameChar : charlist) {
            System.out.println(" Id : " + gameChar.getId() + " \tKarakter: " + gameChar.getName() + "\t hasar: \t" + gameChar.getDamage() + " \t sağlık:" + gameChar.getHealth() + "\t para :" + gameChar.getMoney());
        }
        System.out.println("---------------------");
        System.out.println("lütfen bir karakter seçiniz : ");
        int selectchar = input.nextInt();
        switch (selectchar) {
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
        }
        System.out.println(" Karakter : " + this.getCharacter() + " , Hasar : " + this.getDamage() + " , sağlık " + this.getHealth() + " , para " + getMoney());
    }


    public void initPlayer(GameChar gameChar){
            this.setDamage(gameChar.getDamage());
            this.setHealth(gameChar.getHealth());
            this.setOrjhealth(gameChar.getHealth());
            this.setMoney(gameChar.getMoney());
            this.setCharacter(gameChar.getName());

    }
    public void PrintInfo(){
        System.out.println("Silahınız : " + this.getInventory().getWeapon().getName()+
                ",Zırh : "+ this.getInventory().getArmor().getName()+
                ",Bloklama " + this.getInventory().getArmor().getBlock()+
                ",Hasarınız : " + this.getDamage()+
                ",sağlık : " + this.getHealth() +
                " ,para "+ this.getMoney());
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacter() {
        return Character;
    }

    public void setCharacter(String character) {
        Character = character;
    }

    public int getDamage() {
        return damage+ this.getInventory().getWeapon().getDamage();
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health<0){
            health=0;
        }
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public Weapon getWeapon(){
        return this.getInventory().getWeapon();
    }
    public int getTotaldamage(){
        return damage+this.getInventory().getWeapon().getDamage();
    }

    public int getOrjhealth() {
        return orjhealth;
    }

    public void setOrjhealth(int orjhealth) {
        this.orjhealth = orjhealth;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }
}
