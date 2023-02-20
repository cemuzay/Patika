package src.Java102;

public class Main {
    public static void main(String[] args) {
        Book harrypotter=new Book("harrypotter",150);
        Book Lordoftherings=new Book("lordoftherings",-100);
        System.out.println(Lordoftherings.setPagenumber(500));
        System.out.println(Lordoftherings.getPagenumber());
        System.out.println(harrypotter.getName());
    }
}
