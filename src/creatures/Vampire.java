package creatures;

import FonctionNotable.Death;
import FonctionNotable.Revive;
import FonctionNotable.Scream;
import FonctionNotable.Wait;
import hospital.MedicalServices.MedicalService;

public class Vampire extends Creature implements Death, Wait, Revive, Scream {

    public Vampire(String name, String sex, int weight, int size, int age, MedicalService medicalService) {
        super("Vampire", name, sex, weight, size, age, 120, true, medicalService);
    }

    @Override
    public void die() {
        if (getMoralIndicator() == 0) {
            revive();
        }
    }

    @Override
    public void scream() {
        if (getMoralIndicator() < 15) {
            System.out.println(getName() + " :  ...");
        }
    }

    @Override
    public void waiting() {
        this.setMoralIndicator(getMoralIndicator() - 10);
    }

    @Override
    public void revive() {
        this.setMoralIndicator(120);
    }
}
