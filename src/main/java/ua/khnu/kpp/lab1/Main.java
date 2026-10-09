
package ua.khnu.kpp.lab1;

import java.util.Locale;
import java.util.Scanner;

public final class Main {

    private static final String ERROR = "ERROR";

    private Main() {
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in)
                .useLocale(Locale.ROOT);

        if (!input.hasNextDouble()) {
            System.out.println(ERROR);
            return;
        }
        double distanceKm = input.nextDouble();

        if (!input.hasNextDouble()) {
            System.out.println(ERROR);
            return;
        }
        double fuelLitres = input.nextDouble();

        if (!input.hasNextDouble()) {
            System.out.println(ERROR);
            return;
        }
        double pricePerLitre = input.nextDouble();

        if (input.hasNext()) {
            System.out.println(ERROR);
            return;
        }

        try {
            Trip trip = new Trip(distanceKm, fuelLitres, pricePerLitre);

            System.out.printf(Locale.ROOT,
                    "RESULT_1=%.2f%n",
                    trip.fuelConsumptionPer100Km());

            System.out.printf(Locale.ROOT,
                    "RESULT_2=%.2f%n",
                    trip.totalFuelCost());

            System.out.printf(Locale.ROOT,
                    "RESULT_3=%.2f%n",
                    trip.costPer100Km());

        } catch (IllegalArgumentException exception) {
            System.out.println(ERROR);
        }
    }
}
