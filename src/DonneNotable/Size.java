package DonneNotable;

import java.util.Random;

public class Size {
    private String type;
    private double size; // Taille de la créature (en mètres)
    private Random rand = new Random();

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double determineSize() {
        switch (type.toLowerCase()) {
            case "human":
                return rand.nextDouble(1.40, 2.00) ;
            case "elf":
                return rand.nextDouble(1.70, 2.20);
            case "dwarf":
                return rand.nextDouble(1.00,1.50);
            case "orc":
                return rand.nextDouble(1.80, 3.00);
            case "beastman":
                return rand.nextDouble(1.80, 2.40);
            case "zombie":
                return rand.nextDouble(1.40, 1.90);
            case "vampire":
                return rand.nextDouble(1.50, 2.10);
            case "werewolf":
                return rand.nextDouble(1.70, 2.80);
            case "reptilian":
                return rand.nextDouble(1.60, 2.10);
            default:
                return 1.70; // Par défaut, on retourne une taille moyenne (pour les créatures inconnues)
        }
    }
}
