package Section8;

public class Car {
    private String description;
    public Car(String description){
        this.description = description;
    }

    public void startEngine(){
        System.out.println(description + " Car is starting...");
    }

    public void drive(){
        System.out.println("Driving.....");
        runEngine();
    }

    protected void runEngine(){
        System.out.println(description + " is running....");
    }
}

class GasPoweredCar extends Car{
    double avgKmPerLitre;
    int cylinders;

  public GasPoweredCar(String description, double avgKmPerLitre, int cylinders){
      super(description);
      this.avgKmPerLitre = avgKmPerLitre;
      this.cylinders = cylinders;
  }

    public void startEngine(){
        super.startEngine();
        System.out.println("Currently has" + cylinders + " cylinders...");
    }

    public void drive(){
        super.drive();
        System.out.println("Running at " + avgKmPerLitre + " kms per litre...");
    }

}

class ElectricCar extends Car{
    double avgKmPerLitre;
    int batterySize;
    public ElectricCar(String description, double avgKmPerLitre, int batterySize){
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
    }
    public void startEngine(){
        super.startEngine();
        System.out.println("Current Battery size is: " + batterySize + " ...");
    }

    public void drive(){
        super.drive();
        System.out.println("Silently Running at " + avgKmPerLitre + " kms per litre...");
    }
}
