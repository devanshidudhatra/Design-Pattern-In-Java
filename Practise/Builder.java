import java.util.*;

// Director
class Phone{
    private String os;
    private int storage;
    private int ram;

    //Constructor
    public Phone(String os , int storage,int ram){
        this.os = os;
        this.storage = storage;
        this.ram = ram;
    }

    // Method to print
    public String toString(){
        return "Phone [ OS :" + os + " , Storage :" + storage + " , RAM : " + ram + " ]";
    }
}

//Builder
class PhoneBuilder{
    private String os;
    private int storage;
    private int ram;

    public PhoneBuilder setOS(String os1){
        this.os = os1;
        return this;
    }
    public PhoneBuilder setStorage(int storage1){
        this.storage = storage1;
        return this;
    }
    public PhoneBuilder setRam(int ram1){
        this.ram = ram1;
        return this;
    }

    public Phone getPhone(){
        return new Phone(os,storage,ram);
    }
}
// Shop
class Builder {
    public static void main(String[] args) {
        Phone p = new PhoneBuilder().setOS("Android").setStorage(256).setRam(32).getPhone();
        System.out.println(p);
        // PhoneBuilder p = new PhoneBuilder();
        // p.setOS("Android");
        // p.setStorage(256);
        // p.setRam(32);
        // Phone p1 = p.getPhone();
        // System.out.println(p1);
    }
}
