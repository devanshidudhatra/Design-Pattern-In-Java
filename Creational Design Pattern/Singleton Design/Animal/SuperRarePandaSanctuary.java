public class SuperRarePandaSanctuary {
    private static SuperRarePandaSanctuary instance;
    private String pandaName;

    // Private constructor to prevent instantiation from outside
    private SuperRarePandaSanctuary() {
        pandaName = "Super Rare Panda";
    }

    // Public method to get the singleton instance
    public static SuperRarePandaSanctuary getInstance() {
        if (instance == null) {
            instance = new SuperRarePandaSanctuary();
        }
        return instance;
    }

    // Method to get the name of the Super Rare Panda
    public String getPandaName() {
        return pandaName;
    }

    // Method to feed the panda
    public void feedPanda() {
        System.out.println("Feeding " + pandaName + "...");
    }

    public static void main(String[] args) {
        // Getting an instance of the Super Rare Panda Sanctuary
        SuperRarePandaSanctuary sanctuary = SuperRarePandaSanctuary.getInstance();

        // First visitor
        System.out.println("Visitor 1 sees: " + sanctuary.getPandaName());

        // Feeding the panda
        sanctuary.feedPanda();

        // Creating a zookeeper
        SuperRareZookeeper zookeeper = new SuperRareZookeeper("John");
        zookeeper.performDuties();

        // Creating a panda caretaker
        SuperRarePandaCareTaker caretaker = new SuperRarePandaCareTaker("Alice");
        caretaker.performDuties();
    }
}

class SuperRareZookeeper {
    private String name;

    public SuperRareZookeeper(String name) {
        this.name = name;
    }

    public void performDuties() {
        System.out.println(name + " is taking care of the zoo and checking on the Super Rare Panda.");
    }
}

class SuperRarePandaCareTaker {
    private String name;

    public SuperRarePandaCareTaker(String name) {
        this.name = name;
    }

    public void performDuties() {
        System.out.println(name + " is taking care of the Super Rare Panda and making sure it's happy.");
    }
}
