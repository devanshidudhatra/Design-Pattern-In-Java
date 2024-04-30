package AbstractFactoryDesign.Animal;

public class Main {
    public static void main(String[] args) {
        AnimalFactory cowHabitat = new CowHabitat();
        Animal cow = cowHabitat.aboutAnimal();
        Habitat land = cowHabitat.aboutHabitat();
        System.out.println("About Cow:");
        cow.name();
        land.type();
        land.info();

        AnimalFactory crowHabitat = new CrowHabitat();
        Animal crow = crowHabitat.aboutAnimal();
        Habitat air = crowHabitat.aboutHabitat();
        System.out.println("About Crow:");
        crow.name();
        air.type();
        air.info();

        AnimalFactory whaleHabitat = new WhaleHabitat();
        Animal whale = whaleHabitat.aboutAnimal();
        Habitat water = whaleHabitat.aboutHabitat();
        System.out.println("About Whale:");
        whale.name();
        water.type();
        water.info();
    }
}