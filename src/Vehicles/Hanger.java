package Vehicles;

public class Hanger {
    public static void main(String[] args){
        Boat boaty = new Boat("VW", 1000);
        Car cary = new Car("Lexus", 20330);

        System.out.println(boaty.doStuff());
        System.out.println(cary.doStuff());
    }
}
