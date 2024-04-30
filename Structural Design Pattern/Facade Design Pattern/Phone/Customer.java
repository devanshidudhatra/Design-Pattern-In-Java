public class Customer {
    public static void main(String args[]){
        //Using facade
        System.out.println("--------Facade--------");
        System.out.println(Shopkeeper.deliverPhone(PhoneType.iPhone));
        System.out.println(Shopkeeper.deliverPhone(PhoneType.Android));
    }
}
