public class Main{
    public static void main(String[] args) {
        MobileFactory samsungFactory = new SamsungFactory();
        Mobile samsungMobile = samsungFactory.createMobile();
        OS samsungOS = samsungFactory.createOS();

        samsungMobile.displayInfo();
        samsungOS.display();

        MobileFactory nokiaFactory = new NokiaFactory();
        Mobile nokiaMobile = nokiaFactory.createMobile();
        OS nokiaOS = nokiaFactory.createOS();

        nokiaMobile.displayInfo();
        nokiaOS.display();

        MobileFactory appleFactory = new AppleFactory();
        Mobile appleMobile = appleFactory.createMobile();
        OS appleOS = nokiaFactory.createOS();

        appleMobile.displayInfo();
        appleOS.display();
    }
}