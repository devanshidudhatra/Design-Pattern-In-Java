
import java.util.*;

// Interface
interface OS{
    public void spec();
}

// Concrete classes
class Android implements OS{
    @Override
    public void spec(){
        System.out.println("Android OS");
    }
}

class IOS implements OS{
    public void spec(){
        System.out.println("IOS OS");
    }
}

class Windows implements OS{
    public void spec(){
        System.out.println("Windows OS");
    }
}

// Factory class
class OSFactory{
    public OS getInstance(String s){
        if(s.equals("A")){
            return new Android();
        }
        else if(s.equals("I")){
            return new IOS();
        }
        else if(s.equals("W")){
            return new Windows();
        }
        else{
            return null;
        }
    }
}

//Main class
class Factory{
    public static void main(String[] args) {
        OSFactory osf = new OSFactory();
        OS os = osf.getInstance("A");
        os.spec();
    }
}