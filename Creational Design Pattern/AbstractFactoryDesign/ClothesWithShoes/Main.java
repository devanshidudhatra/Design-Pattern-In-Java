public class Main1{
    public static void main(String[] args) {
        ClothFactory SummerFactory = new SummerFactory();
        Clothes summer = SummerFactory.createClothes();
        Shoes loafers = SummerFactory.createShoes();

        System.out.println("\nClothes to wear in Summer...");
        summer.tops();
        summer.bottoms();
        summer.jacket();
        loafers.type();

        ClothFactory WinterFactory = new WinterFactory();
        Clothes winter = WinterFactory.createClothes();
        Shoes sneakers = WinterFactory.createShoes();

        System.out.println("\nClothes to wear in Winter...");
        winter.tops();
        winter.bottoms();
        winter.jacket();
        sneakers.type();
        
        ClothFactory MonsoonFactory = new MonsoonFactory();
        Clothes monsoon = MonsoonFactory.createClothes();
        Shoes boots = MonsoonFactory.createShoes();

        System.out.println("\nClothes to wear in Monsoon...");
        monsoon.tops();
        monsoon.bottoms();
        monsoon.jacket();
        boots.type();
    }
}