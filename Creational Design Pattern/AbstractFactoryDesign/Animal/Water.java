package AbstractFactoryDesign.Animal;

public class Water implements Habitat{
    public void type(){
        System.out.println("The animals that live in water are called Aquatic animals animals.");
    }
    public void info(){
        System.out.println("Water Bodies can be seas , oceans , rivers , ponds , lakes , etc.");
    }
}
