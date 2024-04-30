public class SummerFactory implements ClothFactory{
    public Clothes createClothes(){
        return new Summer();
    }
    public Shoes createShoes(){
        return new Loafers();
    }
}
