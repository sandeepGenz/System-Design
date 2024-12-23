package src.test.java;


import org.junit.jupiter.api.Test;
import src.main.java.FactoryPattern.*;

import static org.junit.jupiter.api.Assertions.*;

class VehicleFactoryTest {

    @Test
    void testCarFactoryCreatesCar() {
        // Arrange
        VehicleFactory carFactory = new CarFactory();

        // Act
        Vehicle car = carFactory.createVehicle();

        // Assert
        assertNotNull(car, "Car should not be null");
        assertTrue(car instanceof Car, "Factory should create a Car instance");
    }

    @Test
    void testBikeFactoryCreatesBike() {
        // Arrange
        VehicleFactory bikeFactory = new BikeFactory();

        // Act
        Vehicle bike = bikeFactory.createVehicle();

        // Assert
        assertNotNull(bike, "Bike should not be null");
        assertTrue(bike instanceof Bike, "Factory should create a Bike instance");
    }

    @Test
    void testCarBehavior() {
        // Arrange
        VehicleFactory carFactory = new CarFactory();

        // Act
        Vehicle car = carFactory.createVehicle();

        // Capture behavior
        car.display();
        car.manufacturer();

        // Assert
        assertTrue(car instanceof Car, "Car should implement Vehicle behavior correctly");
    }

    @Test
    void testBikeBehavior() {
        // Arrange
        VehicleFactory bikeFactory = new BikeFactory();

        // Act
        Vehicle bike = bikeFactory.createVehicle();

        // Capture behavior
        bike.display();
        bike.manufacturer();

        // Assert
        assertTrue(bike instanceof Bike, "Bike should implement Vehicle behavior correctly");
    }

    @Test
    void testMultipleFactories() {
        // Arrange
        VehicleFactory carFactory = new CarFactory();
        VehicleFactory bikeFactory = new BikeFactory();

        // Act
        Vehicle car = carFactory.createVehicle();
        Vehicle bike = bikeFactory.createVehicle();

        // Assert
        assertNotEquals(car, bike, "Car and Bike should be different objects");
    }
}
