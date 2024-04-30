import java.util.*;
public class ClothingFactory {
    public static void main(String args[]) {
        System.out.println(
                "\n 1 for Tshirt \n 2 for Pants \n 3 for Shirts \n 4 for Skirts \n 5 for Trouser \n Which product details do u want : ");
        Scanner scn = new Scanner(System.in);
        int choice = scn.nextInt();
        ChoiceSelection cs = new ChoiceSelection();
        Clothes obj = cs.getInstance(choice);
        obj.size();
        obj.colour();
        obj.prize();
    }
}