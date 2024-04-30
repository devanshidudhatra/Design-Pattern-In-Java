import java.util.*;

interface ClothesState{
    public void wash();
    public void wear();
    public void discard();
}

class CleanClothes implements ClothesState{
    public void wash(){}
    public void discard(){}
    public void wear(){
        System.out.println("You can wear the clean clothes...");
    }
}

class DirtyClothes implements ClothesState{
    public void wash(){
        System.out.println("You need to wash the clothes they are dirty...");
    }
    public void wear(){}
    public void discard(){}
}

class WornoutClothes implements ClothesState{
    public void discard(){
        System.out.println("These clothes are wornout discard them...");
    }
    public void wash(){}
    public void wear(){}
}

class ClothesContext{
    private ClothesState currentState;

    // Constructor
    public ClothesContext(){
        currentState = new CleanClothes();
    }

    public void setState(ClothesState state){
        currentState = state;
    }

    public void nextStep(){
        if(currentState instanceof CleanClothes){
            currentState.wear();
        }
        else if(currentState instanceof DirtyClothes){
            currentState.wash();
        }
        else{
            currentState.discard();
        }
    }
}
class Clothes {
    public static void main(String[] args){
        ClothesContext cc = new ClothesContext();
        cc.nextStep();
        System.out.println("After Playing football...");
        cc.setState(new DirtyClothes());
        cc.nextStep();
        System.out.println("After Fighting....");
        cc.setState(new WornoutClothes());
        cc.nextStep();
    }
}
