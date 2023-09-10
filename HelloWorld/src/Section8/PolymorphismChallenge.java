package Section8;

public class PolymorphismChallenge {
    public static void main(String[] args) {
        Car myCar = new Car("Kia");
        runCars(myCar);

        ElectricCar myElectricCar = new ElectricCar("Tesla", 11.0, 90);
        runCars(myElectricCar);

        GasPoweredCar myGasCar = new GasPoweredCar("Suzuki", 5.0, 11);
        runCars(myGasCar);
    }

    public static void runCars(Car car){
        car.startEngine();
        car.drive();
    }

}
