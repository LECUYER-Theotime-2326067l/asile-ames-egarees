package hospital;

import creatures.Creatures;
import creatures.Sickness;

import java.util.ArrayList;
import java.util.Random;

public class MedicalService {
    private String name;
    private double surfaceArea;
    private int maxNumberOfCreatures;
    private int numberOfPresentCreatures;
    private ArrayList<Creatures> creatures;
    private String budget;
    private ArrayList<Sickness> sickness;

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public ArrayList<Creatures> getCreatures() {
        return creatures;
    }

    public void setCreatures(ArrayList<Creatures> creatures) {
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

    public void caracteristics(MedicalService medicalService, ArrayList<Creatures> creatures) {
        System.out.println("Nom du service : " +medicalService.getName()+", " +
                "superficie : "+medicalService.getSurfaceArea()+
                ", peut accueillir au maximum "+medicalService.getMaxNumberOfCreatures()+
                        " créatures, les créatures présentes : "+medicalService.getCreatures()+".");


        for(int i=0; i<creatures.size(); i++){
            System.out.println(creatures.get(i).getName()+
                    " de sexe "+creatures.get(i).getSex()+
                    ", son indicateur de moral est à "+creatures.get(i).getMoralIndicator()+
                    ", pèse "+creatures.get(i).getWeight()+
                    " kg, mesure "+creatures.get(i).getHeight()+
                    " et ses maladies sont "+creatures.get(i).getSicknessList()+".");
        }
    }
    public ArrayList<Creatures> addCreatures(Creatures creature) {
        creatures.add(creature);
        System.out.println(creature.getName()+" vient d'arriver.");
        return creatures;
    }
    public ArrayList<Creatures> removeCreatures(Creatures creature) {
        creatures.remove(creature);
        System.out.println(creature.getName()+" est parti.");
        return creatures;
    }
    public Creatures healCreatures(Creatures creatures, Sickness sickness){
        creatures.loseSickness(this.sickness);
        return creatures;
    }
    public String reviewBudget(String budget){
        // faire un random de string pour que le budget prenne une valeur aléatoire entre inexistant, insuffisant, faible et médiocre
        this.budget = budget;
        return budget;
    }
}
