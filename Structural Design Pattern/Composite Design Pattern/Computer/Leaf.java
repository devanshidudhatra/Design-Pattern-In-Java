class Leaf implements Component{
    int price;
    String name;

    Leaf(String name , int price){
        this.price = price;
        this.name = name;
    }

    @Override
    public void showPrice() {
        System.out.println("Leaf " + "-> " + name + ": " + price);
    }

    public int getPrice(){
        return price;
    }
}
