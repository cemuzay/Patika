package src.maceraoyunu;
public class Normallocation extends Location {
    public Normallocation(Player player,String name) {
        super(player,"");
    }

    @Override
    public boolean onLocation() {
        return false;
    }
}
