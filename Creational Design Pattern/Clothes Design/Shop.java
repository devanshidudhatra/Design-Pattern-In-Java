public class Shop {
    public static void main(String[] args) {
        // Using the ClothingBuilder to create instances of different types of clothing
        Clothing shirt = new ClothingBuilder().setBrand("Nike").setSize("M").setColor("Blue").setHasPockets(true).getShirt();
        System.out.println(shirt);

        ClothingBuilder pantsBuilder = new ClothingBuilder();
        pantsBuilder.setBrand("Adidas");
        pantsBuilder.setSize("L");
        pantsBuilder.setColor("Black");
        pantsBuilder.setHasPockets(false);
        Pants pants = pantsBuilder.getPants();
        System.out.println(pants);
    }
}