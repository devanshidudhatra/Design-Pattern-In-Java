interface Coffee{
    String getDescription();
    double cost();
}

// Concrete Component
class SimpleCoffee implements Coffee{
    @Override
    public String getDescription(){
        return "Simple Coffee";
    }

    @Override
    public double cost(){
        return 30.0;
    }
}

// Decorator abstract class
abstract class CoffeeDecorator implements Coffee{
    protected Coffee decoratedCoffee;
    public CoffeeDecorator(Coffee decoratedCoffee){
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public String getDescription(){
        return decoratedCoffee.getDescription();
    }

    @Override
    public double cost(){
        return decoratedCoffee.cost();
    }
}

// Concrete decorators
class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee decoratedCoffee){
        super(decoratedCoffee);
    }
    @Override
    public String getDescription(){
        return super.getDescription() + " , with Milk";
    }
    @Override
    public double cost(){
        return super.cost() + 5.5;
    }
}

class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee decoratedCoffee){
        super(decoratedCoffee);
    }
    @Override
    public String getDescription(){
        return super.getDescription() + " , with Sugar";
    }
    @Override
    public double cost(){
        return super.cost() + 3.5;
    }
}

class DecoratorPatternDemo{
    public static void main(String[] args) {
        // Create a simple coffee
        Coffee coffee = new SimpleCoffee();
        System.out.println("Cost : " + coffee.cost() + " , Description : " + coffee.getDescription());

        //Decorate the simple coffee with Milk
        Coffee milkCoffee = new MilkDecorator(coffee);
        System.out.println("Cost : " + milkCoffee.cost() + " , Description : " + milkCoffee.getDescription());

        //Decorate the simple coffee with Sugar
        Coffee sweetCoffee = new SugarDecorator(coffee);
        System.out.println("Cost : " + sweetCoffee.cost() + " , Description : " + sweetCoffee.getDescription());

    }
}