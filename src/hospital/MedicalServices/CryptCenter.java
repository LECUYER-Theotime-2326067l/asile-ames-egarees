package hospital.MedicalServices;

import FonctionNotable.Revive;
import creatures.Creature;

public class CryptCenter extends MedicalService {

    public CryptCenter(String name, double surfaceArea, int maxNumberOfCreatures, BudgetType budget) {
        super(name, surfaceArea, maxNumberOfCreatures, budget);
    }

    @Override
    public void addCreature(Creature creature) {
        try {
            Revive revive = (Revive) creature;
        } catch (ClassCastException e) {
            return;
        }
        super.addCreature(creature);
    }

}
