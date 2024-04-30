import java.util.jar.*;

class Singleton_Deep{
    public static Singleton_Deep soleInstance = new Singleton_Deep();
    public int i;

    // Private Constructor
    private Singleton_Deep(){
        System.out.println("Created...");
    }

    // Global access point
    public static Singleton_Deep getInstance(){
        if(soleInstance == null){
            soleInstance = new Singleton_Deep();
        }
        return soleInstance;
    }
    public static void setInstance(Singleton_Deep soleInstance){
        Singleton_Deep.soleInstance = soleInstance;
    }

    public int get(){
        return i;
    }
    public void set(int i){
        this.i = i;
    }
}

class Deep {
    public static void main(String[] args){
        Singleton_Deep s1 = Singleton_Deep.getInstance();
        Singleton_Deep s2 = Singleton_Deep.getInstance();

        s1.set(5);
        s2.set(10);
        System.out.println(s1.get());
        s2.i = s1.i + s2.i ;
        System.out.println(s2.get());
        display("S1" , s1);
        display("S2" , s2);
    }

    static void display(String name , Singleton_Deep obj){
        System.out.println(String.format("Object : %s , Hashcode : %d" , name , obj.hashCode()));
    }
}
