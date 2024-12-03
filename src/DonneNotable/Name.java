package DonneNotable;

import java.util.Objects;
import java.util.Random;

public class Name {
    private static String name;
    private static final Random rand = new Random();

    public static String nameMale() {
        String[] listeName = {
                "Pedro", "Pablo", "Picasso", "Poteto", "Palourde",
                "Tristanou", "Torentino", "Carlos", "Hazak", "Maxou",
                "Piksou", "Leon", "Lorent", "Titeuf", "Liam", "Noah",
                "Oliver", "Elijah", "James",
                "William", "Benjamin", "Lucas", "Henry", "Alexander",
                "Jack", "Daniel", "Matthew", "Samuel", "Sebastian",
                "Arannis", "Durin", "Dupont",
                "Grom", "Drogar", "Grunk", "Morkar", "Balar", "Ferk",
                "Zed", "Raze", "Jax", "Jack",
                "Lucien", "Draken", "Valerius", "Alaric", "Zephyr",
                "Vladimir", "Draxar", "Fenrir",
                "Ulfric", "Korrin"
        };
        name = listeName[rand.nextInt(listeName.length)];
        return name;
    }

    public static String nameFemale() {
        String[] listeName = {
                "Sophia", "Emma", "Isabella", "Olivia", "Mia",
                "Amelia", "Charlotte", "Ava", "Chloe", "Luna",
                "Layla", "Zoe", "Aria", "Lily", "Aurora", "Pénélope", "Marilou",
                "Camélia", "Potiche", "Clarinette",
                "Biscotte", "Joséphine", "Papaye", "Fifinette", "Bulle",
                "Clémentine", "Rosinette", "Tartine", "Pirouette", "Zazou",
                "Aeliana", "Celebrielle", "Elaria", "Galadrielle",
                "Bruni", "Balina", "Thalia", "Dorama", "Gilda", "Ragna",
                "Norina", "Lurga", "Urka", "Zorra", "Draga", "Thalira",
                "Grissa", "Morgana", "Lilith", "Trina", "Isabella", "Morgane",
                "Raven", "Seraphina", "Valentina", "Freya",
                "Astrid", "Lyra", "Sigrid", "Thessa", "Zylara"
        };
        name = listeName[rand.nextInt(listeName.length)];
        return name;
    }

    public static String generateName(String sex) {
        if (Objects.equals(sex, "H")){
            name = nameMale();
        }
        else if (Objects.equals(sex, "F")){
            name = nameFemale();
        }
        else {
            name = "Error Name";
        }
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
