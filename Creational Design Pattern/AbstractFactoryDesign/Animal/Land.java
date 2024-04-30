package AbstractFactoryDesign.Animal;

public class Land implements Habitat{
    public void type(){
        System.out.println("The animals that live on land are called Terrestrial animals.");
    }
    public void info(){
        System.out.println("Land masses can be grasslands , forests , mountains , deserts , etc.");
    }
}
