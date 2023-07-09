import java.util.Scanner;
public class RentApp {
    public static void main(String[] args) {
        Driver[] drivers = {
                new Driver("A", "Sedan", 4, 500),
                new Driver("B", "HatchBack", 4.3, 1000),
                new Driver("C", "5 Seater", 4.8, 200),
                new Driver("D", "Sedan", 4.1, 700),
                new Driver("E", "HatchBack", 4.7, 430)
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Customer Ride Distance: ");
        double rideDistance = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Car Requested: ");
        String carRequested = scanner.nextLine();

        scanner.close();

        Ride ride = new Ride(rideDistance, carRequested);

        RentARide rentARide = new RentARide(drivers);
        String result = rentARide.findDriverForRide(ride);
        System.out.println(result);
    }
}