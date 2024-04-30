public class Shirts implements Clothes {
    @Override
    public void size() {
        System.out.println("All the sizes are available...");
    }

    @Override
    public void prize() {
        System.out.println("Prices start from Rs.200 ");
    }

    @Override
    public void colour() {
        System.out.println("All colours are available...");
    }
}
