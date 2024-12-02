package DonneNotable;

import java.util.Random;

public class Age {
    private int age;
    private String type;
    private Random rand = new Random();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int generateAge() {
        switch (type.toLowerCase()) {
            case "human":
                return rand.nextInt(18, 100);
            case "elf":
                return rand.nextInt(18, 1000);
            case "dwarf":
                return rand.nextInt(18, 400);
            case "orc":
                return rand.nextInt(18, 100);
            case "beastman":
                return rand.nextInt(18, 100);
            case "zombie":
                return rand.nextInt(20, 999999999); // Zombies : 20 à "immortel"
            case "vampire":
                return rand.nextInt(20, 999999999); // Vampires : 20 à "immortel"
            case "werewolf":
                return rand.nextInt(20, 150);
            case "reptilian":
                return rand.nextInt(20, 300);
            default:
                return rand.nextInt(18, 100); // Par défaut : 18 à 100 ans (pour les types inconnus)
        }
    }
}
