import java.util.HashMap;

// Flyweight interface
interface Animal {
    void makeSound();
}

// Concrete Flyweight
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog: Woof");
    }
}

// Concrete Flyweight
class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat: Meow");
    }
}

// Flyweight Factory
class AnimalFactory {
    private static final HashMap<String, Animal> animalMap = new HashMap<>();

    public static Animal getAnimal(String species) {
        Animal animal = animalMap.get(species);

        if (animal == null) {
            switch (species) {
                case "dog":
                    animal = new Dog();
                    break;
                case "cat":
                    animal = new Cat();
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported animal species: " + species);
            }
            animalMap.put(species, animal);
            System.out.println("Creating " + species);
        }
        return animal;
    }
}

// Client
public class AnimalFlyweight {
    private static final String[] species = { "dog", "cat", "dog", "cat", "dog" };

    public static void main(String[] args) {
        for (String animalSpecies : species) {
            Animal animal = AnimalFactory.getAnimal(animalSpecies);
            animal.makeSound();
        }
    }
}
