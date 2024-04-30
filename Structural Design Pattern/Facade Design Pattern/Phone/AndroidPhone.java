public class AndroidPhone implements Phone{
    public String finalPhone;

    @Override
    public void builtPhone(String componentsrequired){
        finalPhone = "Android phone with components: " + componentsrequired;
    }

    @Override
    public String deliverPhone(){
        return finalPhone;
    }
}
