package AbstractFactoryDesign.Animal;

public class WhaleHabitat implements AnimalFactory{
    public Animal aboutAnimal() {
        return new Whale();
    }

    public Habitat aboutHabitat() {
        return new Water();
    }
}
