package ai.verisoft.creational;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void shouldBeAbleToCreateCar() {
        Car car = new Car.CarBuilder("V8", 4)
                .airbags(4)
                .sunroof(true)
                .entertainmentSystem("Advanced")
                .build();

        Assertions.assertEquals("V8", car.getEngine());
        Assertions.assertEquals(4, car.getAirbags());
    }
}
