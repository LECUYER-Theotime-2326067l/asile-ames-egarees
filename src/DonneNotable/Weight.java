package DonneNotable;

import java.util.Random;

public class Weight {
    private static double weight;
    private static Random rand = new Random();

    public static double getWeight() {
        return weight;
    }

    public static void setWeight(double weight) {
        Weight.weight = weight;
    }

    public static double generateWeight(String type) {
        switch (type.toLowerCase()) {
            case "human":
                return getRandomInRange(50.00, 120.00);
            case "elf":
                return getRandomInRange(40.00, 90.00);
            case "dwarf":
                return getRandomInRange(60.00, 150.00);
            case "orque":
                return getRandomInRange(80.00, 200.00);
            case "beastmen":
                return getRandomInRange(70.00, 180.00);
            case "zombie":
                return getRandomInRange(30.00, 80.00);
            case "vampire":
                return getRandomInRange(50.00, 110.00);
            case "werewolves":
                return getRandomInRange(80.00, 160.00);
            case "reptilian":
                return getRandomInRange(70.00, 150.00);
            default:
                return 80.00;
        }
    }

    private static double getRandomInRange(double min, double max) {
        return min + (max - min) * rand.nextDouble();
    }
}
