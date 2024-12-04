package creatures;

import FonctionNotable.Death;
import FonctionNotable.Demoralise;
import FonctionNotable.Scream;
import FonctionNotable.Wait;
import hospital.MedicalServices.MedicalService;

public class Elf extends Creature implements Death, Scream, Wait, Demoralise {
    MedicalService medicalService;

    public Elf(String name, String sex, int weight, int height, int age, MedicalService medicalService) {
        super("Elf", name, sex, weight, height, age, 100, false, medicalService);
    }

    @Override
    public void die() {
        for (int i = 0; i <= 3; i++) {
            demoraliseAllCreatures();
        }
        this.medicalService.removeCreature(this);
    }

    @Override
    public void scream() {
        if (getMoralIndicator() < 10) {
            System.out.println(getName() + " :  [censuré].");
        }
    }

    @Override
    public void waiting() {
        this.setMoralIndicator(getMoralIndicator() - 10);
    }

    @Override
    public void demoraliseAllCreatures() {
        for (Creature creature : medicalService.getCreatures()) {
            creature.setMoralIndicator(creature.getMoralIndicator() - 2);
        }
    }
}
