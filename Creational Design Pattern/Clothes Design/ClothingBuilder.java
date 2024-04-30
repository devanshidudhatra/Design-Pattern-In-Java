public class ClothingBuilder {
    private String brand;
    private String material;
    private String size;
    private String color;
    private boolean hasPockets;

    public ClothingBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public ClothingBuilder setMaterial(String material) {
        this.material = material;
        return this;
    }

    public ClothingBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    public ClothingBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public ClothingBuilder setHasPockets(boolean hasPockets) {
        this.hasPockets = hasPockets;
        return this;
    }

    public Clothing getClothing() {
        return new Clothing(brand, material, size, color, hasPockets);
    }

    public Shirt getShirt() {
        return new Shirt(brand, material, size, color, hasPockets, "Short Sleeve");
    }

    public Pants getPants() {
        return new Pants(brand, material, size, color, hasPockets, "Slim Fit");
    }
}

