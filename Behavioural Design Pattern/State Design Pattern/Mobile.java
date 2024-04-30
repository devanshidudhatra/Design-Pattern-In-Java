import java.util.*;

interface MobileAlertSate {
    public void alert();
}

class Ringing implements MobileAlertSate {
    public void alert(){
        System.out.println("Mobile is in ringing state.");
    }
}

class Vibrate implements MobileAlertSate {
    public void alert(){
        System.out.println("Mobile is in vibrate state.");
    }
}

class Silent implements MobileAlertSate {
    public void alert(){
        System.out.println("Mobile is in silent state.");
    }
}

class MobileContext {
    private MobileAlertSate currentState;

    // Constructor
    public MobileContext() {
        currentState = new Ringing();
    }

    // To change the state
    public void setState(MobileAlertSate state) {
        currentState = state;
    }

    public void alert() {
        currentState.alert();
    }
}

// Main class
public class Mobile {
    public static void main(String[] args) {
        MobileContext mc = new MobileContext();
        mc.alert();
        mc.setState(new Silent());
        mc.alert();
        System.out.println("Set to Ringing state again...");
        mc.setState(new Ringing());
        mc.alert();
    }
}