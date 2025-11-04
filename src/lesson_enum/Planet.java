package lesson_enum;

public enum Planet {
    MERCURY(0.330, 2.4397),
    VENUS(4.87, 6.0518),
    EARTH(5.97, 6.371),
    MARS(0.642, 3.3895),
    JUPITER(1898, 69.911),
    SATURN(568, 58.232),
    URANUS(86.8, 25.362),
    NEPTUNE(102, 24.622),
    PLUTO(0.013, 1.1883);
    private final double planetRadius;
    private final double planetMass;

    public static final double G = 6.67 * Math.pow(10, -11);

    public double surfaceWeight(double yourMass) {
        return yourMass * surfaceGravity();
    }

    public double surfaceGravity() {
        return G * planetMass / Math.pow(planetRadius, 2);
    }

    Planet(double planetMass, double planetRadius) {
        this.planetRadius = planetRadius;
        this.planetMass = planetMass;
    }

    public double getPlanetRadius() {
        return planetRadius;
    }

    public double getPlanetMass() {
        return planetMass;
    }
}
