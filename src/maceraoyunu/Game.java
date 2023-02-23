package src.maceraoyunu;

import java.util.Scanner;

public class Game  {
    public String location;
    private Scanner input=new Scanner(System.in);

    public void start(){
        System.out.println("Macera oyununa hoşgeldiniz ! ");
        System.out.println("Lütfen bir isim giriniz : ");
        String playerName= input.nextLine();
        Player player=new Player(playerName);
        System.out.println(" Sayın " + player.getName() + " bu karanlık ve sisli adaya hoşgeldiniz !!");
        System.out.println(" burada yaşananların hepsi gerçek ! ");
        System.out.println("lütfen bir karakter seçiniz ");
        player.selectChar();
        Location location = null;
        while(true) {
            System.out.println();
            System.out.println("###########Bölgeler########## ");
            System.out.println();
            System.out.println("1-güvenli ev -->Burası sizin için güvenli bir ev düşman yoktur !");
            System.out.println("2-mağaza --> Buradan Silah veya Zırh satın alabilirsiniz !");
            System.out.println("Lütfen gitmek istediğiniz bölgeyi seçiniz ");
            int selecloc = input.nextInt();
            switch (selecloc) {
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                default:
                    location = new SafeHouse(player);
            }

           if(!location.onLocation()){
               System.out.println(" GAME OVER ! ");
               break;
           }
        }
    }

}

