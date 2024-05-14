package Vehicles;

public class Boat extends Vehicle{

    Boat(String brand, int kilos) {
        super(brand, kilos);
    }

    @Override
    public String doStuff() {
        return "I am " + this.getBrand() + " and I go glu glu";
    }

}
