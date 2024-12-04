package creatures;

import FonctionNotable.Death;
import FonctionNotable.Scream;
import FonctionNotable.Wait;
import hospital.MedicalServices.MedicalService;

public class Reptilian extends Creature implements Death, Wait, Scream {

    public Reptilian(String name, String sex, int weight, int size, int age, MedicalService medicalService) {
        super("Reptilian", name, sex, weight, size, age, 80, false, medicalService);
    }

    @Override
    public void die() {
        medicalService.removeCreature(this);
    }

    @Override
    public void scream() {
        if (getMoralIndicator() < 15) {
            System.out.println(getName() + " :  Ssssssssssss");
        }
    }

    @Override
    public void waiting() {
        this.setMoralIndicator(getMoralIndicator() - 10);
    }
}
