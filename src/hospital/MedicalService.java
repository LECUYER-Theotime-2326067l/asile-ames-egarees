package hospital;

import creatures.Creature;
import DonneNotable.*;

import java.util.ArrayList;

public class MedicalService {
    private String name;
    private double surfaceArea;
    private int maxNumberOfCreatures;
    private final int numberOfPresentCreatures;
    private ArrayList<Creature> creatures;
    private String budget;
    private MedicalService medicalService;
    private int zombieNumber;
    private int orcNumber;

    public MedicalService(String name, double surfaceArea, int maxNumberOfCreatures, String budget) {
        this.name = name;
        this.surfaceArea = surfaceArea;
        this.maxNumberOfCreatures = maxNumberOfCreatures;
        this.creatures = new ArrayList<>();
        this.budget = budget;
        this.numberOfPresentCreatures = 0;
        this.zombieNumber = 0;
        this.orcNumber = 0;
    }
    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    // méthode getCreatures doit récupérer les créatures qui sont présentes dans un même service médical
    public ArrayList<Creature> getCreatures(MedicalService medicalService) {
        if(medicalService!=null) {
            for(Creature creature : creatures) {
                creature.toString();
            }
        }
        return creatures;
    }

    public void setCreatures(ArrayList<Creature> creatures) {
        this.creatures = creatures;
    }


    public int getNumberOfPresentCreatures() {
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
        characteristics = medicalService.toString();
        System.out.println(characteristics);
        for(int i=0; i<creatures.size(); i++){
            System.out.println(creatures.get(i).toString());
        }
        return characteristics;
    }

    public int getZombieNumber() {
        return zombieNumber;
    }

    public void setZombieNumber(int zombieNumber) {
        this.zombieNumber = zombieNumber;
    }

    public int addCreatures(Creature creature) {
        creatures.add(creature);
        System.out.println(creature.getName()+" vient d'arriver.");
        if(creature.getClass().equals("Zombie")){
            zombieNumber++;
        } else if(creature.getClass().equals("Orc")){
            orcNumber++;
        }
        return getNumberOfPresentCreatures()+1;
    }

    public void removeCreatures(Creature creature) {
        creatures.remove(creature);
        System.out.println(creature.getName()+" est parti.");
        int present = getNumberOfPresentCreatures() - 1;
    }

    public String reviewBudget(String budget){
        // le budget doit prendre une valeur pas aléatoire entre inexistant, insuffisant, faible et médiocre
        this.budget = budget;
        return budget;
    }

    public ArrayList<Creature> quarantine(Creature creature){
        ArrayList<Creature> creaturesInQuarantine = new ArrayList<>();
        if(creature.isContagious()){
            creaturesInQuarantine.add(creature);
        }
        return creaturesInQuarantine;
    }

    public ArrayList<Creature> crypt(Creature creature){
        ArrayList<Creature> creaturesInCrypt = new ArrayList<>();
        if(creature.getClass().equals("Zombie")||creature.getClass().equals("Vampire")){
            creaturesInCrypt.add(creature);
        }
        return creaturesInCrypt;
    }
    public String getAllCreatures(){
        for(Creature creature : creatures){
            System.out.println(creature.toString()+"\n");
        }
        return "\n";
    }
    public int getOrcNumber() {
        return orcNumber;
    }
}
