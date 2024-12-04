package creatures;

import FonctionNotable.Death;
import FonctionNotable.Revive;
import FonctionNotable.Scream;
import FonctionNotable.Wait;
import hospital.MedicalServices.MedicalService;

public class Zombie extends Creature implements Revive, Death, Wait, Scream {

    public Zombie(String name, String sex, int weight, int height, int age, MedicalService medicalService) {
        super("Zombie", name, sex, weight, height, age, 100, false, medicalService);
    }

    @Override
    public void die() {
        if (getMoralIndicator() == 0) {
            revive();
        }
    }

    @Override
    public void revive() {
        setMoralIndicator(100);
    }

    @Override
    public void waiting() {
        int zombieNumber = 0;
        for (Creature creature : this.medicalService.getCreatures()) {
            if (creature.getType().equalsIgnoreCase("Zombie")) {
                zombieNumber++;
            }
        }
        if (zombieNumber > 1) {
            this.setMoralIndicator(getMoralIndicator() - 2);
        } else {
            this.setMoralIndicator(getMoralIndicator() - 5);
        }
    }

    @Override
    public void scream() {
        if (getMoralIndicator() < 15) {
            System.out.println(getName() + " :  Uhhhhhh... Argh ohhh.");
        }
    }

}
