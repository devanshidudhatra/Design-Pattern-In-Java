import java.util.*;

class Cook{
    public void prepareFood(String dish){
        System.out.println("Preparing : " + dish);
        System.out.println(dish + " is ready");
    }
}

class Customer{
    public void placeOrder(String dish){
        System.out.println("Placing order for " + dish);
    }
}

class Waiter{
    private Cook cook;
    private Customer customer;

    public Waiter(){
        this.cook = new Cook();
        this.customer = new Customer();
    }

    public void takeOrder(String dish){
        customer.placeOrder(dish);
        cook.prepareFood(dish);
        System.out.println(dish + " is served.");
    }
}

class MVCDemo{
    public static void main(String[] args) {
        Waiter w = new Waiter();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of dishes : ");
        n = sc.nextInt();
        sc.nextLine();
        String dish[] = new String[n];
        for(int i=0 ; i<n ; i++){
            System.out.println("Enter dish :");
            dish[i] = sc.nextLine();
        }
        for(int i=0 ; i<n ; i++){
            w.takeOrder(dish[i]);
        }
    }
}