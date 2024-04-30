import java.util.*;

// Target
interface Clothes{
    void wear();
}

// Adaptee
interface Cloth{
    void wrap();
}
class Shirt implements Cloth{
    public void wrap(){
        System.out.println("Wrapping Shirt");
    }
}
class Pant implements Cloth{
    public void wrap(){
        System.out.println("Wrapping Pant");
    }
}

// Adapter
class ClothAdapter implements Clothes{
    public Cloth cloth;

    // Constructor
    public ClothAdapter(Cloth cloth){
        this.cloth = cloth;
    }

    public void wear(){
        cloth.wrap();
    }
}

// Client
class Person{
    public Clothes clothes;

    // Construxtor
    public Person(Clothes clothes){
        this.clothes = clothes;
    }

    public void getDressed(){
        clothes.wear();
    }
}

class Adapter_Test {
    public static void main(String[] args){
        Cloth shirt = new Shirt();
        ClothAdapter shirtAdapter = new ClothAdapter(shirt);
        Person p1 = new Person(shirtAdapter);
        p1.getDressed();

        Cloth pant = new Pant();
        ClothAdapter pantAdapter = new ClothAdapter(pant);
        Person p2 = new Person(pantAdapter);
        p2.getDressed();
    }
}
