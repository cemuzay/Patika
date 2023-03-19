package src.maceraoyunu;

public class Cave extends BattleLoc{
    Player player1 =new Player();
    public Cave(Player player) {
        super(player, "Mağara",new Zombie(),"food",2,"cave");
    }
}
