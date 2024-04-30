import java.util.*;

interface Shape{
    void draw();
}

class Circle implements Shape{
    int x;
    int y;
    String color;
    int radius;

    public Circle(String color){
        this.color = color;
    }

    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }

    public void draw(){
        System.out.println("Circle ->  Color : " +color+" , X : " +x+ " , Y : " +y );
    }
}

class CircleFactory{
    private static final HashMap circleMap = new HashMap();

    public static Shape getCircle(String color){
        Circle circle = (Circle)circleMap.get(color);
        if(circle == null){
            circle = new Circle(color);
            circleMap.put(color,circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}

class Flyweight_Test {
    private static final String colors[] = {"Red" , "Green" , "Blue" , "White" , "Yellow" , "Black"};

    public static void main(String[] args){
        for(int i=0 ; i<20 ; ++i){
            Circle circle = (Circle)CircleFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor(){
        return colors[(int)(Math.random() * colors.length)];
    }

    private static int getRandomX(){
        return (int)(Math.random() * 100);
    }

    private static int getRandomY(){
        return (int)(Math.random() * 100);
    }
}
