package src.main.java.BuilderPattern.Car;

public class CarDriver {
    public static void main(String[] args) {
        Car.CarBuilder builder = new Car.CarBuilder();
        Car car1 = builder.setBrand("Suzuki").setIsSunroof(true).build();

        System.out.println(car1);
    }
}
