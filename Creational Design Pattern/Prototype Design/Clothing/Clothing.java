import java.util.ArrayList;
import java.util.List;

class Clothing implements Cloneable {
    private List<String> clothingList;

    public Clothing() {
        this.clothingList = new ArrayList<>();
    }

    public void insertData() {
        clothingList.add("T-Shirt");
        clothingList.add("Jeans");
        clothingList.add("Jacket");
    }

    public List<String> getClothingList() {
        return clothingList;
    }

    public void addClothing(String clothingItem) {
        clothingList.add(clothingItem);
    }

    public void modify(String oldItem, String newItem) {
        int index = clothingList.indexOf(oldItem);
        if (index != -1) {
            clothingList.set(index, newItem);
            System.out.println("\nModification successful.");
        } else {
            System.out.println("\n"+oldItem + " not found in the clothing list.");
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Clothing clonedClothing = (Clothing) super.clone();
        clonedClothing.clothingList = new ArrayList<>(this.clothingList);
        return clonedClothing;
    }
}

