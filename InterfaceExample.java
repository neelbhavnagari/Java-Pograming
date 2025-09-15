interface Vehicle {
    void start();

    void stop();
}

class Car implements Vehicle {

    public void start() {
        System.out.println("car start");
    }

    public void stop() {
        System.out.println("car stop");
    }
}

class Bike implements Vehicle {

    public void start() {
        System.out.println("bike start");
    }

    public void stop() {
        System.out.println("bike stop");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();
        myCar.stop();

        Vehicle myBike = new Bike();
        myBike.start();
        myBike.stop();
    }
}
