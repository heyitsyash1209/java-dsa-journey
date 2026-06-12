class Vehicle {
    int wheels;
    String color;
    String engineType;

    Vehicle(int wheels, String color, String engineType) {
        this.wheels = wheels;
        this.color = color;
        this.engineType = engineType;
    }

    void run() {
        System.out.println("Vehicle is running");
    }

    void brake() {
        System.out.println("Vehicle is stopping");
    }

    void showDetails() {
        System.out.println("Wheels: " + wheels);
        System.out.println("Color: " + color);
        System.out.println("Engine: " + engineType);
    }
}

class Car extends Vehicle {

    Car(String color, String engineType) {
        super(4, color, engineType);
    }

    void musicSystem() {
        System.out.println("Music system is ON 🎵");
    }
}

class Scooty extends Vehicle {

    Scooty(String color, String engineType) {
        super(2, color, engineType);
    }

    void helmet() {
        System.out.println("Helmet is required 🪖");
    }
}

public class inheritsvehicle {
    public static void main(String args[]) {

        Car c1 = new Car("Red", "Petrol");
        c1.showDetails();
        c1.run();
        c1.brake();
        c1.musicSystem();

        System.out.println();

        Scooty s1 = new Scooty("Blue", "Electric");
        s1.showDetails();
        s1.run();
        s1.brake();
        s1.helmet();
    }
}