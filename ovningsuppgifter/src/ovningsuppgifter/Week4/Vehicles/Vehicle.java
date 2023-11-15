package ovningsuppgifter.Week4.Vehicles;

public abstract class Vehicle {
    private final String registrationNumber;

    public Vehicle(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber(){
        return registrationNumber;
    }

    public void processVehicle(Vehicle vehicle) {
        switch (vehicle) {
            case Car car -> {
                System.out.println("This is a Car with registration number: " + car.getRegistrationNumber());
                System.out.println("Number of seats: " + car.getNumberOfSeats());
            }
            case Truck truck -> {
                System.out.println("This is a Truck with registration number: " + truck.getRegistrationNumber());
                System.out.println("Load capacity: " + truck.getLoadCapacity());
            }
            default -> {
                System.out.println("Unknown vehicle type");
            }
        }
    }

    public static void main(String[] args) {
        Vehicle car = new Car("HRO286", 5);
        Vehicle truck = new Truck("KLR372", 8000);

        car.processVehicle(car);
        truck.processVehicle(truck);
    }
}

