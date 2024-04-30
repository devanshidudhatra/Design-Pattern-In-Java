public class Shop {
    public static void main(String[] args) {
        Phone samsungPhone = new SamsungPhoneBuilder().setOs("Android").setRam(4).setBattery(4000).getPhone();
        System.out.println("Samsung Phone: " + samsungPhone);

        Phone iPhone = new IPhoneBuilder().setOs("iOS").setRam(3).setBattery(3000).getPhone();
        System.out.println("iPhone: " + iPhone);
    }
}
