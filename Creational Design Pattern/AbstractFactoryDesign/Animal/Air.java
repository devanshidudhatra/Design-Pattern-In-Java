package AbstractFactoryDesign.Animal;

public class Air implements Habitat{
    public void type(){
        System.out.println("The animals that can fly are called Aerial animals.");
    }
    public void info(){
        System.out.println("Some animals here fly high in sky while some cannot... This is because of variation in thier wings...");
    }
}
