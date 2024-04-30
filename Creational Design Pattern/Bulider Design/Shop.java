public class Shop {
    public static void main(String[] args) {
        Phone p = new PhoneBulider().setOs("Android").setRam(2).setBattery(3100).getPhone();
        System.out.println(p);

        PhoneBulider1 p1 = new PhoneBulider1();
        p1.setOs("Apple");
        p1.setRam(6);
        p1.setBattery(3200);
        Phone p2 = p1.getPhone(); // Assuming PhoneBuilder1 has a getPhone method
        System.out.println(p2);
    }
}
