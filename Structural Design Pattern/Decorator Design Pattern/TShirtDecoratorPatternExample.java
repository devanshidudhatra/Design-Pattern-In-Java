interface TShirt {
    String getDescription();
    double cost();
}

class SimpleBlackTShirt implements TShirt {
    @Override
    public String getDescription() {
        return "Black T-Shirt";
    }

    @Override
    public double cost() {
        return 20.0;
    }
}

abstract class TShirtDecorator implements TShirt {
    protected TShirt decoratedTShirt;

    public TShirtDecorator(TShirt decoratedTShirt) {
        this.decoratedTShirt = decoratedTShirt;
    }

    @Override
    public String getDescription() {
        return decoratedTShirt.getDescription();
    }

    @Override
    public double cost() {
        return decoratedTShirt.cost();
    }
}

class AlphabetDecorator extends TShirtDecorator {
    public AlphabetDecorator(TShirt decoratedTShirt) {
        super(decoratedTShirt);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Alphabet";
    }

    @Override
    public double cost() {
        return super.cost() + 5.0;
    }
}

class GeometricDecorator extends TShirtDecorator {
    public GeometricDecorator(TShirt decoratedTShirt) {
        super(decoratedTShirt);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Geometric";
    }

    @Override
    public double cost() {
        return super.cost() + 8.0;
    }
}

public class TShirtDecoratorPatternExample {
    public static void main(String[] args) {
        // Create a simple black t-shirt
        TShirt blackTShirt = new SimpleBlackTShirt();
        System.out.println("Cost: " + blackTShirt.cost() + ", Description: " + blackTShirt.getDescription());

        // Decorate the black t-shirt with alphabets design
        TShirt alphabetTShirt = new AlphabetDecorator(blackTShirt);
        System.out.println("Cost: " + alphabetTShirt.cost() + ", Description: " + alphabetTShirt.getDescription());

        // Decorate the black t-shirt with geometric design
        TShirt geometricTShirt = new GeometricDecorator(blackTShirt);
        System.out.println("Cost: " + geometricTShirt.cost() + ", Description: " + geometricTShirt.getDescription());
    }
}