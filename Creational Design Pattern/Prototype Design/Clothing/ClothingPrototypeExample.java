public class ClothingPrototypeExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Clothing originalClothing = new Clothing();
        originalClothing.insertData();

        Clothing clonedClothing = (Clothing) originalClothing.clone();
        System.out.println("\nOriginal Clothing: " + originalClothing.getClothingList());
        System.out.println("\nCloned Clothing: " + clonedClothing.getClothingList());

        // Additional methods without user input
        clonedClothing.addClothing("Sweater");
        System.out.println("\nCloned Clothing after addition: " + clonedClothing.getClothingList());

        clonedClothing.modify("T-Shirt", "Polo Shirt");
        System.out.println("\nCloned Clothing after modification: " + clonedClothing.getClothingList());

        clonedClothing.getClothingList().remove("Jacket");
        System.out.println("\nCloned Clothing after removal: " + clonedClothing.getClothingList());

        System.out.println("\nOriginal Clothing: " + originalClothing.getClothingList());
    }
}
