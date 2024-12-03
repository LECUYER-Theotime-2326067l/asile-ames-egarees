package DonneNotable;

import java.util.Random;

public class Weight {
    private int weight; // Poid (en kg)
    private static Random rand = new Random();

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static int generateWeight(String type) {
        switch (type.toLowerCase()) {
            case "human":
                return rand.nextInt(50, 120);
            case "elf":
                return rand.nextInt(40, 90);
            case "dwarf":
                return rand.nextInt(60, 150);
            case "orc":
                return rand.nextInt(80, 200);
            case "beastman":
                return rand.nextInt(70, 180);
            case "zombie":
                return rand.nextInt(30, 80);
            case "vampire":
                return rand.nextInt(50, 110);
            case "werewolf":
                return rand.nextInt(80, 160);
            case "reptilian":
                return rand.nextInt(70, 150);
            default:
                return 80;
        }
    }
}
