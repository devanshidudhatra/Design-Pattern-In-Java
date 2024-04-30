import java.util.*;

class Vehicle implements Cloneable{
    List<String> vehicleList;

    // Constructor
    public Vehicle(){
        this.vehicleList = new ArrayList<String>();
    }

    // Parametrized Constructor
    public Vehicle(List<String> list){
        this.vehicleList = list;
    }

    // Inserting in List
    void insertData(){
        vehicleList.add("Honda");
        vehicleList.add("Ferrari");
        vehicleList.add("Mercedes");
        vehicleList.add("RR");
        vehicleList.add("Porshe");
    }

    // to get the vehicle list
    List<String> getVehicle(){
        return this.vehicleList;
    }

    // CLoning the list and returning the object
    public Object clone() throws CloneNotSupportedException{
        List<String> tempList = new ArrayList<String>();
        for(String s : this.vehicleList){
            tempList.add(s);
        }
        return new Vehicle(tempList);
    } 
}

class Prototype{
    public static void main(String[] args) throws CloneNotSupportedException{
        Vehicle a = new Vehicle();
        a.insertData();

        Vehicle b = (Vehicle)a.clone();
        System.out.println("A : " + a.getVehicle());
        System.out.println("B : " + b.getVehicle());
    }
}