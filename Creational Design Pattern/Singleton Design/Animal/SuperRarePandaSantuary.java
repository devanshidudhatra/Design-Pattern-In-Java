public class SuperRarePandaSantuary {
    
    private static SuperRarePandaSantuary instance;
    private String pandaName;

    // Private constructor to prevent instantiation from outside
    private SuperRarePandaSantuary() {
        pandaName = "Super Rare Panda";
    }

    // Public method to get the singleton instance
    public static SuperRarePandaSantuary getInstance() {
        if (instance == null) {
            instance = new SuperRarePandaSantuary();
        }
        return instance;
    }

    // Method to get the name of the Super Rare Panda
    public String getPandaName() {
        return pandaName;
    }

    public static void main(String[] args) {
        // Getting an instance of the Super Rare Panda Sanctuary
        SuperRarePandaSantuary sanctuary1 = SuperRarePandaSantuary.getInstance();

        // Accessing the name of the Super Rare Panda
        System.out.println("Visitor 1 sees: " + sanctuary1.getPandaName());

        // Another visitor getting the same instance
        SuperRarePandaSantuary sanctuary2 = SuperRarePandaSantuary.getInstance();

        // Both visitors see the same Super Rare Panda
        System.out.println("Visitor 2 also sees: " + sanctuary2.getPandaName());

        
    }
}
