package src.maceraoyunu;

import java.util.Scanner;

public class Game  {
    public String location;
    private Scanner input=new Scanner(System.in);

    public void start(){
        System.out.println("Macera oyununa hoşgeldiniz ! ");
       /* System.out.println("Lütfen bir isim giriniz : ");
        String playerName= input.nextLine();*/
        Player player = new Player("cem");
        System.out.println(" Sayın " + player.getName() + " bu karanlık ve sisli adaya hoşgeldiniz !!");
        System.out.println(" burada yaşananların hepsi gerçek ! ");
        System.out.println("lütfen bir karakter seçiniz ");
        player.selectChar();
        Location location =null;
        Location cave = new Cave(player);
        Location forest = new Forest(player);
        Location river = new River(player);;
        Location coal=new Coal(player);
        while(true) {
            player.PrintInfo();
            System.out.println();
            System.out.println("###########Bölgeler########## ");
            System.out.println();
            System.out.println("1-güvenli ev -->Burası sizin için güvenli bir ev düşman yoktur !");
            System.out.println("2-Eşya dükkanı --> Buradan Silah veya Zırh satın alabilirsiniz !");
            System.out.println("3-mağara --> ödül <Yemek>  ,dikkatli ol canavar çıkabilir !");
            System.out.println("4-Orman --> ödül <Odun> ,dikkatli ol canavar çıkabilir !");
            System.out.println("5-Nehir --> ödül <Su> ,dikkatli ol canavar çıkabilir !");
            System.out.println("6-Maden --> ödül <para eşya silah> ,dikkatli ol canavar çıkabilir !");
            System.out.println("0-Çıkış yap --> oyunu sonlandır !");
            System.out.println("Lütfen gitmek istediğiniz bölgeyi seçiniz ");
            int selecloc = input.nextInt();
            switch (selecloc) {
                case 0:
                    location=null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location=cave;
                    break;
                case 4:
                    location=forest;
                    break;
                case 5:
                    location=river;
                    break;
                case 6:
                    location=coal;
                    break;
                case 7:
                    player.getInventory().setFood(true);
                    player.getInventory().setWater(true);
                    player.getInventory().setFirewood(true);
                    break;
                default:
                    System.out.println("lütfen geçerli bir bölge giriniz ! ");
            }
            if(location==null){
                System.out.println("Bu karanlık ve sisli adadan çabuk vazgeçtin . ");
                break;
            }
            if(player.getInventory().isFood() && player.getInventory().isWater() && player.getInventory().isFirewood()){
                System.out.println("oyunu kazandınız oyun bitti tebrikler .");
                break;
            }
            if(!location.onLocation()){
                System.out.println(" GAME OVER ! ");
                break;
            }
        }
    }

}