package creatures;

import FonctionNotable.Death;
import FonctionNotable.Scream;
import FonctionNotable.Wait;
import hospital.MedicalServices.MedicalService;

public class Dwarf extends Creature implements Death, Wait, Scream {

    public Dwarf(String name, String sex, int weight, int size, int age, MedicalService medicalService) {
        super("Dwarf", name, sex, weight, size, age, 100, false, medicalService);
    }

    @Override
    public void die() {
        this.medicalService.removeCreature(this);
    }

    @Override
    public void scream() {
        if (getMoralIndicator() < 15) {
            System.out.println(getName() + " :  Ce *** ose me faire attendre ?! QUEL FILS DE [ceci a été volontairement censuré].");
        }
    }

    @Override
    public void waiting() {
        this.setMoralIndicator(getMoralIndicator() - 10);
    }

    @Override
    public String toString() {
        return "Dwarf" + super.toString();
    }
}
