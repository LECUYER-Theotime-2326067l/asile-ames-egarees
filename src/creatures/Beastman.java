package creatures;

import FonctionNotable.Death;
import FonctionNotable.Scream;
import FonctionNotable.Wait;
import hospital.MedicalServices.MedicalService;

public class Beastman extends Creature implements Wait, Death, Scream {

    public Beastman(String name, String sex, int weight, int size, int age, MedicalService medicalService) {
        super("Beastman", name, sex, weight, size, age, 60, true, medicalService);
    }

    //    public String getType(){
//        return type;
//    }
    @Override
    public void die() {
        this.medicalService.removeCreature(this);
    }

    @Override
    public void waiting() {
        int beastmanNumber = 0;
        for (Creature creature : this.medicalService.getCreatures()) {
            if (creature.getType().equalsIgnoreCase("Beastman")) {
                beastmanNumber++;
            }
        }
        if (beastmanNumber > 1) {
            this.setMoralIndicator(getMoralIndicator() - 2);
        } else {
            this.setMoralIndicator(getMoralIndicator() - 5);
        }
    }

    @Override
    public void scream() {
        if (getMoralIndicator() < 15) {
            System.out.println(getName() + " :  Grrrrrrrrrrrrrrrrr");
        }
    }

}
