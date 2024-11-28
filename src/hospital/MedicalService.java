package hospital;

import creatures.Creature;
import DonneNotable.Disease;

import java.util.ArrayList;
//import java.util.Random;

public class MedicalService {
    private String name;
    private double surfaceArea;
    private int maxNumberOfCreatures;
    private int numberOfPresentCreatures;
    private ArrayList<Creature> creatures;
    private String budget;
    private MedicalService medicalService;

    public MedicalService(String name, double surfaceArea, int maxNumberOfCreatures, String budget) {
        this.name = name;
        this.surfaceArea = surfaceArea;
        this.maxNumberOfCreatures = maxNumberOfCreatures;
//        this.creatures = new ArrayList<>();
        this.budget = budget;
    }
    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    // méthode getCreatures doit récupérer les créatures qui sont présentes dans un même service médical
    public ArrayList<Creature> getCreatures(MedicalService medicalService) {
        if(/*condition à définir*/){
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
    public int addCreatures(Creature creature) {
        creatures.add(creature);
        System.out.println(creature.getName()+" vient d'arriver.");
        return getNumberOfPresentCreatures()+1;
    }
    public void removeCreatures(Creature creature) {
        creatures.remove(creature);
        System.out.println(creature.getName()+" est parti.");
        int present = getNumberOfPresentCreatures() - 1;
    }
    public Creature healCreatures(Creature creature, Disease disease){
        ArrayList<Disease> list = creature.getDiseaseList();
        creature.loseSickness(list, disease);
        return creature;
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
        if(/*créature régénérante*/){
            creaturesInCrypt.add(creature);
        }
        return creaturesInCrypt;
    }
}
