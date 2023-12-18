package OOP2;

public class App {
    public static void main(String[] args) {
        ServiceStation serviceStation = new ServiceStation();
        Truck zill = new Truck("ZILL", 8);
        Car car = new Car("uaz", 4);
        Bicycle bicycle = new Bicycle("Камма", 2);

        serviceStation.service(zill);
        System.out.println("---------------------------");
        serviceStation.service(car);
        System.out.println("---------------------------");
        serviceStation.service(bicycle);
    }
}
