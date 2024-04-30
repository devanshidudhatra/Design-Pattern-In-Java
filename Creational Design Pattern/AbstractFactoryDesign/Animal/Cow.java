package AbstractFactoryDesign.Animal;

public class Cow implements Animal{
    @Override
    public void name(){
        System.out.println("Cow lives on land...");
    }
}
