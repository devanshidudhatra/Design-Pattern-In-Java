public class ChoiceSelection {
    public Clothes getInstance(int choice) {
        if (choice == 1)
            return new Tshirt();
        else if (choice == 2)
            return new Pants();
        else if (choice == 3)
            return new Shirts();
        else if (choice == 4)
            return new Skirts();
        else if (choice == 5)
            return new Trousers();
        else
            return null;
    }
}