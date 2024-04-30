import java.util.*;

interface Clothes{
    public void size();
    public void prize();
    public void colour();
}

class Tshirt implements Clothes{
    @Override
    public void size(){
        System.out.println("All the sizes are available...");
    }
    @Override
    public void prize(){
        System.out.println("Prices start from Rs.200 ");
    }
    @Override
    public void colour(){
        System.out.println("All colours are available...");
    }
}
class Pants implements Clothes{
    @Override
    public void size(){
        System.out.println("All the sizes are available...");
    }
    @Override
    public void prize(){
        System.out.println("Prices start from Rs.200 ");
    }
    @Override
    public void colour(){
        System.out.println("All colours are available...");
    }
}
class Shirts implements Clothes{
    @Override
    public void size(){
        System.out.println("All the sizes are available...");
    }
    @Override
    public void prize(){
        System.out.println("Prices start from Rs.200 ");
    }
    @Override
    public void colour(){
        System.out.println("All colours are available...");
    }
}
class Skirts implements Clothes{
    @Override
    public void size(){
        System.out.println("All the sizes are available...");
    }
    @Override
    public void prize(){
        System.out.println("Prices start from Rs.200 ");
    }
    @Override
    public void colour(){
        System.out.println("All colours are available...");
    }
}
class Trousers implements Clothes{
    @Override
    public void size(){
        System.out.println("All the sizes are available...");
    }
    @Override
    public void prize(){
        System.out.println("Prices start from Rs.200 ");
    }
    @Override
    public void colour(){
        System.out.println("All colours are available...");
    }
}
class ChoiceSelection{
    public Clothes getInstance(int choice){
        if(choice == 1)
            return new Tshirt();
        else if(choice == 2)
            return new Pants();
        else if(choice == 3)
            return new Shirts();
        else if(choice == 4)
            return new Skirts();
        else if(choice == 5)
            return new Trousers();
        else
            return null;
    }
}
class ClothingFactory{
    public static void main(String args[]){
        System.out.println("\n 1 for Tshirt \n 2 for Pants \n 3 for Shirts \n 4 for Skirts \n 5 for Trouser \n Which product details do u want : ");
        Scanner scn = new Scanner(System.in);
        int choice = scn.nextInt();
        ChoiceSelection cs = new ChoiceSelection();
        Clothes obj = cs.getInstance(choice);
        obj.size();
        obj.colour();
        obj.prize();
    }
}