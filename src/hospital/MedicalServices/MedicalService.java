package hospital.MedicalServices;

import DonneNotable.Disease;
import creatures.Creature;

import java.util.ArrayList;

public abstract class MedicalService {

    private final String name;
    private final double surfaceArea;
    private final int maxNumberOfCreatures;
    private final ArrayList<Creature> creatures;
    private int numberOfPresentCreatures;
    private BudgetType budget;

    public MedicalService(String name, double surfaceArea, int maxNumberOfCreatures, BudgetType budget) {
        this.name = name;
        this.surfaceArea = surfaceArea;
        this.maxNumberOfCreatures = maxNumberOfCreatures;
        this.creatures = new ArrayList<>();
        this.budget = budget;
        this.numberOfPresentCreatures = 0;
    }

    // characteristics
    public void characteristics() {
        System.out.println("Nom: " + name);
        System.out.println("Superficie : " + surfaceArea);
        System.out.println("Nombre maximum de créatures : " + maxNumberOfCreatures);
        System.out.println("Nombre actuel de créatures : " + numberOfPresentCreatures);
        System.out.println("Budget : " + budget);
    }

    public String getName() {
        return name;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public int getMaxNumberOfCreatures() {
        return maxNumberOfCreatures;
    }

    public int getNumberOfPresentCreatures() {
        return numberOfPresentCreatures;
    }

    public ArrayList<Creature> getCreatures() {
        return creatures;
    }

    public BudgetType getBudget() {
        return budget;
    }

    public void addCreature(Creature creature) {
        if (this.getNumberOfPresentCreatures() + 1 < this.getMaxNumberOfCreatures()) {
            this.creatures.add(creature);
            this.numberOfPresentCreatures = creatures.size();
        }
    }

    public void removeCreature(Creature creature) {
        if (!this.creatures.contains(creature)) {
            System.out.println(creature.getName() + " is not in the medical service " + name);
            return;
        }
        this.creatures.remove(creature);
        this.numberOfPresentCreatures = creatures.size();
    }

    public void cureCreature(Creature creature, Disease disease) {
        if (creatures.contains(creature)) {
            creature.healCreature(disease);
        }
    }

    public void updateBudget(BudgetType budget) {
        this.budget = budget;
    }

    public enum BudgetType {
        INEXISTANT,
        MEDIOCRE,
        INSUFFISANT,
        FAIBLE
    }

}
