package hospital;

import creatures.Creature;
import creatures.Sickness;

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

    public ArrayList<Creature> getCreatures() {
        return creatures;
    }

    public void setCreatures(ArrayList<Creature> creatures) {
        this.creatures = creatures;
    }

    public int getNumberOfPresentCreatures() {
        return numberOfPresentCreatures;
    }

    public void setNumberOfPresentCreatures(int numberOfPresentCreatures) {
        this.numberOfPresentCreatures = numberOfPresentCreatures;
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
        return creatures;
    }
    public ArrayList<Creature> removeCreatures(Creature creature) {
        creatures.remove(creature);
        System.out.println(creature.getName()+" est parti.");
        return creatures;
    }
    public Creature healCreatures(Creature creature, Sickness sickness){
        ArrayList<Sickness> list = creature.getSicknessList();
        creature.loseSickness(list,sickness);
        return creature;
    }
    public String reviewBudget(String budget){
        // faire un random de string pour que le budget prenne une valeur aléatoire entre inexistant, insuffisant, faible et médiocre
        this.budget = budget;
        return budget;
    }
}
