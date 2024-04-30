import java.util.*;

interface Phone{
    public void buildPhone(String componentsrequired);
    public String deliverPhone();
}

class Android implements Phone{
    String finalPhone;
    public void buildPhone(String componentsrequired){
        finalPhone = "Android Phone with components : " + componentsrequired;
    }
    public String deliverPhone(){
        return finalPhone;
    }
}

class Iphone implements Phone{
    String finalPhone;
    public void buildPhone(String componentsrequired){
        finalPhone = "Iphone Phone with components : " + componentsrequired;
    }
    public String deliverPhone(){
        return finalPhone;
    }
}

class Components{
    public String getAndroidComp(){
        return "Qualcom , 2600 , 5";
    }
    public String getIphoneComp(){
        return "iOS , 3255 , 5.5";
    }
}

class Shopkeeper{
    public static String deliverPhone(PhoneType phoneType){
        Components comp = new Components();
        switch (phoneType) {
            case iPhone:
                Phone i = new Iphone();
                String i_comp = comp.getIphoneComp();
                i.buildPhone(i_comp);
                return i.deliverPhone();
        
            case Android:
                Phone a = new Android();
                String a_comp = comp.getAndroidComp();
                a.buildPhone(a_comp);
                return a.deliverPhone();
        }
        return null;
    }
}

class Facade {
    public static void main(String[] args){
        System.out.println(Shopkeeper.deliverPhone(PhoneType.iPhone));
        System.out.println(Shopkeeper.deliverPhone(PhoneType.Android));
    }
}
