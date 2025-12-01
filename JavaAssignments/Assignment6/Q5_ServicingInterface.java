// Servicing interface with Car and Bike classes

interface Servicing {
    String getServiceTime();
}

class Car implements Servicing {
    public String getServiceTime() {
        return "Car service time: 2-3 hours";
    }
}

class Bike implements Servicing {
    public String getServiceTime() {
        return "Bike service time: 1-2 hours";
    }
}

public class Q5_ServicingInterface {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        
        System.out.println(car.getServiceTime());
        System.out.println(bike.getServiceTime());
    }
}
