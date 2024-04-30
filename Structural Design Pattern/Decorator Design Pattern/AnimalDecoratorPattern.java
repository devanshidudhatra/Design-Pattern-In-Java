interface Animal {
    String getDescription();

    double getWeight();
}

// Concrete Component
class BaseAnimal implements Animal {
    private String description;
    private double weight;

    public BaseAnimal(String description, double weight) {
        this.description = description;
        this.weight = weight;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}

// Decorator abstract class
abstract class AnimalDecorator implements Animal {
    protected Animal decoratedAnimal;

    public AnimalDecorator(Animal decoratedAnimal) {
        this.decoratedAnimal = decoratedAnimal;
    }

    @Override
    public String getDescription() {
        return decoratedAnimal.getDescription();
    }

    @Override
    public double getWeight() {
        return decoratedAnimal.getWeight();
    }
}

// Concrete decorators
class SoundDecorator extends AnimalDecorator {
    private String sound;

    public SoundDecorator(Animal decoratedAnimal, String sound) {
        super(decoratedAnimal);
        this.sound = sound;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", makes sound: " + sound;
    }
}

class ColorDecorator extends AnimalDecorator {
    private String color;

    public ColorDecorator(Animal decoratedAnimal, String color) {
        super(decoratedAnimal);
        this.color = color;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", has color: " + color;
    }
}

public class AnimalDecoratorPattern {
    public static void main(String[] args) {
        // Create a base animal
        Animal animal = new BaseAnimal("Lion", 200.0);
        System.out.println("Description: " + animal.getDescription() + ", Weight: " + animal.getWeight());

        // Decorate the animal with sound
        Animal roaringLion = new SoundDecorator(animal, "Roar");
        System.out.println("Description: " + roaringLion.getDescription() + ", Weight: " + roaringLion.getWeight());

        // Decorate the animal with color
        Animal colorfulLion = new ColorDecorator(animal, "Golden");
        System.out.println("Description: " + colorfulLion.getDescription() + ", Weight: " + colorfulLion.getWeight());

        // Decorate the animal with sound and color
        Animal roaringColorfulLion = new SoundDecorator(new ColorDecorator(animal, "Golden"), "Roar");
        System.out.println("Description: " + roaringColorfulLion.getDescription() + ", Weight: "
                + roaringColorfulLion.getWeight());
    }
}
