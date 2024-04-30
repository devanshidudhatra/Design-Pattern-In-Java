package Clothes;

import java.util.*;

interface Component {
    void showPrice();
    int getPrice();
}

class Composite implements Component{
    String name;
    List<Component> components = new ArrayList();

    public Composite(String name){
        super();
        this.name = name;
    }

    public void addComponent(Component com){
        components.add(com);
    }

    @Override
    public int getPrice(){
        int p=0;
        for(Component c : components){
            p+=c.getPrice();
        }
        return p;
    }

    @Override
    public void showPrice(){
        System.out.println("Composite -> " + name + " : Price " + getPrice());
        System.out.println("Leaf of " + name);
        for(Component c:components){
            c.showPrice();
        }
    }
}
class Leaf implements Component{
        int price;
        String name;

        Leaf(String name , int price){
            this.price = price;
            this.name = name;
        }

        @Override
        public void showPrice(){
            System.out.println("Leaf -> " + name + ": " + getPrice());
        }

        public int getPrice(){
            return price;
        }
    }

class Clothing{
    public static void main(String[] args){
            
        Component jacket = new Leaf("Jacket" , 4000);
        Component slacks = new Leaf("Slacks" , 4000);
        Component eveninggown = new Leaf("Evening Gown" , 8000);
        Component sundresses = new Leaf("Sun Dresses" , 2000);
        Component skirts = new Leaf("Skirts" , 2000);
        Component blouses = new Leaf("Blouses" , 3000);

        Composite men = new Composite("Men's Fashion");
        Composite women = new Composite("Women's Fashion");
        Composite dresses = new Composite("Dresses");
        Composite suits = new Composite("Suits");
        Composite clothes = new Composite("Clothes");

        men.addComponent(suits);

        suits.addComponent(jacket);
        suits.addComponent(slacks);

        women.addComponent(dresses);
        women.addComponent(skirts);
        women.addComponent(blouses);

        dresses.addComponent(eveninggown);
        dresses.addComponent(sundresses);

        clothes.addComponent(women);
        clothes.addComponent(men);

        // jacket.showPrice();
        // dresses.showPrice();
        clothes.showPrice();
    }
}