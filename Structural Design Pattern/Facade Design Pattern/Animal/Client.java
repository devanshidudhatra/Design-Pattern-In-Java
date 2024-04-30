import java.util.*;

enum AnimalType {
    DOG,
    CAT
}

interface Animal {
    void createAnimal(String characteristics);
    String deliverAnimal();
}

class AnimalCharacteristics {
    public String getDogCharacteristics() {
        return "Barks, loyal, furry";
    }

    public String getCatCharacteristics() {
        return "Meows, independent, agile";
    }
}

class Dog implements Animal {
    private String finalAnimal;

    @Override
    public void createAnimal(String characteristics) {
        finalAnimal = "Dog with characteristics: " + characteristics;
    }

    @Override
    public String deliverAnimal() {
        return finalAnimal;
    }
}

class Cat implements Animal {
    private String finalAnimal;

    @Override
    public void createAnimal(String characteristics) {
        finalAnimal = "Cat with characteristics: " + characteristics;
    }

    @Override
    public String deliverAnimal() {
        return finalAnimal;
    }
}

class PetStore {
    // Facade which hides the implementation
    public static String deliverAnimal(AnimalType animalType) {
        AnimalCharacteristics characteristics = new AnimalCharacteristics();
        switch (animalType) {
            case DOG:
                Animal dog = new Dog();
                String dogCharacteristics = characteristics.getDogCharacteristics();
                dog.createAnimal(dogCharacteristics);
                return dog.deliverAnimal();

            case CAT:
                Animal cat = new Cat();
                String catCharacteristics = characteristics.getCatCharacteristics();
                cat.createAnimal(catCharacteristics);
                return cat.deliverAnimal();
        }
        return null;
    }
}

class Client {
    public static void main(String[] args) {
        // Using facade
        System.out.println("-----------------Facade-------------------");
        System.out.println(PetStore.deliverAnimal(AnimalType.DOG));
        System.out.println(PetStore.deliverAnimal(AnimalType.CAT));
    }
}
