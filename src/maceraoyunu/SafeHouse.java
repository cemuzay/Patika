package src.maceraoyunu;

public class SafeHouse  extends Normallocation{
    public SafeHouse(Player player) {
        super(player, "Güvenli Ev");
    }
    @Override
    public boolean onLocation() {
        System.out.println("Güvenli evdesiniz !");
        System.out.println("canınız yenilendi !");
        return true;
    }
}
