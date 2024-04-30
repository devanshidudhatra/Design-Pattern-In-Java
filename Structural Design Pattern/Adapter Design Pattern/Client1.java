// Target interface
interface Clothes {
    void wear();
}

// Adaptee interface
interface Cloth {
    void wrap();
}

// Adaptee
class Shirt implements Cloth {
    public void wrap() {
        System.out.println("Wrapping shirt.");
    }
}

// Adaptee
class Trouser implements Cloth {
    public void wrap() {
        System.out.println("Wrapping trouser.");
    }
}

// Adapter
class ClothesAdapter implements Clothes {
    private Cloth cloth;

    public ClothesAdapter(Cloth cloth) {
        this.cloth = cloth;
    }

    public void wear() {
        cloth.wrap();
    }
}

// Client
class Person {
    private Clothes clothes;

    public Person(Clothes clothes) {
        this.clothes = clothes;
    }

    public void getDressed() {
        clothes.wear();
    }
}

// Main
class Client1 {
    public static void main(String[] args) {
        Cloth shirt = new Shirt();
        ClothesAdapter shirtAdapter = new ClothesAdapter(shirt);
        Person person1 = new Person(shirtAdapter);
        person1.getDressed();

        Cloth trouser = new Trouser();
        ClothesAdapter trouserAdapter = new ClothesAdapter(trouser);
        Person person2 = new Person(trouserAdapter);
        person2.getDressed();
    }
}
