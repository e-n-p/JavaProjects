package Vehicles;

public abstract class Vehicle {
    private String brand;
    private int kilometers;

    Vehicle(String brand, int kilos){
        this.brand = brand;
        this.kilometers = kilos;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    public abstract String doStuff();

}
