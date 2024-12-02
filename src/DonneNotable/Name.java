package DonneNotable;

import java.util.Random;

public class Name {
    private String name;
    private String abbreviatedName;
    private String fullName;
    private final Random rand = new Random();

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String nameMale() {
        String[] listeName = {
                "Pedro", "Pablo", "Picasso", "Poteto", "Palourde",
                "Tristanou", "Torentino", "Carlos", "Hazak", "Maxou",
                "Piksou", "Leon", "Lorent", "Titeuf", "Liam", "Noah", "Oliver", "Elijah", "James",
                "William", "Benjamin", "Lucas", "Henry", "Alexander",
                "Jack", "Daniel", "Matthew", "Samuel", "Sebastian", "Arannis", ""
        };
        this.name = listeName[rand.nextInt(listeName.length)];
        return this.name;
    }

    public String nameFemale() {
        String[] listeName = {
                "Sophia", "Emma", "Isabella", "Olivia", "Mia",
                "Amelia", "Charlotte", "Ava", "Chloe", "Luna",
                "Layla", "Zoe", "Aria", "Lily", "Aurora", "Pénélope", "Marilou", "Camélia", "Potiche", "Clarinette",
                "Biscotte", "Joséphine", "Papaye", "Fifinette", "Bulle",
                "Clémentine", "Rosinette", "Tartine", "Pirouette", "Zazou"
        };
        this.name = listeName[rand.nextInt(listeName.length)];
        return this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviatedName() {
        return abbreviatedName;
    }

    public void setAbbreviatedName(String abbreviatedName) {
        this.abbreviatedName = abbreviatedName;
    }
}
