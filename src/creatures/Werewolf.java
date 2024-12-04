package creatures;

//import FonctionNotable.Scream;

import FonctionNotable.Scream;
import FonctionNotable.Wait;
import hospital.MedicalServices.MedicalService;

public class Werewolf extends Creature implements Wait, Scream {

    public Werewolf(String name, String sex, int weight, int size, int age, MedicalService medicalService) {
        super("Werewolf", name, sex, weight, size, age, 40, true, medicalService);
    }

    @Override
    public void scream() {
        if (getMoralIndicator() < 15) {
            System.out.println(getName() + " :  AOUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        }
    }

    @Override
    public void waiting() {
        int werewolfNumber = 0;
        for (Creature creature : this.medicalService.getCreatures()) {
            if (creature.getType().equalsIgnoreCase("Werewolf")) {
                werewolfNumber++;
            }
        }
        if (werewolfNumber > 1) {
            this.setMoralIndicator(getMoralIndicator() - 2);
        } else {
            this.setMoralIndicator(getMoralIndicator() - 5);
        }
    }
}
