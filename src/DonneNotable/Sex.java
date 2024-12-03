package DonneNotable;

import java.util.Random;

public class Sex {
    private static String sex;
    private static final Random rand = new Random();

    public static String generateSex() {
        String[] listeSex = {
                "H", "F"
        };
        sex = listeSex[rand.nextInt(listeSex.length)];
        return sex;
    }

    public static void setSex(String sex) {
        Sex.sex = sex;
    }
}
