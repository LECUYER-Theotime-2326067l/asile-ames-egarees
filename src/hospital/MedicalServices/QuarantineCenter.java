package hospital.MedicalServices;

import creatures.Creature;

public class QuarantineCenter extends MedicalService {

    public QuarantineCenter(String name, double surfaceArea, int maxNumberOfCreatures, BudgetType budget) {
        super(name, surfaceArea, maxNumberOfCreatures, budget);
    }

    @Override
    public void addCreature(Creature creature) {
        if (!creature.isContagious()) return;
        super.addCreature(creature);
    }

}
