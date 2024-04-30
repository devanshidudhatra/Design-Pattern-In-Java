import java.util.*;

interface Components{
    void showPrice();
    int getPrice();
}

class Leaf implements Components{
    int price;
    String name;

    // Constructor
    public Leaf(int price , String name){
        this.price = price;
        this.name = name;
    }

    public int getPrice(){
        return price;
    }

    public void showPrice(){
        System.out.println("Leaf ->" + name+ ", Price -> " + price);
    }
}

class Composite implements Components{
    String name;
    List<Components> components = new ArrayList<>();

    public Composite(String name){
        super();
        this.name = name;
    }

    public void addComponents(Components c){
        components.add(c);
    }

    public int getPrice(){
        int p = 0;
        for(Components c: components){
            p += c.getPrice();
        }
        return p;
    }

    public void showPrice(){
        System.out.println("Composite -> " + name+ ", Price -> " + getPrice());
    }
}
class Composite_Test {
    public static void main(String[] args) {
        Components hd = new Leaf(4000 , "Hard Disc");
        Components mouse = new Leaf(2000 , "Mouse");
        Components monitor = new Leaf(1000 , "Monitor");
        Components ram = new Leaf(3000 , "RAM");
        Components cpu = new Leaf(40000 , "CPU");

        Composite peri = new Composite("Peri");
        Composite cab = new Composite("Cabinet");
        Composite mb = new Composite("Mother Board");
        Composite c = new Composite("Computer");

        mb.addComponents(cpu);
        mb.addComponents(ram);

        peri.addComponents(mouse);
        peri.addComponents(cpu);

        cab.addComponents(hd);
        cab.addComponents(mb);

        c.addComponents(peri);
        c.addComponents(cab);

        ram.showPrice();
        peri.showPrice();
        c.showPrice();
    }
}
