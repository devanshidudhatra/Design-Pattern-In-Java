package Animal;

import java.util.ArrayList;
import java.util.List;

interface Component {
    void showName();
    String getName();
}

class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void showName() {
        System.out.println("Leaf: " + getName());
    }

    @Override
    public String getName() {
        return name;
    }
}

class Composite implements Component {
    private String name;
    private List<Component> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    @Override
    public void showName() {
        System.out.println("Composite: " + getName());
        for (Component component : components) {
            component.showName();
        }
    }

    @Override
    public String getName() {
        return name;
    }
}

public class CompositeTest1 {
    public static void main(String[] args){
        Component Fish = new Leaf("Fish");
        Component Amphibian = new Leaf("Amphibian");
        Component Reptile = new Leaf("Reptile");
        Component Birds = new Leaf("Birds");
        Component Rodents = new Leaf("Rodents");
        Component Primates = new Leaf("Primates");
        Component Seals = new Leaf("Seals");
        Component Anthropods = new Leaf("Anthropods");
        Component Annelids = new Leaf("Annelids");
        Component Protozoa = new Leaf("Protozoa");
        Component Mollusks = new Leaf("Mollusks");

        Composite Animal = new Composite("Animal");
        Composite Vertebrates = new Composite("Vertebrates");
        Composite InVertebrates = new Composite("In Vertebrates");
        Composite Mammals = new Composite("Mammals");

        Mammals.addComponent(Rodents);
        Mammals.addComponent(Seals);
        Mammals.addComponent(Primates);

        InVertebrates.addComponent(Anthropods);
        InVertebrates.addComponent(Annelids);
        InVertebrates.addComponent(Protozoa);
        InVertebrates.addComponent(Mollusks);

        Vertebrates.addComponent(Fish);
        Vertebrates.addComponent(Amphibian);
        Vertebrates.addComponent(Reptile);
        Vertebrates.addComponent(Birds);
        Vertebrates.addComponent(Mammals);

        Animal.addComponent(Vertebrates);
        Animal.addComponent(InVertebrates);

        Fish.showName();
        Mammals.showName();

        Animal.showName();
    }
}
