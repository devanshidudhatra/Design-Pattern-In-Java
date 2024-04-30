public class IPhone implements Phone{
    public String finalPhone;

    @Override
    public void builtPhone(String componentsrequired){
        finalPhone = "Apple phone with components: " + componentsrequired;
    }

    @Override
    public String deliverPhone(){
        return finalPhone;
    }
}
