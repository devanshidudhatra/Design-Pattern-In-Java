import java.util.*;

interface Mobile{
    public void display();
}
class Samsung implements Mobile{
    @Override
    public void display(){
        System.out.println("Samsung Phone");
    }
}
class Iphone implements Mobile{
    @Override
    public void display(){
        System.out.println("Iphone Phone");
    }
}
class Nokia implements Mobile{
    @Override
    public void display(){
        System.out.println("Nokia Phone");
    }
}

interface OS{
    public void displayOS();
}
class Android implements OS{
    public void displayOS(){
        System.out.println("Android OS");
    }
}
class Ios implements OS{
    public void displayOS(){
        System.out.println("iOS");
    }
}
class Windows implements OS{
    public void displayOS(){
        System.out.println("Windows OS");
    }
}

interface MobileFactory{
    Mobile createMobile();
    OS createOS();
}
class SamsungFactory implements MobileFactory{
    public Mobile createMobile(){
        return new Samsung();
    }
    public OS createOS(){
        return new Android();
    }
}
class IphoneFactory implements MobileFactory{
    public Mobile createMobile(){
        return new Iphone();
    }
    public OS createOS(){
        return new Ios();
    }
}
class NokiaFactory implements MobileFactory{
    public Mobile createMobile(){
        return new Nokia();
    }
    public OS createOS(){
        return new Windows();
    }
}

public class AbstractFactory {
    public static void main(String[] args){
        MobileFactory mf1 = new SamsungFactory();
        Mobile m1 = mf1.createMobile();
        OS os1 = mf1.createOS();
        m1.display();
        os1.displayOS();

        MobileFactory mf2 = new IphoneFactory();
        Mobile m2 = mf2.createMobile();
        OS os2 = mf2.createOS();
        m2.display();
        os2.displayOS();

        MobileFactory mf3 = new NokiaFactory();
        Mobile m3 = mf3.createMobile();
        OS os3 = mf3.createOS();
        m3.display();
        os3.displayOS();
    }
}
