package creatures;

import FonctionNotable.Death;
import FonctionNotable.Scream;
import FonctionNotable.Wait;
import hospital.MedicalServices.MedicalService;

public class Orc extends Creature implements Wait, Death, Scream {

    public Orc(String name, String sex, int weight, int size, int age, MedicalService medicalService) {
        super("Orc", name, sex, weight, size, age, 40, false, medicalService);
    }

    @Override
    public void die() {
        this.medicalService.removeCreature(this);
    }

    @Override
    public void waiting() {
        int orcNumber = 0;
        for (Creature creature : this.medicalService.getCreatures()) {
            if (creature.getType().equalsIgnoreCase("Orc")) {
                orcNumber++;
            }
        }
        if (orcNumber > 1) {
            this.setMoralIndicator(getMoralIndicator() - 2);
        } else {
            this.setMoralIndicator(getMoralIndicator() - 5);
        }
    }

    @Override
    public void scream() {
        if (getMoralIndicator() < 15) {
            System.out.println(getName() + " :  Ouaf!");
        }
    }

}
