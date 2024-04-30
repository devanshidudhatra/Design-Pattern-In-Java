public class Clothing {
    private String brand;
    private String material;
    private String size;
    private String color;
    private boolean hasPockets;

    public Clothing(String brand, String material, String size, String color, boolean hasPockets) {
        this.brand = brand;
        this.material = material;
        this.size = size;
        this.color = color;
        this.hasPockets = hasPockets;
    }

    @Override
    public String toString() {
        return "Clothing [brand = " + brand + ", material = " + material + " , size = " + size +
                " , color = " + color + ", hasPockets = " + hasPockets + "]";
    }
}
