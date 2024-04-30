// Mobile Phone Software Problem 

import java.util.*;
import java.lang.*;

interface OS{
    public void spec();
}
class Android implements OS{
    @Override
    public void spec(){
        System.out.println("Most Powerful OS");
    }
}
class IOS implements OS{
    @Override
    public void spec(){
        System.out.println("Most Secured OS");
    }

}
class Window implements OS{
    @Override
    public void spec(){
        System.out.println("I am about to die");
    }

}
class OperatingSystemFactory {
    public OS getInstance(String str){
        if(str.equals("Open"))
            return new Android();
        else if(str.equals("Closed"))
            return new IOS();
        else
            return new Window();
    }
}
class FactoryDesign{
    public static void main(String args[]){
        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("Closed");
        obj.spec();
    }
}