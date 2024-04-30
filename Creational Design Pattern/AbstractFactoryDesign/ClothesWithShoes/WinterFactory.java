public class WinterFactory implements ClothFactory{
    public Clothes createClothes() {
        return new Winter();
    }

    public Shoes createShoes() {
        return new Sneakers();
    }
}
