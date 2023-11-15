package ovningsuppgifter.Week4.Vehicles;

public class Car extends Vehicle {
    private final int numberOfSeats;

    public Car(String registrationNumber, int numberOfSeats) {
        super(registrationNumber);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

}

