
package ua.khnu.kpp.lab1;

public final class Trip {

    private final double distanceKm;
    private final double fuelLitres;
    private final double pricePerLitre;

    public Trip(double distanceKm, double fuelLitres,
                double pricePerLitre) {

        if (!Double.isFinite(distanceKm) || distanceKm <= 0
                || !Double.isFinite(fuelLitres) || fuelLitres <= 0
                || !Double.isFinite(pricePerLitre) || pricePerLitre <= 0) {
            throw new IllegalArgumentException(
                    "All values must be finite and positive");
        }

        this.distanceKm = distanceKm;
        this.fuelLitres = fuelLitres;
        this.pricePerLitre = pricePerLitre;
    }

    public double fuelConsumptionPer100Km() {
        return (fuelLitres / distanceKm) * 100;
    }

    public double totalFuelCost() {
        return fuelLitres * pricePerLitre;
    }

    public double costPer100Km() {
        return (totalFuelCost() / distanceKm) * 100;
    }
}
