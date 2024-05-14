package Vehicles;

public class Car extends Vehicle{

    Car(String brand, int kilos) {
        super(brand, kilos);
    }

    @Override
    public String doStuff() {
        return "I am " + this.getBrand() + " and I go vroom vroom";
    }
}
