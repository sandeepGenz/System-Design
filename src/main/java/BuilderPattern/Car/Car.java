package src.main.java.BuilderPattern.Car;

public class Car {

    private String engine;
    private boolean isSunroof;
    private boolean isElectirc;
    private String brand;
    private String fuelType;

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", isSunroof=" + isSunroof +
                ", isElectirc=" + isElectirc +
                ", brand='" + brand + '\'' +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }

    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.isSunroof = builder.isSunroof;
        this.isElectirc = builder.isElectirc;
        this.brand = builder.brand;
        this.fuelType = builder.fuelType;
    }

    public String getEngine() {
        return engine;
    }

    public boolean isSunroof() {
        return isSunroof;
    }

    public boolean isElectirc() {
        return isElectirc;
    }

    public String getBrand() {
        return brand;
    }

    public String getFuelType() {
        return fuelType;
    }

    public static class CarBuilder{

        // Default values
        private String engine = "MP-POWER";
        private boolean isSunroof = false;
        private boolean isElectirc = false;
        private String brand = "Hyndai";
        private String fuelType = "Petrol";

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setIsSunroof(boolean isSunroof) {
            this.isSunroof = isSunroof;
            return this;
        }

        public CarBuilder setIsElectric(boolean isElectirc) {
            this.isElectirc = isElectirc;
            return this;
        }

        public CarBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder setFuelType(String fuelType) {
            this.fuelType = fuelType;
            return this;
        }

        public Car build() {
            return new Car(this);
        }

    }
}
