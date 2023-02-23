package src.maceraoyunu;

public class ToolStore extends Normallocation{
    public ToolStore(Player player) {
        super(player,"mağaza");
    }
    @Override
    public boolean onLocation() {
        System.out.println("Mağazaya hoşgeldiniz ! ");
        System.out.println("1- Silahlar");
        System.out.println("2- Zırhlar");
        System.out.println("3- Çıkış Yap");
        int selectcase=input.nextInt();
        System.out.println("Seçiminiz : ");
        while(selectcase<1 || selectcase>3){
            System.out.println("Geçersiz değer,tekrar giriniz : ");
            selectcase=input.nextInt();

        }
        switch (selectcase){
            case 1:
                printweapon();
                buyWeapon();
                break;
            case 2:
                printarmor();
                break;
            case 3:
                return true;
        }
        return true;
    }
    public void printweapon() {
        System.out.println("-------Silahlar------");

        for (Weapon w : Weapon.weapons()) {
            System.out.println(w.getName() + " <Para : " + w.getPrice() + ", Hasar : " + w.getDamage());
        }
    }

        public void buyWeapon() {
            System.out.println("Bir silah seçiniz : ");
            int selectedweaponId = input.nextInt();
            while (selectedweaponId < 1 || selectedweaponId > Weapon.weapons().length) {
                System.out.println("Geçersiz değer ,tekrar giriniz :");
                selectedweaponId = input.nextInt();
            }

            Weapon selectedweapon = Weapon.getweaponobjbyid(selectedweaponId);
            if (selectedweapon != null) {
                if (selectedweapon.getPrice() > this.player().getMoney()) {
                    System.out.println(" Yeterli paranız bulunmamaktadır.");
                } else {
                    //satın almanın gerçekleştiği alan
                    System.out.println(selectedweapon.getName() + " Silahı satın aldınız ! ");
                    int balance = this.player().getMoney() - selectedweapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan paranız : " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setWeapon(selectedweapon);
                }
            }
        }
    public void printarmor () {
        System.out.println("Silahlar");

    }
}
