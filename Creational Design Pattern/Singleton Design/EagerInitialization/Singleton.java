// Eager Initialization
public class Singleton{
    private static Singleton soleInstance = new Singleton();
    public int i;

    // Private Constructor
    private Singleton(){
        System.out.println("Created");
    }

    //Global access point
    public static Singleton getInstance(){
        return soleInstance;
    }

    public int get(){
        return i;
    }

    public static void setSoleInstance(Singleton soleInstance){
        Singleton.soleInstance = soleInstance;
    }

    public void set(int i){
        this.i = i;
    }
}

// // Lazy Initialization
// public class Singleton{
//     private static Singleton soleInstance;
//     public int i;

//     // Private Constructor
//     private Singleton(){
//         System.out.println("Created");
//     }

//     //Global access point
//     public static Singleton getInstance(){
//         if(soleInstance == null){
//             soleInstance = new Singleton();
//         }
//         return soleInstance;
//     }

//     public int get(){
//         return i;
//     }

//     public static void setSoleInstance(Singleton soleInstance){
//         Singleton.soleInstance = soleInstance;
//     }

//     public void set(int i){
//         this.i = i;
//     }
// }