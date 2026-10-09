
package ua.khnu.kpp.lab1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TripTest {

    private static final double EPSILON = 1e-9;

    @Test
    void calculatesControlValues() {
        Trip trip = new Trip(420, 31.5, 59.9);

        assertEquals(7.50,
                trip.fuelConsumptionPer100Km(), EPSILON);
        assertEquals(1886.85,
                trip.totalFuelCost(), EPSILON);
        assertEquals(449.25,
                trip.costPer100Km(), EPSILON);
    }

    @Test
    void calculatesAlternativeValues() {
        Trip trip = new Trip(200, 12, 50);

        assertEquals(6.0,
                trip.fuelConsumptionPer100Km(), EPSILON);
        assertEquals(600.0,
                trip.totalFuelCost(), EPSILON);
        assertEquals(300.0,
                trip.costPer100Km(), EPSILON);
    }

    @Test
    void rejectsInvalidValues() {
        assertThrows(IllegalArgumentException.class,
                () -> new Trip(0, 10, 50));

        assertThrows(IllegalArgumentException.class,
                () -> new Trip(200, -5, 50));

        assertThrows(IllegalArgumentException.class,
                () -> new Trip(200, 10, Double.NaN));
    }
}
