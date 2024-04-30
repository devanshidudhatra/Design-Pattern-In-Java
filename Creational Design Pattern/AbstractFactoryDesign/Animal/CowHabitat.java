package AbstractFactoryDesign.Animal;
public class CowHabitat implements AnimalFactory{
    public Animal aboutAnimal() {
        return new Cow();
    }

    public Habitat aboutHabitat() {
        return new Land();
    
}
}