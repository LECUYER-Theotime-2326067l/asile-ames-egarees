package creatures;

//import FonctionNotable.Scream;

public class Werewolf extends Creature {
    private String ageCategory;
    private int strength;
    private int dominationFactor;
    private int dominationRank;
    private int level;
    private int impetuosityFactor;
    private String pack;

    public Werewolf(String name, String sex, double weight, double size, int age) {
        super(name, sex, weight, size, age, 40, true);
    }

    @Override
    public String toString() {
        return "Werewolf{" +
                "ageCategory='" + ageCategory + '\'' +
                ", strength=" + strength +
                ", dominationFactor=" + dominationFactor +
                ", dominationRank=" + dominationRank +
                ", level=" + level +
                ", impetuosityFactor=" + impetuosityFactor +
                ", pack='" + pack + '\'' +
                '}';
    }
}
