package AbstractFactoryDesign.Animal;

public class CrowHabitat implements AnimalFactory{
    public Animal aboutAnimal() {
        return new Crow();
    }

    public Habitat aboutHabitat() {
        return new Air();
    
}
}
