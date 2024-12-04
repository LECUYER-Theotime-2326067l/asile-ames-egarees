package hospital;

import creatures.Creature;

import java.util.ArrayList;

public class MedicalService {
    private String name;
    private double surfaceArea;
    private int maxNumberOfCreatures;
    private static int numberOfPresentCreatures;
    private static ArrayList<Creature> creatures;
    private String budget;
//    private MedicalService medicalService;
    private static int zombieNumber;
    private static int orcNumber;
    private static int beastmanNumber;
    private static int werewolfNumber;

    ArrayList<Creature> creaturesInCrypt;
    ArrayList<Creature> creaturesInQuarantine;

    public MedicalService(String name, double surfaceArea, int maxNumberOfCreatures, String budget) {
        this.name = name;
        this.surfaceArea = surfaceArea;
        this.maxNumberOfCreatures = maxNumberOfCreatures;
        creatures = new ArrayList<>();
        this.budget = budget;
        numberOfPresentCreatures = 0;
        zombieNumber = 0;
        orcNumber = 0;
        beastmanNumber = 0;
        werewolfNumber = 0;

        this.creaturesInCrypt = new ArrayList<>();
        this.creaturesInQuarantine = new ArrayList<>();

    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    // méthode getCreatures doit récupérer les créatures qui sont présentes dans un même service médical
    public static void getCreatures(MedicalService medicalService) {
        if (medicalService != null) {
            for (Creature creature : creatures) {
                creature.toString();
            }
        }
    }

    public void setCreatures(ArrayList<Creature> creatures) {
        MedicalService.creatures = creatures;
    }


    public static int getNumberOfPresentCreatures() {
        return numberOfPresentCreatures;
    }

    public int getMaxNumberOfCreatures() {
        return maxNumberOfCreatures;
    }

    public void setMaxNumberOfCreatures(int maxNumberOfCreatures) {
        this.maxNumberOfCreatures = maxNumberOfCreatures;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Caractéristiques du Service Médical : " +
                "Nom : '" + name + '\n' +
                ", superficie : " + surfaceArea +
                ", nombre maximum de créatures : " + maxNumberOfCreatures +
                ", nombre de créatures présentes : " + numberOfPresentCreatures +
                ", Créatures présentes : " + creatures +
                ", budget : " + budget + '\n' +
                '.';
    }

    public String characteristics() {
        String characteristics;
        characteristics = toString();
        System.out.println(characteristics);
        for (Creature creature : creatures) {
            System.out.println(creature.toString());
        }
        return characteristics;
    }

    public static int getZombieNumber() {
        return zombieNumber;
    }

    public void setZombieNumber(int zombieNumber) {
        MedicalService.zombieNumber = zombieNumber;
    }

    public void setOrcNumber(int orcNumber) {
        MedicalService.orcNumber = orcNumber;
    }

    public static int getBeastmanNumber() {
        return beastmanNumber;
    }

    public void setBeastmanNumber(int beastmanNumber) {
        MedicalService.beastmanNumber = beastmanNumber;
    }

    public static int getWerewolfNumber() {
        return werewolfNumber;
    }

    public void setWerewolfNumber(int werewolfNumber) {
        MedicalService.werewolfNumber = werewolfNumber;
    }

    public void setNumberOfPresentCreatures(int numberOfPresentCreatures) {
        this.numberOfPresentCreatures = numberOfPresentCreatures;
    }

    public void addCreatures(Creature creature) {
        System.out.println(creature.getName() + " vient d'arriver.");
        switch (creature.getType()) {
            case "Zombie" -> {
                creatures.add(creature);
                zombieNumber++;
            }
            case "Orc" -> {
                creatures.add(creature);
                orcNumber++;
            }
            case "Beastman" -> {
                creatures.add(creature);
                beastmanNumber++;
            }
            case "Werewolf" -> {
                creatures.add(creature);
                werewolfNumber++;
            }
            default -> creatures.add(creature);
        }
        numberOfPresentCreatures = getNumberOfPresentCreatures() + 1;
    }

    public static void removeCreatures(Creature creature) {
        creatures.remove(creature);
        System.out.println(creature.getName() + " est parti.");
        numberOfPresentCreatures = getNumberOfPresentCreatures() - 1;
    }

    public String reviewBudget(String budget) {
        // le budget doit prendre une valeur pas aléatoire entre inexistant, insuffisant, faible et médiocre
        this.budget = budget;
        return budget;
    }

    public ArrayList<Creature> quarantine(Creature creature) {
        if (creature.isContagious()) {
            creaturesInQuarantine.add(creature);
//            numberOfPresentCreatures++;
        }
        return creaturesInQuarantine;
    }

    public ArrayList<Creature> crypt(Creature creature) {
        if (creature.getType().equals("Zombie") || creature.getType().equals("Vampire")) {
            creaturesInCrypt.add(creature);
//            numberOfPresentCreatures++;
        }
        return creaturesInCrypt;
    }

    public static ArrayList<Creature> getAllCreatures() {
        for (Creature creature : creatures) {
            System.out.println(creature.toString() + "\n");
        }
        return creatures;
    }

    public static int getOrcNumber() {
        return orcNumber;
    }
}
