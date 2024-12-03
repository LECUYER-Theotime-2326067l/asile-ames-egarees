package DonneNotable;

import java.util.Random;

public class Size {
    private int size; // Taille (en cm)
    private static Random rand = new Random();

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static int generateSize(String type) {
        switch (type.toLowerCase()) {
            case "human":
                return rand.nextInt(140, 200);
            case "elf":
                return rand.nextInt(170, 220);
            case "dwarf":
                return rand.nextInt(100, 150);
            case "orc":
                return rand.nextInt(180, 300);
            case "beastman":
                return rand.nextInt(180, 240);
            case "zombie":
                return rand.nextInt(140, 190);
            case "vampire":
                return rand.nextInt(150, 210);
            case "werewolf":
                return rand.nextInt(170, 280);
            case "reptilian":
                return rand.nextInt(160, 210);
            default:
                return 170;
        }
    }
}
