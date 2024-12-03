package DonneNotable;

import java.util.Random;

public class Size {
    private double size; // Taille de la créature (en mètres)
    private static Random rand = new Random();

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public static double generateSize(String type) {
        switch (type.toLowerCase()) {
            case "human":
                return getRandomInRange(1.40, 2.00);
            case "elf":
                return getRandomInRange(1.70, 2.20);
            case "dwarf":
                return getRandomInRange(1.00, 1.50);
            case "orc":
                return getRandomInRange(1.80, 3.00);
            case "beastman":
                return getRandomInRange(1.80, 2.40);
            case "zombie":
                return getRandomInRange(1.40, 1.90);
            case "vampire":
                return getRandomInRange(1.50, 2.10);
            case "werewolf":
                return getRandomInRange(1.70, 2.80);
            case "reptilian":
                return getRandomInRange(1.60, 2.10);
            default:
                return 1.70;
        }
    }

    private static double getRandomInRange(double min, double max) {
        return min + (max - min) * rand.nextDouble();
    }
}
