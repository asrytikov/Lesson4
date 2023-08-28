package p_new;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.infoCar();

        car1.marka = "Nissan";
        car1.model = "Terrano";
        car1.age = 2018;

        car1.infoCar();

        car1.drive();
        car1.drive();
        car1.stop();

        Truck truck = new Truck(2020);

        truck.infoCar();
        truck.testCar();
        truck.marka = "KAMAZ";
        truck.model = "100";
        truck.age = 2020;
        truck.capacity = 10000;

        truck.infoCar();

        truck.drive();
        truck.stop();



    }

}
