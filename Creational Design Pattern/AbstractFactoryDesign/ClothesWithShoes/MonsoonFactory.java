public class MonsoonFactory implements ClothFactory {
    public Clothes createClothes() {
        return new Monsoon();
    }

    public Shoes createShoes() {
        return new GumBoots();
    }
}
