import lesson_2.Car;
import lesson_2.Motorcycle;
import lesson_2.Vehicle;

import org.junit;
import static org.junit.Assert.*;

public class VehicleTest {

    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Company", "Model", 2023);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void testCarHasFourWheels() {
        Car car = new Car("Company", "Model", 2023);
        assertEquals(4, car.getNumWheels());
    }

    @Test
    public void testMotorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Company", "Model", 2023);
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    public void testCarTestDrive() {
        Car car = new Car("Company", "Model", 2023);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    public void testMotorcycleTestDrive() {
        Motorcycle motorcycle = new Motorcycle("Company", "Model", 2023);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    public void testCarParked() {
        Car car = new Car("Company", "Model", 2023);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    public void testMotorcycleParked() {
        Motorcycle motorcycle = new Motorcycle("Company", "Model", 2023);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}