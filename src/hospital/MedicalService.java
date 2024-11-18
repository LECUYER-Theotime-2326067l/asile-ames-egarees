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

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public ArrayList<Creature> getCreatures(MedicalService medicalService) {
        for(Creature creature : creatures) {
            creature.getAge();
            creature.getWeight();
            creature.getSex();
            creature.getSicknessList();
            creature.getMoralIndicator();
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

    public String caracteristics() {
        String caracteristics;
        caracteristics = medicalService.toString();
        System.out.println(caracteristics);
        for(int i=0; i<creatures.size(); i++){
            System.out.println(creatures.get(i).toString());
        }
        return caracteristics;
    }
    public ArrayList<Creature> addCreatures(Creature creature) {
        creatures.add(creature);
        System.out.println(creature.getName()+" vient d'arriver.");
        int present = getNumberOfPresentCreatures()+1;
        return creatures;
    }
    public ArrayList<Creature> removeCreatures(Creature creature) {
        creatures.remove(creature);
        System.out.println(creature.getName()+" est parti.");
        int present = getNumberOfPresentCreatures() - 1;
        return creatures;
    }
    public Creature healCreatures(Creature creature, Disease disease){
        ArrayList<Disease> list = creature.getSicknessList();
        creature.loseSickness(list, disease);
        return creature;
    }
    public String reviewBudget(String budget){
        // le budget doit prendre une valeur pas aléatoire entre inexistant, insuffisant, faible et médiocre
        this.budget = budget;
        return budget;
    }
    public void quarantine(){

    }
}
