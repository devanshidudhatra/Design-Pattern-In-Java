public class Shirt extends Clothing {
    private String sleeveType;

    public Shirt(String brand, String material, String size, String color, boolean hasPockets, String sleeveType) {
        super(brand, material, size, color, hasPockets);
        this.sleeveType = sleeveType;
    }

    @Override
    public String toString() {
        return "Shirt [sleeveType = " + sleeveType + ", " + super.toString() + "]";
    }
}