import java.util.*;

class Singleton{
    private static Singleton soleInstance = new Singleton();
    public int i;

    // Private Constructor
    private Singleton(){
        System.out.println("Created...");
    }

    // Global access point
    public static void setInstance(Singleton soleInstance){
        Singleton.soleInstance = soleInstance;
    }
    public static Singleton getInstance(){
        return soleInstance;
    }

    // for i
    public void set(int i){
        this.i = i;
    }
    public int get(){
        return i;
    }

} 

class Shallow {
    public static void main(String[] args){

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.set(5);
        s2.set(10);
        System.out.println(s1.get());
        s2.i = s1.i + s2.i;
        System.out.println(s2.get());
        display("S1" , s1);
        display("S2" , s2);
    }

    static void display(String name , Singleton obj){
        System.out.println(String.format("Object : %s , Hashcode : %d " , name , obj.hashCode()));
    }
}
