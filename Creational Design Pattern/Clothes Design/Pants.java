public class Pants extends Clothing {
    private String fit;

    public Pants(String brand, String material, String size, String color, boolean hasPockets, String fit) {
        super(brand, material, size, color, hasPockets);
        this.fit = fit;
    }

    @Override
    public String toString() {
        return "Pants [fit = " + fit + ", " + super.toString() + "]";
    }
}